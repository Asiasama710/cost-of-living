package interactor

import interactor.util.formatSentence
import model.CityEntity

class GetCityThatMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countries: List<String>): CityEntity? {
        val myCitiesData = dataSource.getAllCitiesData()
            .filter { excludeNullMealsPrices(it) && compareCountries(it.country, countries) }
            .sortedBy { getAverageMealPrice(it) }
        myCitiesData.map { println(it) }
        return if (myCitiesData.isNotEmpty()) myCitiesData[(myCitiesData.size / 2)] else null
    }

    private fun excludeNullMealsPrices(city: CityEntity): Boolean {
        return with(city.mealsPrices) {
            mealInexpensiveRestaurant != null &&
                    mealAtMcDonaldSOrEquivalent != null &&
                    mealFor2PeopleMidRangeRestaurant != null
        }
    }

    private fun getAverageMealPrice(city: CityEntity): Float {
        return (minMealPrice(city) + maxMealPrice(city)).div(2)
    }

    private fun compareCountries(country: String, countries: List<String>): Boolean {
        return countries.any { it.formatSentence() == country.formatSentence() }
    }

    fun minMealPrice(city: CityEntity): Float {
        return with(city.mealsPrices) {
            minOf(
                mealAtMcDonaldSOrEquivalent!!,
                mealFor2PeopleMidRangeRestaurant!!.div(2),
                mealInexpensiveRestaurant!!
            )
        }
    }

    fun maxMealPrice(city: CityEntity): Float {
        return maxOf(
            city.mealsPrices.mealAtMcDonaldSOrEquivalent!!,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2),
            city.mealsPrices.mealInexpensiveRestaurant!!
        )
    }


}
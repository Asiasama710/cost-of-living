package interactor

import model.CityEntity

class GetCityThatMatchManagerExpectationsInteractor(
private val dataSource: CostOfLivingDataSource
)
{
    fun execute(country: String): CityEntity? {
        val myCitiesData: List<CityEntity> = dataSource
            .getAllCitiesData()
            .filter{excludeNullMealsPricesAndLowQualityData(it) && it.country == filteringBasedOnCountry(country)}
            .filter(::takeIfAverageMealPriceIsBetweenMinAndMax)
            .sortedBy { getAverageMealPrice(it) }
        if (myCitiesData.isNotEmpty()) return myCitiesData[myCitiesData.size / 2]
        return null
    }
    private fun excludeNullMealsPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null &&
               city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
               city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null &&
               city.dataQuality
    }

    fun minMealPrice(city: CityEntity): Float = minOf(
            city.mealsPrices.mealAtMcDonaldSOrEquivalent!!,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2),
            city.mealsPrices.mealInexpensiveRestaurant!!
        )

    fun maxMealPrice(city: CityEntity): Float = maxOf(
        city.mealsPrices.mealAtMcDonaldSOrEquivalent!!,
        city.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2),
        city.mealsPrices.mealInexpensiveRestaurant!!
    )

    fun filteringBasedOnCountry(country: String) =
        country.takeIf { it in listOf("United States", "Canada", "Mexico") }


    private fun getAverageMealPrice(city: CityEntity): Float =
        (minMealPrice(city) + maxMealPrice(city)).div(2)

    private fun takeIfAverageMealPriceIsBetweenMinAndMax(city: CityEntity) : Boolean =
       getAverageMealPrice(city) in minMealPrice(city)..maxMealPrice(city)
}
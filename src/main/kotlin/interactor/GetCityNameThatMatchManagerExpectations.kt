package interactor

import model.CityEntity
import model.MealsPrices
import kotlin.String as String

class GetCityNameThatMatchManagerExpectations (
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(price: Float): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter { excludeNullMealsPricesAndLowQualityData(it) }
            .filter { price in minAndMaxPrice(it).first()..minAndMaxPrice(it).last() }
            .map { it.cityName }
    }

     fun excludeNullMealsPricesAndLowQualityData(city: CityEntity): Boolean {
        return  city.mealsPrices.mealAtMcDonaldSOrEquivalent != null
                && city.mealsPrices.mealInexpensiveRestaurant != null
                && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null && city.dataQuality
    }

    private fun minAndMaxPrice(city: CityEntity): List<Float> {
        val minPrice = minOf(
            city.mealsPrices.mealAtMcDonaldSOrEquivalent!!,
            (city.mealsPrices.mealFor2PeopleMidRangeRestaurant!! / 2), city.mealsPrices.mealInexpensiveRestaurant!!
        )
        val maxPrice = maxOf(
            city.mealsPrices.mealAtMcDonaldSOrEquivalent,
            (city.mealsPrices.mealFor2PeopleMidRangeRestaurant / 2), city.mealsPrices.mealInexpensiveRestaurant
        )
        return listOf(minPrice, maxPrice)
    }



}

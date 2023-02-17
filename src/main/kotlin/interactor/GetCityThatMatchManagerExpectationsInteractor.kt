package interactor

import model.CityEntity

class GetCityThatMatchManagerExpectationsInteractor(
private val dataSource: CostOfLivingDataSource
) {
    fun execute(): List<CityEntity> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullMealsPricesAndLowQualityData)

    }
    private fun excludeNullMealsPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null &&
               city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
               city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null &&
               city.dataQuality
    }
}

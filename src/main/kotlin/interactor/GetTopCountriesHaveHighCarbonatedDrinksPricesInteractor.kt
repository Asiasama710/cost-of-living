package interactor

import model.CityEntity

class GetTopCountriesHaveHighCarbonatedDrinksPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(limit: Int): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullDrinkPriceAndQualityData)
            .groupBy { it.country }
            .mapValues { (_, value) ->
                value.map {
                    it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!
                }.sum().div(value.size)
            }
            .entries.sortedByDescending { it.value }
            .takeWhile { limit in 1..10 }
            .map{Pair(it.key,it.value)}
    }

    private fun excludeNullDrinkPriceAndQualityData(city: CityEntity): Boolean {
        return with(city) {
            drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                    && dataQuality
        }
    }
}

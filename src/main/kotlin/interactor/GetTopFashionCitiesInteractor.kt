package interactor

import model.CityEntity
import model.ClothesPrices

class GetTopFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int) =
             dataSource.getAllCitiesData()
            .asSequence()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy(::getClothesAveragePrice)
            .take(limit)
            .map { it.cityName }
            .toList()


    private fun excludeNullPricesAndLowQualityData(city: CityEntity) =
        city.let {
           it.clothesPrices.getAllNotNullClothesPrices().isNotEmpty() && it.dataQuality
        }


    private fun getClothesAveragePrice(city: CityEntity) = city.clothesPrices.getAllNotNullClothesPrices().average().toFloat()

}



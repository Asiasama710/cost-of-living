package interactor

import EmptyDataException
import interactor.util.Constants.DATA_IS_EMPTY
import interactor.util.formatSentence
import model.CityEntity


class GetCitiesNamesSortedByCheapestBananaPricesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(vararg cities: String): List<String> {
        return dataSource
            .getAllCitiesData()
            .takeIf { it.isNotEmpty()}
            ?.filter {
                excludeNullBananaPrices(it) &&
                compereCitiesNamesWithInputCities( cities.toList(), it.cityName ,)
            }
            ?.sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            ?.map { it.cityName }
            ?: throw EmptyDataException(DATA_IS_EMPTY)
    }


    private fun compereCitiesNamesWithInputCities(cities: List<String>, city: String): Boolean {
        return cities
            .map { it.formatSentence() }
            .contains(city.formatSentence())
    }

    private fun excludeNullBananaPrices(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

}

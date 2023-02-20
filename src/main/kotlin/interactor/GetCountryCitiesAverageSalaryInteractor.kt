package interactor

import EmptyDataException
import interactor.util.Constants.DATA_IS_EMPTY
import interactor.util.isEquals
import model.CityEntity

class GetCountryCitiesAverageSalaryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .takeIf { it.isNotEmpty()}
            ?.filter {
                it.country.isEquals(country) &&
                excludeNullSalariesAndLowQualityData(it)
            }
            ?.map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            ?: throw throw EmptyDataException(DATA_IS_EMPTY)
    }


    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.let {
            it.averageMonthlyNetSalaryAfterTax != null &&
            it.dataQuality
        }
    }

}



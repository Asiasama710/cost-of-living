package interactor

import DataException
import EmptyDataException
import interactor.util.Constants
import interactor.util.checkNumber
import interactor.util.formatSentence
import interactor.util.toDiv
import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(countryName: String): CityEntity {
        return dataSource
            .getAllCitiesData()
            .takeIf { it.isNotEmpty()}
            ?.filter {
                countryName.formatSentence() == it.country.lowercase() &&
                excludeNullAndIncorrectInternetPriceAndSalary(it)
            }
            ?.minByOrNull { calculatingThePercentageOfTheInternetPriceFromTheSalary(it) }
            ?: throw EmptyDataException(Constants.DATA_IS_EMPTY)

    }

    private fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return city.let {
            it.averageMonthlyNetSalaryAfterTax.checkNumber() &&
            it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl.checkNumber()
        }

    }

    private fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float {
        return city.run {
            servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
            .toDiv(averageMonthlyNetSalaryAfterTax!!)
        }
    }
}
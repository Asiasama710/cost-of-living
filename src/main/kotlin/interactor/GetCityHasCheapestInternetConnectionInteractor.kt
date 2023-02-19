package interactor

import interactor.util.checkNumber
import interactor.util.formatSentence
import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(countryName: String): CityEntity? {
        return dataSource.getAllCitiesData().takeIf { countryName.formatSentence().isNotEmpty() }
            ?.filter {
                countryName.formatSentence() == it.country.lowercase() &&
                        excludeNullAndIncorrectInternetPriceAndSalary(it)
            }
            ?.minByOrNull { calculatingThePercentageOfTheInternetPriceFromTheSalary(it) }

    }

    private fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return with(city) {
            averageMonthlyNetSalaryAfterTax.checkNumber()
                    && servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl.checkNumber()
        }

    }

    private fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float {
        return city.run {
            servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!.div(averageMonthlyNetSalaryAfterTax!!)
        }
    }
}
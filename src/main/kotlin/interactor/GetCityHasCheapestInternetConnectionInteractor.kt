package interactor

import interactor.util.checkNumber
import interactor.util.formatSentence
import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(countryName: String): CityEntity? {
        return if (countryName.formatSentence().isNotEmpty())
            dataSource.getAllCitiesData()
                .filter {
                    countryName.formatSentence() == it.country.lowercase() &&
                            excludeNullAndIncorrectInternetPriceAndSalary(it)
                }
                .minByOrNull { calculatingThePercentageOfTheInternetPriceFromTheSalary(it) }
        else return null
    }

    private fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax.checkNumber()
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl.checkNumber()
    }

    private fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float {
        val salary = city.averageMonthlyNetSalaryAfterTax
        val internetPrice = city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
        return internetPrice!!.div(salary!!)
    }
}
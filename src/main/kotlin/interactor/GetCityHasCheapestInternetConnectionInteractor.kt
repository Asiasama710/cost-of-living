package interactor

import interactor.util.Constants.HIGHEST_POSSIBLE_PERCENTAGE_FOR_CHEAP_INTERNET
import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return try {
            dataSource.getAllCitiesData().filter {
                excludeNullAndIncorrectInternetPriceAndSalary(it) &&
                        calculatingThePercentageOfTheInternetPriceFromTheSalary(it)!! <= HIGHEST_POSSIBLE_PERCENTAGE_FOR_CHEAP_INTERNET
            }.sortedBy(::calculatingThePercentageOfTheInternetPriceFromTheSalary).first()
        } catch (e: Exception) {
            null
        }

    }


    // exclude null and negative and zero
    fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return ((city.averageMonthlyNetSalaryAfterTax != null) && (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
                && (city.averageMonthlyNetSalaryAfterTax > 0)
                && (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl > 0))
    }

    fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float? {
        val salary = city.averageMonthlyNetSalaryAfterTax
        val internetPrice = city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
        return if (salary != null && internetPrice != null && salary > 0 && internetPrice > 0)
            (internetPrice.div(salary)).times(100) else null
    }

}
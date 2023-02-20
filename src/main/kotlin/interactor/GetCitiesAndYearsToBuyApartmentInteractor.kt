package interactor
import LimitException
import interactor.util.Constants.LIMIT_LESS_THAN_ZERO
import interactor.util.Constants.ONE_HUNDRED_SQUARE_METER
import interactor.util.Constants.TWELVE_MONTH
import model.CityEntity
import interactor.util.toDiv
import interactor.util.toYear


class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource ,
) {

    fun execute(limit: Int) : Map<String, String> {
        return dataSource
                .getAllCitiesData()
                .filter(::excludeNullValueAndSalaryIsZeroAndLowQualityData)
                .sortedBy(::calculateYearsNeededToBuyApartment)
                .takeIf { limit > 0 }
                ?.take(limit)
                ?.associateBy (CityEntity::cityName , ::calculateYearsNeededToBuyApartment )
                ?: throw LimitException(LIMIT_LESS_THAN_ZERO)
    }


    private fun excludeNullValueAndSalaryIsZeroAndLowQualityData(city: CityEntity): Boolean {
        return city.let {
            it.dataQuality &&
            it.cityName.trim().isNotEmpty() &&
            it.averageMonthlyNetSalaryAfterTax != null &&
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
            it.averageMonthlyNetSalaryAfterTax > 0f
        }
    }

     fun calculateYearsNeededToBuyApartment(city: CityEntity): String {
        return city.run {
            (realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * ONE_HUNDRED_SQUARE_METER)
                .toDiv(averageMonthlyNetSalaryAfterTax!! * TWELVE_MONTH)
                .toYear()
        }
     }
}





package interactor

import LimitException
import interactor.util.Constants.LIMIT_LESS_THAN_ZERO
import model.CityEntity
import model.FruitAndVegetablesPrices


class GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(
    private val dataSource: CostOfLivingDataSource ,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndNullFruitVegetablePrices)
            .sortedBy {
                calculateFruitVegetableTotalPrice(it.fruitAndVegetablesPrices)
                .div(it.averageMonthlyNetSalaryAfterTax!!)
            }
            .takeIf { limit > 0 }
            ?.take(limit)
            ?.map { it.cityName }
            ?: throw LimitException(LIMIT_LESS_THAN_ZERO)
    }


    private fun excludeNullSalariesAndNullFruitVegetablePrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                with(city.fruitAndVegetablesPrices){
                    apples1kg!= null &&
                    banana1kg!= null &&
                    lettuceOneHead!= null &&
                    onion1kg!= null &&
                    oranges1kg!= null &&
                    potato1kg!= null &&
                    tomato1kg!= null
                }
    }

    private fun calculateFruitVegetableTotalPrice(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float {
        return with(fruitAndVegetablesPrices) {
                 apples1kg!! +
                 banana1kg!! +
                 lettuceOneHead!! +
                 onion1kg!! +
                 oranges1kg!! +
                 potato1kg!! +
                 tomato1kg!!
        }
    }

}
package interactor

import model.CityEntity

class GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullValue)
            .takeUnless { it.isEmpty() }
            ?.maxByOrNull { city -> city.averageMonthlyNetSalaryAfterTax!! * SALARY_DUPLICATED - calculateSavingPrices(city) }
    }

    private fun excludeNullValue(city: CityEntity): Boolean {
        return with(city) {
            foodPrices.chickenFillets1kg != null &&
                    foodPrices.localCheese1kg != null &&
                    foodPrices.riceWhite1kg != null &&
                    foodPrices.loafOfFreshWhiteBread500g != null &&
                    foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null &&
                    averageMonthlyNetSalaryAfterTax != null &&
                    realEstatesPrices.apartment3BedroomsInCityCentre != null
        }
    }

    private fun calculateSavingPrices(prices: CityEntity): Float {
        return with(prices) {
            foodPrices.chickenFillets1kg!! * CHICKEN_TEN_KG +
                    foodPrices.localCheese1kg!! +
                    foodPrices.riceWhite1kg!! * RICE_WHITE_TWO_KG +
                    foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * RED_MEET_FOUR_KG +
                    foodPrices.loafOfFreshWhiteBread500g!! / 1000 *  30 +
                    realEstatesPrices.apartment3BedroomsInCityCentre!! + PRICE_FOR_OTHER_TYPE_NEEDS
        }
    }

    companion object {
        private const val CHICKEN_TEN_KG = 10
        private const val RICE_WHITE_TWO_KG = 2
        private const val RED_MEET_FOUR_KG = 4
        private const val PRICE_FOR_OTHER_TYPE_NEEDS = 250
        private const val SALARY_DUPLICATED = 2

    }

}
package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetMostSuitableCityForFamilyWithMoreSavingMonthInteractorTest {

    // private val fakeData by lazy { FakeData() }
    private lateinit var fakeData: FakeData
    private lateinit var getMostSuitableCityForFamilyWithMoreSavingMonth: GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor

    @BeforeEach
    fun setUp() {

        fakeData = FakeData()
        getMostSuitableCityForFamilyWithMoreSavingMonth = GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor(fakeData)
    }

    @Test
    fun `should return null when there are no cities with complete data`() {
        // Given
        val incompleteCities = fakeData.getAllCitiesData().filter { city ->
            city.foodPrices.localCheese1kg == null ||
                    city.foodPrices.riceWhite1kg == null ||
                    city.realEstatesPrices.apartment3BedroomsInCityCentre == null
        }
      //  val getMostSuitableCityForFamilyWithMoreSavingMonth = GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(FakeData(incompleteCities))

        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then
        assertNull(result)
    }
    @Test
    fun `should return the city with the highest savings when data is available`() {
        // Given
        val expectedCity = fakeData.getAllCitiesData()
            .filter(::excludeNullValue)
            .maxByOrNull { city -> city.averageMonthlyNetSalaryAfterTax!! * SALARY_DUPLICATED - calculateSavingPrices(city) }

        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then
        assertNotNull(result)
        assertEquals(expectedCity, result)
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


}
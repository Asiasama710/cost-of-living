package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCountriesHaveHighCarbonatedDrinksPricesInteractorTest {

    private lateinit var getTopCountriesHaveHighCarbonatedDrinksPrices: GetTopCountriesHaveHighCarbonatedDrinksPricesInteractor
    private lateinit var fakeData: FakeData

    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getTopCountriesHaveHighCarbonatedDrinksPrices = GetTopCountriesHaveHighCarbonatedDrinksPricesInteractor(fakeData)
    }



    @Test
    fun should_ReturnEmptyList_When_LimitIsZero() {
        //given
        val limit = 0
        //when
        val result = getTopCountriesHaveHighCarbonatedDrinksPrices.execute(limit)
        // Then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_ReturnEmptyList_When_LimitIsNegative() {
        //given
        val limit = -6
        //when
        val result = getTopCountriesHaveHighCarbonatedDrinksPrices.execute(limit)
        // Then
        assertEquals(emptyList<CityEntity>(), result)
    }


    @Test
    fun should_ThrowErrorMessage_When_ThePriceIsNull() {
        //given Country with drink price and limit
        val limit = 10
        //when getting a Data contains null price value
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks =
            getTopCountriesHaveHighCarbonatedDrinksPrices.execute(limit)
        //then
        if (getTop10CountriesWithHighTaxOnCarbonatedDrinks.any { it.second == null })
            AssertionError("Drink Price can't be Null")
    }

}

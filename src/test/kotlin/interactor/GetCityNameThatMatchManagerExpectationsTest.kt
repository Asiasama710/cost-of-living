package interactor

import FakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class GetCityNameThatMatchManagerExpectationsTest {

    private lateinit var getCityNameThatMatchManagerExpectation : GetCityNameThatMatchManagerExpectations
    private lateinit var fakeData : FakeData
    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        getCityNameThatMatchManagerExpectation = GetCityNameThatMatchManagerExpectations(fakeData)
    }

    @Test
    fun should_ReturnCityName_When_MealPriceIsBetweenMinAndMaxPrice() {
        //given city meal price
        val cheapestMealPrice = 3F
        val expensiveMealPrice = 10F
        //when find the city name that the price meal in it is between min and max price
        val result = getCityNameThatMatchManagerExpectation.execute((cheapestMealPrice + expensiveMealPrice) / 2)
        val expected = fakeData.getAllCitiesData()
            .filter { it.mealsPrices.mealAtMcDonaldSOrEquivalent!! in cheapestMealPrice..expensiveMealPrice ||
                    (it.mealsPrices.mealFor2PeopleMidRangeRestaurant!! / 2) in cheapestMealPrice..expensiveMealPrice ||
                    it.mealsPrices.mealInexpensiveRestaurant!! in cheapestMealPrice..expensiveMealPrice }
            .map { it.cityName }
        //then
        assertEquals(expected,result)
    }
    @Test
    fun should_ReturnEmptyList_When_givenPriceNotHave_USAMexicoCanada() {
        // given
        val cheapestMealPrice = 3F
        val expensiveMealPrice = 10F
        val range: Float = (cheapestMealPrice + expensiveMealPrice) / 2
        //when find the city name that the price meal in it is between min and max price
        val result = getCityNameThatMatchManagerExpectation.execute(range)
        //then
        assertTrue(result.isEmpty())
    }
}





package interactor

import FakeData
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityThatMatchManagerExpectationsInteractorTest {
    private lateinit var getCityThatMatchManagerExpectationsInteractor: GetCityThatMatchManagerExpectationsInteractor
    private lateinit var fakeData: FakeData


    @BeforeAll
     fun setUp() {
        fakeData = FakeData()
        getCityThatMatchManagerExpectationsInteractor = GetCityThatMatchManagerExpectationsInteractor(fakeData)
    }
    @Test
    fun should_ReturnEmptyList_when_InputIsNotUnitedStatesOrCanadaOrMexico() {
        //give the country name
        val countryName = "iraq"
        //when the expected is empty list and the actual is the execute function
        val expected: List<String?> = emptyList()
        val actual= getCityThatMatchManagerExpectationsInteractor.execute(countryName)
        //then
        assertEquals(expected,actual)
    }
}
package interactor
import model.*
import fakeDataSource.FakeDataOfRentApartmentPrice
import fakeDataSource.NullData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {
    private val fakeDataSource by lazy { FakeDataOfRentApartmentPrice() }
    private lateinit var getCitiesHighestApartmentRent: GetHighestApartmentPriceDifferenceCityInteractor

    @BeforeAll
    fun setUp() {

        getCitiesHighestApartmentRent = GetHighestApartmentPriceDifferenceCityInteractor(fakeDataSource)
    }

    @Test
    fun should_ReturnCityWithHighestDifference_When_InputIsCorrect() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //then return the correct city
        assertEquals("Lannull", result)

    }

    @Test
    fun should_ReturnFalse_When_DataIsNotEmpty() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return false if data is empty
        assertFalse(result.isEmpty())
    }

    @Test
    fun should_ReturnTrue_When_DataIsNotBlank() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return true if data is not blank
        assertTrue(result.isNotBlank())
    }

    @Test
    fun should_ReturnCorrectCity_When_DataIsAvailable() {
        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()
        val expectedResult = fakeDataSource.getAllCitiesData()[1].cityName

        //Then assert result with except city
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnFalse_When_ThereRentPriceIsNull() {
        // When give a null data
        val getCitiesHighestApartmentRent= GetHighestApartmentPriceDifferenceCityInteractor(NullData())
        val result = getCitiesHighestApartmentRent.execute()

        // Then return false
        assertFalse(result.isEmpty())

    }
    @Test
    fun should_ReturnCityEntity_When_IsCorrectResult() {
        //when
        val result = getCitiesHighestApartmentRent.execute()
        val expectedResult = fakeDataSource.getAllCitiesData()[0].cityName

        // then check if the result equal to exceptCity
        assertNotEquals(expectedResult, result)
    }
    @Test
    fun should_ReturnNotNull_When_TheCityIsNotNull() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()
        //then return not null
        assertNotNull(result)
    }


}







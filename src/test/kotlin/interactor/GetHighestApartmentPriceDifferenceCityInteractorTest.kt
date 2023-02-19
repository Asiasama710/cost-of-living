package interactor
import FakeDataRentApartmentPrice
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {
    private val fakeDataSource by lazy { FakeDataRentApartmentPrice()}
    private lateinit var getCitiesHighestApartmentRent: GetHighestApartmentPriceDifferenceCityInteractor


    @BeforeAll
    fun setUp() {

        getCitiesHighestApartmentRent = GetHighestApartmentPriceDifferenceCityInteractor(fakeDataSource)
    }

    @Test
    fun should_ReturnCityWithHighestDifference_When_InputIsCorrect(){

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //then return the correct city
        assertEquals("Lannull",result)

    }

    @Test
    fun should_ReturnFalse_When_DataIsNotEmpty() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return false if data is empty
        assertFalse(result.isEmpty() )
    }

    @Test
    fun should_ReturnTrue_When_DataIsNotBlank(){

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return true if data is not blank
        assertTrue(result.isNotBlank() )
    }
    @Test
    fun should_ReturnCorrectCity_When_DataIsAvailable() {
        //given an except city
         val exceptCity=fakeDataSource.getAllCitiesData()[1].cityName

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then assert result with except city
        assertNotNull(result)
        assertEquals(exceptCity,result)
    }

}







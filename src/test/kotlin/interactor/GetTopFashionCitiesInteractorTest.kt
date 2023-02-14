package interactor

import FakeDataSource
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopFashionCitiesInteractorTest {

    private lateinit var fakeDataSource : FakeDataSource
    private lateinit var getTopFashionCities: GetTopFashionCitiesInteractor

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getTopFashionCities = GetTopFashionCitiesInteractor(fakeDataSource)
    }


    @Test
    fun should_ReturnCorrectList_When_HaveLimitValueMoreThanZero() {
        //given limit value > 0
        val limit = 4

        //when
        val result = getTopFashionCities.execute(limit)
        val expectedResult = listOf("Accra", "Multan", "Karachi", "Rawalpindi")

        //Then
        assertEquals(expectedResult, result)
    }


    @Test
    fun should_ReturnEmptyList_When_HaveLimitValueZero() {
        //given limit value = 0
        val limit = 0

        //when
        val result = getTopFashionCities.execute(limit)
        val expectedResult = emptyList<String>()

        //Then
        assertEquals(expectedResult, result)
    }


    @Test
    fun should_ThrowException_When_HaveNegativeLimitValue() {
        //given  limit value < 0
        val limit = -1

        //Then exception should be thrown
        assertThrows<IllegalArgumentException> { getTopFashionCities.execute(limit) }
    }
}

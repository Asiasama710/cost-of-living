package interactor

import fakeDataSource.FakeData
import fakeDataSource.FakeDataCityWithMoreSavingsForFamily
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.function.Executable

class GetMostSuitableCityForFamilyWithMoreSavingMonthInteractorTest {

    private val fakeData by lazy { FakeData() }

    private lateinit var getMostSuitableCityForFamilyWithMoreSavingMonth: GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor

    @BeforeEach
    fun setUp() {
        getMostSuitableCityForFamilyWithMoreSavingMonth = GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor(fakeData)
    }

    @Test
    fun should_ReturnThrowException_When_ThereIsACityWithIncompleteData() {
        // When
        val result  =  Executable { getMostSuitableCityForFamilyWithMoreSavingMonth.execute() }
        //then
        assertThrows( Exception::class.java ,result)
    }
    @Test
    @Disabled
    fun should_ReturnTheCityWithTheHighestSavings_When_DataIsAvailable() {
        // Given
        val expectedCity = fakeData.getAllCitiesData()[1]

        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then
        assertNotNull(result)
        assertEquals(expectedCity, result)
    }

    @Test
    fun should_ReturnThrowException_When_DataLessThan0() {
        // Given
        val expectedCity = fakeData.getAllCitiesData()[2]

        // When
        val result  =  Executable { getMostSuitableCityForFamilyWithMoreSavingMonth.execute() }
        //then
        assertThrows( Exception::class.java ,result)
    }


}


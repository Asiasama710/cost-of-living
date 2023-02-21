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
    fun should_ReturnNull_When_ThereIsACityWithIncompleteData() {
        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then
        assertNull(result)
    }
    @Test
    @Disabled
    fun should_ReturnTheCityWithTheHighestSavings_When_DataIsAvailable() {
        // Given
        val expectedCity = fakeData.getAllCitiesData()

        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then
        assertNotNull(result)
        assertEquals(expectedCity, result)
    }

    @Test
    fun should_ReturnNull_When_DataLessThan0() {
        // Given
        val expectedCity = fakeData.getAllCitiesData()[2]

        // When
        val result = getMostSuitableCityForFamilyWithMoreSavingMonth.execute()

        // Then

        assertNull(result)
    }


}


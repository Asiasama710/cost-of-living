package interactor

import FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetMostSuitableCityForFamilyWithMoreSavingMonthInteractorTest {

    private val fakeData by lazy { FakeData() }
    private lateinit var getMostSuitableCityForFamilyWithMoreSavingMonth: GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor

    @BeforeEach
    fun setUp() {
        getMostSuitableCityForFamilyWithMoreSavingMonth = GetMostSuitableCityForFamilyWithMoreSavingMonthInteractor(fakeData)
    }


}
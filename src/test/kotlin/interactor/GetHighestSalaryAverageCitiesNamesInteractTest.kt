package interactor

import FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestSalaryAverageCitiesNamesInteractTest {

    private lateinit var fakeDataSource : FakeDataSource
    private lateinit var getHighestSalaryAverageCitiesNames: GetHighestSalaryAverageCitiesNamesInteractor

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getHighestSalaryAverageCitiesNames = GetHighestSalaryAverageCitiesNamesInteractor(fakeDataSource)
    }

    @Test
    fun execute() {
    }
}
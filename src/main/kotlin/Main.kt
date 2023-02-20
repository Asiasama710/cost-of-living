import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCitiesNamesInteractor
import interactor.GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor
import interactor.GetCitiesAndYearsToBuyApartmentInteractor
import interactor.GetTopFashionCitiesInteractor
import interactor.GetCitiesNamesSortedByCheapestBananaPricesInteractor
import interactor.util.Constants.GET_CITIES_AND_YEARS_TO_BUY_APARTMENT
import interactor.util.Constants.GET_CITIES_NAMES_SORTED_BY_CHEAPEST_BANANA_PRICE
import interactor.util.Constants.GET_CITY_HAS_CHEAPEST_INTERNET_CONNECTION

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    printSeparationLine(message = "get Top Countries With High Tax On Carbonated Drinks")
    val getTopCountriesWithHighTaxOnCarbonatedDrinks= GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor(dataSource)
    println(getTopCountriesWithHighTaxOnCarbonatedDrinks.execute(limit = 10))
    printSeparationLine()

    printSeparationLine(message = "get Highest Salary Average Cities")
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCitiesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    printSeparationLine(message = "get City Has Highest Apartment Rent")
    val getCityHasHighestApartmentRent= GetHighestApartmentPriceDifferenceCityInteractor(dataSource)
    println( getCityHasHighestApartmentRent.execute())
    printSeparationLine()

    printSeparationLine(message = "get Top Fashion Cities")
    val getTopFashionCities = GetTopFashionCitiesInteractor(dataSource)
    println(getTopFashionCities.execute(limit = 5))
    printSeparationLine()

    printSeparationLine(message = GET_CITIES_NAMES_SORTED_BY_CHEAPEST_BANANA_PRICE)
    val getCitiesNamesSortedByCheapestBananaPrices = GetCitiesNamesSortedByCheapestBananaPricesInteractor(dataSource)
    println(getCitiesNamesSortedByCheapestBananaPrices.execute("Caracas","Accra","Giza"))
    printSeparationLine()

    printSeparationLine(message = GET_CITIES_AND_YEARS_TO_BUY_APARTMENT)
    val getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(dataSource)
    println(getCitiesAndYearsToBuyApartment.execute(limit = 10))
    printSeparationLine()

    printSeparationLine(message = "get Country Cities Average Salary")
    val getCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(dataSource)
    println(getCountryCitiesAverageSalary.execute("Syria"))
    printSeparationLine()

    printSeparationLine(message = "get Low Cost Fruit Vegetable Cities With High Salaries")
    val getLowCostFruitVegetableCitiesWithHighSalaries = GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(dataSource)
    println(getLowCostFruitVegetableCitiesWithHighSalaries.execute(10))
    printSeparationLine()

    printSeparationLine(message = "get The City That Match Manager Expectations")
    val getTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectationsInteractor(dataSource)
    println(getTheCityThatMatchManagerExpectations.execute())
    printSeparationLine()

    printSeparationLine(message = "get City Has Cheapest Internet Connection")
    val getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnection.execute("Iraq"))
    printSeparationLine()


}

private fun printSeparationLine(message : String = "_") {
    print("\n_____________${message}_________________\n")
}


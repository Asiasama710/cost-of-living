package interactor

import fakeDataSource.FakeDataCheapestInternet
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnection: GetCityHasCheapestInternetConnectionInteractor
    private val fakeData by lazy { FakeDataCheapestInternet() }

    @BeforeAll
    fun setup() {
        getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(fakeData)
    }

    @Test
    fun should_ReturnCityEntity_When_HaveACorrectCountryName() {
        //given correct country name
        val countryName = "Germany"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertEquals(city, result)
    }


    @Test
    fun should_ReturnCityEntity_When_HaveACorrectCountyNameWithWhiteSpaceOnTheEdges() {
        //given country name with white space
        val countryName = "    Germany   "
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertEquals(city, result)
    }

    @Test
    fun should_ReturnCityEntity_When_HaveACorrectCountyNameWithMultipleCharacterCase() {
        //given country name with multiple character case
        val countryName = "GerManY"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertEquals(city, result)
    }

    @Test
    fun should_ReturnCityEntity_When_HaveACorrectCountyNameWithWhiteSpaceAndMultipleCharacterCase() {
        //given country name with multiple character case and white space
        val countryName = "                  GErManY    "
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertEquals(city, result)
    }

    @Test
    fun should_ReturnNull_When_HaveAIncorrectCountryName() {
        //given Incorrect country name
        val countryName = "Garmany"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnNull_When_HaveASpaceInMiddleOfCountryName() {
        //given Incorrect country name
        val countryName = "Garm     any"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnNull_When_HaveAEmptyList() {
        //given correct country name with empty data source
        val getCityHasCheapestInternetConnection =
            GetCityHasCheapestInternetConnectionInteractor(object : CostOfLivingDataSource {
                override fun getAllCitiesData(): List<CityEntity> {
                    return emptyList()
                }
            })
        val countryName = "Germany"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertNull(result)
    }


    @Test
    fun should_ReturnNull_When_HaveACountryWithIncorrectDataInAllCities() {
        //given correct country name with all cities has incorrect data
        val countryName = "United Kingdom"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnNull_When_HaveCountryNameThatNotExist() {
        //given correct country name
        val countryName = "France"
        //when get the city that have the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute(countryName)
        //then
        assertNull(result)
    }

    companion object {
        private val city by lazy {
            CityEntity(
                cityName = "Russelsheim", country = "Germany",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.36f,
                    mealFor2PeopleMidRangeRestaurant = 10.85f,
                    mealAtMcDonaldSOrEquivalent = 3.25f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.46f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.35f,
                    waterAThirdOfLiterBottleInRestaurants = 0.18f,
                    milkRegularOneLiter = 1.15f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.4f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 4.27f,
                    banana1kg = 0.76f,
                    oranges1kg = 3.18f,
                    tomato1kg = 1.42f,
                    potato1kg = 1.02f,
                    onion1kg = 0.74f,
                    lettuceOneHead = 0.83f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.64f,
                    riceWhite1kg = 0.66f,
                    eggsRegular12 = 1.77f,
                    localCheese1kg = 7.4f,
                    chickenFillets1kg = 4.03f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 5.89f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 23.56f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 25.61f,
                    fitnessClubMonthlyFeeForOneAdult = 9.43f,
                    tennisCourtRentOneHourOnWeekend = 3.73f,
                    cinemaInternationalReleaseOneSeat = 2.37f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 26.55f,
                    internationalPrimarySchoolYearlyForOneChild = 425.77f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 20.59f,
                    oneSummerDressInAChainStoreZaraHAndM = 12.77f,
                    onePairOfNikeRunningShoesMidRange = 44.42f,
                    onePairOfMenLeatherBusinessShoes = 24.71f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.11f,
                    monthlyPassRegularPrice = 4.07f,
                    taxiStartNormalTariff = 0.27f,
                    taxi1kmNormalTariff = 0.27f,
                    taxi1hourWaitingNormalTariff = 0.49f,
                    gasolineOneLiter = 1.17f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 24406.97f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 28672.95f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 295.76f,
                    apartmentOneBedroomOutsideOfCentre = 109.14f,
                    apartment3BedroomsInCityCentre = 549.78f,
                    apartment3BedroomsOutsideOfCentre = 221.96f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1734.36f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1114.33f
                ),
                averageMonthlyNetSalaryAfterTax = 25000f, dataQuality = true
            )
        }

    }
}

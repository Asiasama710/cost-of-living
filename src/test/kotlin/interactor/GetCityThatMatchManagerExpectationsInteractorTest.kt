package interactor

import FakeData
import model.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityThatMatchManagerExpectationsInteractorTest {
    private lateinit var getCityThatMatchManagerExpectations: GetCityThatMatchManagerExpectationsInteractor
    private lateinit var fakeData: FakeData

    @BeforeAll
     fun setUp() {
        fakeData = FakeData()
        getCityThatMatchManagerExpectations = GetCityThatMatchManagerExpectationsInteractor(fakeData)
    }
    @Test
    fun should_ReturnEmptyList_when_InputIsNotUnitedStatesOrCanadaOrMexico() {
        //give
        val countryName = "iraq"
        //when
        val expected: List<String> = emptyList()
        val actual= getCityThatMatchManagerExpectations.execute(countryName)
        //then
        assertEquals(expected,actual)
    }

    @Test
    fun should_ReturnUnitedStatesOrCanadaOrMexico_when_InputIsUnitedStatesOrCanadaOrMexico() {
        //give
        val countriesName = listOf("United States", "Canada", "Mexico")
        //when
        val randomIndex = (countriesName.indices).random()
        val actual = getCityThatMatchManagerExpectations.filteringBasedOnCountry(countriesName[randomIndex])
        //then
        assert(countriesName.contains(actual))
    }

    @Test
    fun should_ReturnMinMealPrice_when_ReceivingCityEntityObject() {
        //give
        val city = CityEntity(
            cityName = "Canada", country = "torrent",
            mealsPrices = MealsPrices(mealInexpensiveRestaurant = 10.0f,
                mealFor2PeopleMidRangeRestaurant = 50.0f, mealAtMcDonaldSOrEquivalent = 11.0f),
            drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants = 1.74f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.12f,waterAThirdOfLiterBottleInRestaurants = 0.82f,
                milkRegularOneLiter = 1.84f, waterOneAndHalfLiterBottleAtTheMarket = 1.23f),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(apples1kg = 4.17f, banana1kg = 1.09f,
                oranges1kg = 1.52f, tomato1kg = 1.41f, potato1kg = 1.56f, onion1kg = 1.62f,
                lettuceOneHead = 1.03f),
            foodPrices = FoodPrices(loafOfFreshWhiteBread500g = 2.35f, riceWhite1kg = 1.14f,
                eggsRegular12 = 2.04f, localCheese1kg = 5.27f, chickenFillets1kg = 5.44f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.25f),
            servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 12.37f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.07f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 49.38f, fitnessClubMonthlyFeeForOneAdult = 45.64f,
                tennisCourtRentOneHourOnWeekend = 14.12f, cinemaInternationalReleaseOneSeat = 6.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 75.0f,
                internationalPrimarySchoolYearlyForOneChild = 6280.0f),
            clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar = 41.43f,
                oneSummerDressInAChainStoreZaraHAndM = 40.0f, onePairOfNikeRunningShoesMidRange = 70.83f,
                onePairOfMenLeatherBusinessShoes = 66.08f),
            transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport = 0.35f,
                monthlyPassRegularPrice = 30.0f, taxiStartNormalTariff = 4.0f, taxi1kmNormalTariff = 2.0f,
                taxi1hourWaitingNormalTariff = 11.0f, gasolineOneLiter = 0.5f),
            carsPrices = CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 32000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 34714.29f),
            realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre = 383.33f,
                apartmentOneBedroomOutsideOfCentre = 322.22f, apartment3BedroomsInCityCentre = 831.25f,
                apartment3BedroomsOutsideOfCentre = 587.5f,pricePerSquareMeterToBuyApartmentInCityCentre = 805.0f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1140.96f),
            averageMonthlyNetSalaryAfterTax = 185.12f, dataQuality = true)
        //when
        val actual = getCityThatMatchManagerExpectations.minMealPrice(city)
        val expected = city.mealsPrices.mealInexpensiveRestaurant
        //then
        assertEquals(expected,actual)
    }

    @Test
    fun should_ReturnMaxMealPrice_when_ReceivingCityEntityObject() {
        //give
        val city = CityEntity(
            cityName = "Canada", country = "torrent",
            mealsPrices = MealsPrices(mealInexpensiveRestaurant = 5.0f,
                mealFor2PeopleMidRangeRestaurant = 60.0f, mealAtMcDonaldSOrEquivalent = 21.0f),
            drinksPrices = DrinksPrices(cappuccinoRegularInRestaurants = 1.74f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 1.12f,waterAThirdOfLiterBottleInRestaurants = 0.82f,
                milkRegularOneLiter = 1.84f, waterOneAndHalfLiterBottleAtTheMarket = 1.23f),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(apples1kg = 4.17f, banana1kg = 1.09f,
                oranges1kg = 1.52f, tomato1kg = 1.41f, potato1kg = 1.56f, onion1kg = 1.62f,
                lettuceOneHead = 1.03f),
            foodPrices = FoodPrices(loafOfFreshWhiteBread500g = 2.35f, riceWhite1kg = 1.14f,
                eggsRegular12 = 2.04f, localCheese1kg = 5.27f, chickenFillets1kg = 5.44f,
                beefRound1kgOrEquivalentBackLegRedMeat = 6.25f),
            servicesPrices = ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 12.37f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.07f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 49.38f, fitnessClubMonthlyFeeForOneAdult = 45.64f,
                tennisCourtRentOneHourOnWeekend = 14.12f, cinemaInternationalReleaseOneSeat = 6.0f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 75.0f,
                internationalPrimarySchoolYearlyForOneChild = 6280.0f),
            clothesPrices = ClothesPrices(onePairOfJeansLevis50oneOrSimilar = 41.43f,
                oneSummerDressInAChainStoreZaraHAndM = 40.0f, onePairOfNikeRunningShoesMidRange = 70.83f,
                onePairOfMenLeatherBusinessShoes = 66.08f),
            transportationsPrices = TransportationsPrices(oneWayTicketLocalTransport = 0.35f,
                monthlyPassRegularPrice = 30.0f, taxiStartNormalTariff = 4.0f, taxi1kmNormalTariff = 2.0f,
                taxi1hourWaitingNormalTariff = 11.0f, gasolineOneLiter = 0.5f),
            carsPrices = CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 32000.0f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 34714.29f),
            realEstatesPrices = RealEstatesPrices(apartmentOneBedroomInCityCentre = 383.33f,
                apartmentOneBedroomOutsideOfCentre = 322.22f, apartment3BedroomsInCityCentre = 831.25f,
                apartment3BedroomsOutsideOfCentre = 587.5f,pricePerSquareMeterToBuyApartmentInCityCentre = 805.0f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 1140.96f),
            averageMonthlyNetSalaryAfterTax = 185.12f, dataQuality = true)
        //when
        val actual = getCityThatMatchManagerExpectations.maxMealPrice(city)
        val expected = city.mealsPrices.mealFor2PeopleMidRangeRestaurant?.div(2)
        //then
        assertEquals(expected,actual)
    }

}
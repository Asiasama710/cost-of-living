package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var getCityHasCheapestInternetConnection: GetCityHasCheapestInternetConnectionInteractor
    private lateinit var fakeData: FakeData


    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(fakeData)
    }

    companion object {
        @JvmStatic
        private fun valuesForInternetPriceAndSalary(): Stream<Arguments>    {
            return Stream.of(
                Arguments {
                    arrayOf(-50.0f, -2500.0f)
                },
                Arguments {
                    arrayOf(-50.0f, 2500.0f)
                },
                Arguments {
                    arrayOf(0.0f, 2500.0f)
                },
                Arguments {
                    arrayOf(50.0f, 0.0f)
                },
                Arguments {
                    arrayOf(0.0f, 0.0f)
                },
                Arguments {
                    arrayOf(null, 50.0f)
                },
                Arguments {
                    arrayOf(500.0f, null)
                },
                Arguments {
                    arrayOf(null, null)
                },
            )
        }

    }

    @Test
    fun should_ReturnTrue_when_CityHaveCorrectValueForInternetAndSalary() {
        //given city instance with correct value for internet and salary
        val city = fakeData.getAllCitiesData()[0]

        //when scan the city instance have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertTrue(result)

    }


    @ParameterizedTest
    @MethodSource("valuesForInternetPriceAndSalary")
    fun should_ReturnFalse_when_CityHaveAIncorrectInternetPriceAndSalary(internetPrice: Float?, salary: Float?) {
        //given city with incorrect data for internetPrice or salary
        val city = CityEntity(cityName="Colombo", country="Sri Lanka",
            mealsPrices=MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
            drinksPrices=DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
            fruitAndVegetablesPrices=FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
            foodPrices=FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
            servicesPrices=ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=internetPrice, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
            clothesPrices=ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
            transportationsPrices=TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
            carsPrices=CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
            realEstatesPrices=RealEstatesPrices(apartmentOneBedroomInCityCentre=295.76f, apartmentOneBedroomOutsideOfCentre=109.14f, apartment3BedroomsInCityCentre=549.78f, apartment3BedroomsOutsideOfCentre=221.96f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=1114.33f),
            averageMonthlyNetSalaryAfterTax=salary, dataQuality=true)

        //when calculate the percentage of internet price from salary
        val result = getCityHasCheapestInternetConnection.calculatingThePercentageOfTheInternetPriceFromTheSalary(city)
        //then
        assertNull(result)
    }

    @ParameterizedTest
    @MethodSource("valuesForInternetPriceAndSalary")
    fun should_ReturnNull_when_CityHaveAIncorrectInternetPriceAndSalary(internetPrice: Float?, salary: Float?) {
        //given city with instance value for internet
        val city = CityEntity(cityName="Colombo", country="Sri Lanka",
            mealsPrices=MealsPrices(mealInexpensiveRestaurant=1.36f, mealFor2PeopleMidRangeRestaurant=10.85f, mealAtMcDonaldSOrEquivalent=3.25f),
            drinksPrices=DrinksPrices(cappuccinoRegularInRestaurants=1.46f, cokePepsiAThirdOfLiterBottleInRestaurants=0.35f, waterAThirdOfLiterBottleInRestaurants=0.18f, milkRegularOneLiter=1.15f, waterOneAndHalfLiterBottleAtTheMarket=0.4f),
            fruitAndVegetablesPrices=FruitAndVegetablesPrices(apples1kg=4.27f, banana1kg=0.76f, oranges1kg=3.18f, tomato1kg=1.42f, potato1kg=1.02f, onion1kg=0.74f, lettuceOneHead=0.83f),
            foodPrices=FoodPrices(loafOfFreshWhiteBread500g=0.64f, riceWhite1kg=0.66f, eggsRegular12=1.77f, localCheese1kg=7.4f, chickenFillets1kg=4.03f, beefRound1kgOrEquivalentBackLegRedMeat=5.89f),
            servicesPrices=ServicesPrices(basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment=23.56f, oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans=0.01f, internet60MbpsOrMoreUnlimitedDataCableAdsl=internetPrice, fitnessClubMonthlyFeeForOneAdult=9.43f, tennisCourtRentOneHourOnWeekend=3.73f, cinemaInternationalReleaseOneSeat=2.37f, preschoolOrKindergartenFullDayPrivateMonthlyForOneChild=26.55f, internationalPrimarySchoolYearlyForOneChild=425.77f),
            clothesPrices=ClothesPrices(onePairOfJeansLevis50oneOrSimilar=20.59f, oneSummerDressInAChainStoreZaraHAndM=12.77f, onePairOfNikeRunningShoesMidRange=44.42f, onePairOfMenLeatherBusinessShoes=24.71f),
            transportationsPrices=TransportationsPrices(oneWayTicketLocalTransport=0.11f, monthlyPassRegularPrice=4.07f, taxiStartNormalTariff=0.27f, taxi1kmNormalTariff=0.27f, taxi1hourWaitingNormalTariff=0.49f, gasolineOneLiter=1.17f),
            carsPrices=CarsPrices(volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar=24406.97f, toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar=28672.95f),
            realEstatesPrices=RealEstatesPrices(apartmentOneBedroomInCityCentre=295.76f, apartmentOneBedroomOutsideOfCentre=109.14f, apartment3BedroomsInCityCentre=549.78f, apartment3BedroomsOutsideOfCentre=221.96f, pricePerSquareMeterToBuyApartmentInCityCentre=1734.36f, pricePerSquareMeterToBuyApartmentOutsideOfCentre=1114.33f),
            averageMonthlyNetSalaryAfterTax=salary, dataQuality=true)

        //when scan the city have a correct values for internet and salary
        val result = getCityHasCheapestInternetConnection.excludeNullAndIncorrectInternetPriceAndSalary(city)
        //then
        assertFalse(result)
    }


    @Test
    fun should_ReturnThePercentageOfInternetFromSalary_when_HaveCityWithCorrectInternetPriceAndSalary() {
        //given city with correct internetPrice and salary
        val city = fakeData.getAllCitiesData()[11]

        //when get a percentage of internet from salary
        val result = getCityHasCheapestInternetConnection.calculatingThePercentageOfTheInternetPriceFromTheSalary(city)
        //then
        assertEquals(168.9f, result)

    }

    @Test
    fun should_ReturnNull_When_NoCityHasACheapInternet() {
        //when get city which has the cheapest internet
        val result = getCityHasCheapestInternetConnection.execute()
        //then
        assertNull(result)
    }

}
package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataCityWithMoreSavingsForFamily : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf( CityEntity(
            cityName = "Giza", country = "Egypt",
            mealsPrices = MealsPrices(
                mealInexpensiveRestaurant = 4.48f,
                mealFor2PeopleMidRangeRestaurant = 10.17f,
                mealAtMcDonaldSOrEquivalent = 3.26f
            ),
            drinksPrices = DrinksPrices(
                cappuccinoRegularInRestaurants = 1.24f,
                cokePepsiAThirdOfLiterBottleInRestaurants = 0.22f,
                waterAThirdOfLiterBottleInRestaurants = 0.15f,
                milkRegularOneLiter = 0.71f,
                waterOneAndHalfLiterBottleAtTheMarket = 0.22f
            ),
            fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                apples1kg = 1.1f,
                banana1kg = 0.64f,
                oranges1kg = 0.39f,
                tomato1kg = 0.38f,
                potato1kg = 0.3f,
                onion1kg = 0.26f,
                lettuceOneHead = 0.15f
            ),
            foodPrices = FoodPrices(
                loafOfFreshWhiteBread500g = 0.41f,
                riceWhite1kg = null,
                eggsRegular12 = 1.16f,
                localCheese1kg = null,
                chickenFillets1kg = 3.65f,
                beefRound1kgOrEquivalentBackLegRedMeat = 7.34f
            ),
            servicesPrices = ServicesPrices(
                basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 41.97f,
                oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                internet60MbpsOrMoreUnlimitedDataCableAdsl = 14.19f,
                fitnessClubMonthlyFeeForOneAdult = 23.4f,
                tennisCourtRentOneHourOnWeekend = 5.09f,
                cinemaInternationalReleaseOneSeat = 4.68f,
                preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 91.16f,
                internationalPrimarySchoolYearlyForOneChild = 3255.83f
            ),
            clothesPrices = ClothesPrices(
                onePairOfJeansLevis50oneOrSimilar = 25.23f,
                oneSummerDressInAChainStoreZaraHAndM = 25.58f,
                onePairOfNikeRunningShoesMidRange = 108.72f,
                onePairOfMenLeatherBusinessShoes = 32.92f
            ),
            transportationsPrices = TransportationsPrices(
                oneWayTicketLocalTransport = 0.2f,
                monthlyPassRegularPrice = 12.21f,
                taxiStartNormalTariff = 0.31f,
                taxi1kmNormalTariff = 0.2f,
                taxi1hourWaitingNormalTariff = 1.22f,
                gasolineOneLiter = 0.38f
            ),
            carsPrices = CarsPrices(
                volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 18314.05f,
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 14500.08f
            ),
            realEstatesPrices = RealEstatesPrices(
                apartmentOneBedroomInCityCentre = 118.53f,
                apartmentOneBedroomOutsideOfCentre = 55.96f,
                apartment3BedroomsInCityCentre = 195.35f,
                apartment3BedroomsOutsideOfCentre = 150.58f,
                pricePerSquareMeterToBuyApartmentInCityCentre = 406.98f,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 228.93f
            ),
            averageMonthlyNetSalaryAfterTax = 171.51f, dataQuality = true
        ),
            CityEntity(
                cityName = "Accra", country = "Ghana",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 2.5f,
                    mealFor2PeopleMidRangeRestaurant = 26.79f,
                    mealAtMcDonaldSOrEquivalent = 4.46f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.46f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.51f,
                    waterAThirdOfLiterBottleInRestaurants = 0.17f,
                    milkRegularOneLiter = 1.19f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.28f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.45f,
                    banana1kg = 0.68f,
                    oranges1kg = 0.73f,
                    tomato1kg = 1.15f,
                    potato1kg = 1.24f,
                    onion1kg = 1.01f,
                    lettuceOneHead = 0.6f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 0.64f,
                    riceWhite1kg = 0.88f,
                    eggsRegular12 = 1.01f,
                    localCheese1kg = 6.91f,
                    chickenFillets1kg = 2.55f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 2.66f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 26.75f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.03f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 31.37f,
                    fitnessClubMonthlyFeeForOneAdult = 26.61f,
                    tennisCourtRentOneHourOnWeekend = 3.29f,
                    cinemaInternationalReleaseOneSeat = 3.93f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 51.34f,
                    internationalPrimarySchoolYearlyForOneChild = 4665.08f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 8.8f,
                    oneSummerDressInAChainStoreZaraHAndM = 7.95f,
                    onePairOfNikeRunningShoesMidRange = 18.87f,
                    onePairOfMenLeatherBusinessShoes = 22.25f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.41f,
                    monthlyPassRegularPrice = 18.21f,
                    taxiStartNormalTariff = 0.71f,
                    taxi1kmNormalTariff = 0.71f,
                    taxi1hourWaitingNormalTariff = 2.5f,
                    gasolineOneLiter = 0.65f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 5571.43f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 4275.51f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 589.26f,
                    apartmentOneBedroomOutsideOfCentre = 41.21f,
                    apartment3BedroomsInCityCentre = 1355.52f,
                    apartment3BedroomsOutsideOfCentre = 178.93f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 1156.33f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 5016.08f
                ),
                averageMonthlyNetSalaryAfterTax = 183.6f, dataQuality = true
            ),

            CityEntity(
                cityName = "Lahore", country = "Pakistan",
                mealsPrices = MealsPrices(
                    mealInexpensiveRestaurant = 1.56f,
                    mealFor2PeopleMidRangeRestaurant = 17.88f,
                    mealAtMcDonaldSOrEquivalent = 3.58f
                ),
                drinksPrices = DrinksPrices(
                    cappuccinoRegularInRestaurants = 1.81f,
                    cokePepsiAThirdOfLiterBottleInRestaurants = 0.23f,
                    waterAThirdOfLiterBottleInRestaurants = 0.17f,
                    milkRegularOneLiter = 0.69f,
                    waterOneAndHalfLiterBottleAtTheMarket = 0.31f
                ),
                fruitAndVegetablesPrices = FruitAndVegetablesPrices(
                    apples1kg = 1.2f,
                    banana1kg = 0.68f,
                    oranges1kg = 0.71f,
                    tomato1kg = 0.67f,
                    potato1kg = 0.33f,
                    onion1kg = 0.39f,
                    lettuceOneHead = 0.27f
                ),
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 13.7f,
                    riceWhite1kg = -2.5f,
                    eggsRegular12 = -4.14f,
                    localCheese1kg = 30.3f,
                    chickenFillets1kg = 22.0f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 3.19f
                ),
                servicesPrices = ServicesPrices(
                    basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment = 92.43f,
                    oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans = 0.01f,
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 23.83f,
                    fitnessClubMonthlyFeeForOneAdult = 16.09f,
                    tennisCourtRentOneHourOnWeekend = 8.26f,
                    cinemaInternationalReleaseOneSeat = 4.47f,
                    preschoolOrKindergartenFullDayPrivateMonthlyForOneChild = 56.01f,
                    internationalPrimarySchoolYearlyForOneChild = 1207.32f
                ),
                clothesPrices = ClothesPrices(
                    onePairOfJeansLevis50oneOrSimilar = 14.48f,
                    oneSummerDressInAChainStoreZaraHAndM = 25.47f,
                    onePairOfNikeRunningShoesMidRange = 54.62f,
                    onePairOfMenLeatherBusinessShoes = 37.77f
                ),
                transportationsPrices = TransportationsPrices(
                    oneWayTicketLocalTransport = 0.18f,
                    monthlyPassRegularPrice = 6.71f,
                    taxiStartNormalTariff = 0.67f,
                    taxi1kmNormalTariff = 0.22f,
                    taxi1hourWaitingNormalTariff = 2.12f,
                    gasolineOneLiter = 1.08f
                ),
                carsPrices = CarsPrices(
                    volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar = 13410.82f,
                    toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar = 18871.5f
                ),
                realEstatesPrices = RealEstatesPrices(
                    apartmentOneBedroomInCityCentre = 112.52f,
                    apartmentOneBedroomOutsideOfCentre = 70.74f,
                    apartment3BedroomsInCityCentre = -142.5f,
                    apartment3BedroomsOutsideOfCentre = 187.01f,
                    pricePerSquareMeterToBuyApartmentInCityCentre = 465.59f,
                    pricePerSquareMeterToBuyApartmentOutsideOfCentre = 306.08f
                ),
                averageMonthlyNetSalaryAfterTax = -12f, dataQuality = true
            ),

            )
    }
}
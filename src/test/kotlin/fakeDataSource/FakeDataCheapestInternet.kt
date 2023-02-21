package fakeDataSource

import interactor.CostOfLivingDataSource
import model.*

class FakeDataCheapestInternet : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return listOf(
            CityEntity(
                cityName = "Gaza", country = "Palestine",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.61f,
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
                averageMonthlyNetSalaryAfterTax = 156.15f, dataQuality = true
            ),
            CityEntity(
                cityName = "Ramalla", country = "Palestine",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 30.61f,
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
                averageMonthlyNetSalaryAfterTax = 3500.15f, dataQuality = true
            ),
            CityEntity(
                cityName = "Haifa", country = "Palestine",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 9.61f,
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
                averageMonthlyNetSalaryAfterTax = -2600f, dataQuality = true
            ),
            CityEntity(
                cityName = "Rafah", country = "Palestine",
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
                averageMonthlyNetSalaryAfterTax = null, dataQuality = true
            ),
            //--------------------------------------------------------------------------
            CityEntity(
                cityName = "Dortmund", country = "Germany",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = -9674f,
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
                averageMonthlyNetSalaryAfterTax = -87452f, dataQuality = true
            ),
            CityEntity(
                cityName = "Hannover", country = "Germany",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                averageMonthlyNetSalaryAfterTax = 60000f, dataQuality = true
            ),
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
            ),
            CityEntity(
                cityName = "Dresden", country = "Germany",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 0f,
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
                averageMonthlyNetSalaryAfterTax = 0f, dataQuality = true
            ),
            CityEntity(
                cityName = "Neu-Ulm", country = "Germany",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 800f,
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
                averageMonthlyNetSalaryAfterTax = 45000f, dataQuality = true
            ),
            //-------------------------------------------------- High Wycombe,United Kingdom
            CityEntity(
                cityName = "High Wycombe", country = "United Kingdom",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = 800f,
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
                averageMonthlyNetSalaryAfterTax = -45000f, dataQuality = true
            ),

            CityEntity(
                cityName = "Southwick", country = "United Kingdom",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                averageMonthlyNetSalaryAfterTax = 45000f, dataQuality = true
            ),CityEntity(
                cityName = "Southwick", country = "United Kingdom",
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
                    internet60MbpsOrMoreUnlimitedDataCableAdsl = null,
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
                averageMonthlyNetSalaryAfterTax = 0f, dataQuality = true
            ),
        )
    }
}
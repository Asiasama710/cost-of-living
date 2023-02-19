package model

data class ClothesPrices(
    val onePairOfJeansLevis50oneOrSimilar: Float?,
    val oneSummerDressInAChainStoreZaraHAndM: Float?,
    val onePairOfNikeRunningShoesMidRange: Float?,
    val onePairOfMenLeatherBusinessShoes: Float?,
)

fun ClothesPrices.getAllNotNullClothesPrices() = listOfNotNull(
    onePairOfJeansLevis50oneOrSimilar,
    onePairOfNikeRunningShoesMidRange,
    oneSummerDressInAChainStoreZaraHAndM,
    onePairOfMenLeatherBusinessShoes
)

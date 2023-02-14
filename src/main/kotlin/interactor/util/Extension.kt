package interactor.util

import interactor.util.Constants.VALUE_OF_PLURAL_YEARS
import interactor.util.Constants.YEARS
import interactor.util.Constants.YEAR
import interactor.util.Constants.DEFAULT_VALUE
import interactor.util.Constants.CANT_CATCH_INFO_OF_THIS_CITY
import java.lang.Float.POSITIVE_INFINITY


fun Float.toFormat(limit: Int = 1): Float? {
    return String.format("%.${limit}f", this).toFloatOrNull()
}

fun String.formatSentence(): String {
    return this.lowercase().trim().replace(Regex(" +"), " ")
}


fun Float.toDiv(dividedNumber: Float?): Float? {
    return dividedNumber?.let { this?.div(it).toFormat() }
}

fun Float.toYear(): String? {
    return if (this >= POSITIVE_INFINITY) CANT_CATCH_INFO_OF_THIS_CITY
    else  if (this >= VALUE_OF_PLURAL_YEARS) "$this $YEARS"
    else "$this $YEAR"
}
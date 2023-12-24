package identifier

import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import kotlin.js.JsName

interface IdentifierApiProvider {

    @JsName("settingsWithData")
    fun <R> settings(data: R): Later<IdentifierSettings<R>>
    fun settings() = settings(null)
}
@file:JsExport
package identifier

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BrandSocial(
    val handle: String,
    val icon: String
)
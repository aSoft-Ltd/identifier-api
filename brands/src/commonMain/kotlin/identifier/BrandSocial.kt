@file:JsExport
package identifier

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BrandSocial(
    val handle: String,
    val icon: String
)
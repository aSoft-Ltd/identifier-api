@file:JsExport
package identifier

import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BrandColor(
    val background: String,
    val foreground: String
)
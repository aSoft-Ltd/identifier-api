@file:JsExport
package identifier

import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class BrandColor(
    val background: String,
    val foreground: String
)
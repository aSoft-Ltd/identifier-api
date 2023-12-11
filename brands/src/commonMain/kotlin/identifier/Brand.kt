@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import kollections.List
import kotlinx.JsExport
import kotlinx.serialization.Serializable

@Serializable
data class Brand(
    val name: String,
    val logo: String,
    val domain: String,
    val color: BrandColor,
    val address: String,
    val socials: List<BrandSocial>
)
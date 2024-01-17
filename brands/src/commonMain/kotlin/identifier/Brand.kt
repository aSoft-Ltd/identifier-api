@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import kollections.List
import kollections.emptyList
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
) {
    companion object {
        val unbranded by lazy {
            val color = BrandColor(background = "#ffffff", foreground = "#000000")
            Brand(name="Unbranded",logo = "unbranded.logo", domain = "http://unbrand.ed",color, address = "Unbranded Address", emptyList())
        }
    }
}
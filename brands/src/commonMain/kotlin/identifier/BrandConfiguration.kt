package identifier

import kollections.List
import kollections.emptyList
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class BrandConfiguration(
    val name: String,
    val domain: String,
    val address: String,
    val color: BrandColor,
    @SerialName("social")
    val socials: List<BrandSocial> = emptyList()
) {
    fun toBrand() = Brand(
        name = name,
        logo = "/public/images/logo.png",
        domain = domain,
        address = address,
        color = color,
        socials = socials
    )
}
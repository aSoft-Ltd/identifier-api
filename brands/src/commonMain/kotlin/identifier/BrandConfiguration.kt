package identifier

import kollections.toIList
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
        logo = "$domain/public/images/logo.png",
        domain = domain,
        address = address,
        color = color,
        socials = socials.toIList()
    )
}
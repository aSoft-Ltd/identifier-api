@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import geo.GeoLocation
import kollections.iListOf
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class CorporateBranchDto(
    val name: String,
    val contacts: List<ContactDto> = iListOf(),
    val location: GeoLocation? = null,
    val address: String? = null,
)
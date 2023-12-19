@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import geo.GeoLocation
import kollections.listOf
import kollections.List
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class CorporateBranchDto(
    val name: String,
    val contacts: List<ContactDto> = listOf(),
    val location: GeoLocation? = null,
    val address: String? = null,
)
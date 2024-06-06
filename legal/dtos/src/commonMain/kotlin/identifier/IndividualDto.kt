@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import geo.GeoLocation
import kollections.listOf
import kollections.List
import kollections.filterIsInstance
import krono.LocalDate
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
data class IndividualDto(
    override val uid: String,
    override val name: String,
    override val image: String? = null,
    override val verified: Boolean = false,
    val title: String? = null,
    val dob: LocalDate? = null,
    val gender: Gender? = null,
    val comms: List<Comm> = listOf(),
    override val gid: String = UNSET,
    val idDocumentNumber: String? = null,
    val idDocumentType: DocumentType? = null,
    val location: GeoLocation? = null,
    val address: String? = null,
    override val creditAmount: Double? = null,
    override val creditUsed: Double? = null,
    override val leadTime: Int? = null,
) : LegalEntityDto() {
    val emails get() = comms.filterIsInstance<UserEmail>()
    val phones get() = comms.filterIsInstance<UserPhone>()
}
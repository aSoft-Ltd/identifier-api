@file:JsExport

package identifier

import geo.GeoLocation
import kollections.Map
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
sealed class LegalEntityDto {
    abstract val uid: String
    abstract val gid: String
    abstract val name: String
    abstract val image: String?
    abstract val verified: Boolean
    abstract val creditAmount: Double?
    abstract val creditUsed: Double?
    abstract val leadTime: Int?
    abstract val additionalInfo:AdditionalInfo
    abstract val category: LegalEntityCategory?
    abstract val plan: LegalEntityPlan?
    abstract val synced:Boolean
    val asIndividual get() = this as? IndividualDto

    val asCorporate get() = this as? CorporateDto

    val loc: GeoLocation?
        get() = when (this) {
            is CorporateDto -> headQuarters.location
            is IndividualDto -> location
        }
}
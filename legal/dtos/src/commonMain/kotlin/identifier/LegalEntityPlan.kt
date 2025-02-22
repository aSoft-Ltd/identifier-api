@file:JsExport

package identifier

import geo.GeoLocation
import kollections.Map
import kotlinx.serialization.Serializable
import kotlinx.JsExport

@Serializable
class LegalEntityPlan(
    val uid: String,
    val name: String
)

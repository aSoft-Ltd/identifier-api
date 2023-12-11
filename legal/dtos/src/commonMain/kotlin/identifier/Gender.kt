package identifier

import kotlinx.serialization.Serializable
import kotlinx.JsExport

@JsExport
@Serializable
enum class Gender {
    Male, Female
}
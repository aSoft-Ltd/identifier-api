@file:JsExport

package identifier.params

import kotlinx.JsExport

data class ContactParams(
    val name: String,
    val role: String? = null,
    val email: String? = null,
    val phone: String? = null,
)
@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import kotlinx.JsExport
import kollections.listOf
import kollections.List
import kollections.filterIsInstance
import kotlinx.serialization.Serializable

@Serializable
data class ContactDto(
    val uid: String,
    /**
     * Can be either
     * - Desk
     * - Support
     * - John
     */
    val name: String,
    val comms: List<Comm> = listOf(),
    val role: String? = null,
    val isPrimary: Boolean = true,
) {
    val emails get() = comms.filterIsInstance<UserEmail>()
    val phones get() = comms.filterIsInstance<UserPhone>()
}
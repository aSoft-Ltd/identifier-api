package identifier

import kotlinx.serialization.Serializable
import krono.LocalDate
import krono.LocalTime

@Serializable
data class AdditionalInfo(
    val date: Map<String, LocalDate?> = mapOf(),
    val time: Map<String, LocalDate?> = mapOf(),
    val string: Map<String, String?> = mapOf(),
    val int: Map<String, Int?> = mapOf(),
    val double: Map<String, Double?> = mapOf()
) {
}
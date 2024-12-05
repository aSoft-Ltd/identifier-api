package identifier

import kotlinx.serialization.Serializable

@Serializable
data class FieldInfo(
    val name:String,
    val label:String,
    val required:Boolean,
    val category: Category,
    val options:List<Option>?=null
) {

    @Serializable
    enum class Category {
        FREE_TEXT, DATE, TIME, NUMBER, CHOICE, INTEGER, BOOLEAN;

        val isFreeText get() = this == FREE_TEXT
        val isDate get() = this == DATE
        val isTime get() = this == TIME
        val isNumber get() = this == NUMBER
        val isChoice get() = this == CHOICE
        val isBoolean get() = this == BOOLEAN
    }

    @Serializable
    data class Option(
        val label: String,
        val value: String
    )
}
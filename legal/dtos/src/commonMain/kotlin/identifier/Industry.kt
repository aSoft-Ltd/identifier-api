package identifier

import kotlinx.serialization.Serializable
import kotlinx.JsExport
import kotlin.js.JsName

@Serializable
@JsExport
enum class Industry(val label: String) {
//    AUTOMOTIVE("Automotive"),
//    BASIC_MATERIALS("Basic Materials"),
//    BEAUTY_PRODUCTS("Beauty Products"),
//    CONSUMER_GOODS("Consumer Goods"),
//    CONSTRUCTION("Construction"),
//    CONSUMER_SERVICES("Consumer Services"),
//    EDUCATION("Education"),
//    ENERGY("Energy"),
//    ENTERTAINMENT("Entertaiment"),
//    FASHION("Fashion"),
//    FINANCIAL_SERVICES("Financial Services"),
//    FOOD_AND_BEVERAGE("Food and Beverage"),
//    HEALTH_CARE("Health Care"),
//    INDUSTRIALS("Industrials"),
//    MANUFACTURING("Manufacturing"),
//    OIL_AND_GAS("Oil and Gas"),
//    PROFESSIONAL_SERVICES("Professional Services"),
//    TECHNOLOGY("Technology"),
//    TOURISM("Tourism"),
//    TELECOMMUNICATIONS("Telecommunications"),
//    UTILITIES("Utilities"),
    AGRICULTURE_PRIMARY("Agriculture - Primary"),
    AGRICULTURE_SECONDARY("Agriculture - Secondary"),
    AUTOMOTIVE("Automotive"),
    MINING("Mining"),
    ENERGY("Energy"),
    TOURISM("Tourism"),
    INFORMATION_AND_COMMUNICATION_TECHNOLOGY("Information & Communication Technology"),
    EDUCATION("Education"),
    HEALTHCARE_AND_BIOTECHNOLOGY("Healthcare & Biotechnology"),
    FRANCHISE("Franchise"),
    ENTERTAINMENT_AND_MEDIA("Entertainment and Media"),
    HOSPITALITY("Hospitality"),
    ENGINEERING_AND_CONSTRUCTION("Engineering & Construction"),
    REAL_ESTATE("Real Estate"),
    FINANCIAL_SERVICES("Financial Services"),
    PROFESSIONAL_SERVICES("Professional Services (Agency & Consultancy)"),
    MANUFACTURING("Manufacturing"),
    TRANSPORTATION_AND_LOGISTICS("Transportation and Logistics"),
    RETAIL_AND_WHOLESALE("Retail & Wholesale"),
    OTHER("Other")
}
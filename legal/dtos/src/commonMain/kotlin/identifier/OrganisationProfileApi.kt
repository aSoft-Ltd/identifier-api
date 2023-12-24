@file:JsExport
@file:Suppress("NON_EXPORTABLE_TYPE")

package identifier

import epsilon.RawFile
import identifier.params.CorporateParams
import kash.Currency
import koncurrent.Later
import koncurrent.later.then
import koncurrent.later.andThen
import koncurrent.later.andZip
import koncurrent.later.zip
import koncurrent.later.catch
import kotlinx.JsExport

interface OrganisationProfileApi {

    fun update(params: CorporateParams): Later<CorporateDto>

    fun updateLogo(logo: RawFile): Later<CorporateDto>

    fun updateCurrency(currency: Currency): Later<Currency>

    fun updateTimezone(tz: String): Later<String>

    fun updateSalesTax(percentage: Int): Later<Int>
}
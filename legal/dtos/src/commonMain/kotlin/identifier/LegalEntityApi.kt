@file:JsExport

package identifier

import hormone.Deleter
import hormone.Loader
import kotlinx.JsExport

interface LegalEntityApi :
    Deleter<LegalEntityDto>,
    Loader<LegalEntityDto>
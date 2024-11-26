package com.inapp.ikonic_billing.model

import androidx.annotation.Keep
import com.android.billingclient.api.ProductDetails

/**
 * @author: Zeeshan
 * @date: 19/11/2024
 */

@Keep
data class IkBillingProduct(
    var subsKey: String = "",
    var productBasePlanKey: String = "",
    var productOfferKey: String = "",
    var title: String = "",
    var type: String = "",
    var duration: String = "",
    var price: String = "",
    var productDetailedInfo: ProductDetails? = null
)
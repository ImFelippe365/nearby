package com.felippe.nearby.ui.data.model

import kotlinx.serialization.Serializable

@Serializable
data class NearbyMarketDetails (
    val id: String,
    val categoryId: String,
    val name: String,
    val description: String,
    val couponsQuantity: Int,
    val rules: List<NearbyRule> = emptyList<NearbyRule>(),
    val latitude: Double,
    val longitude: Double,
    val address: String,
    val phone: String,
    val cover: String
) {


}
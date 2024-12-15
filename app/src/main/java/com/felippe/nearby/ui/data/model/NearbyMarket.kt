package com.felippe.nearby.ui.data.model

data class NearbyMarket (
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
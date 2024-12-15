package com.felippe.nearby.ui.data.model.mock

import com.felippe.nearby.ui.data.model.NearbyMarket

val mockMarkets = listOf(
    NearbyMarket(
        id = "1",
        categoryId = "1",
        name = "Mercado",
        description = "Mercado",
        couponsQuantity = 10,
        latitude = 0.0,
        longitude = 0.0,
        address = "Rua 1",
        phone = "123456789",
        cover = ""
    ),
    NearbyMarket(
        id = "2",
        categoryId = "2",
        name = "Padaria",
        description = "Padaria",
        couponsQuantity = 0,
        latitude = 0.0,
        longitude = 0.0,
        address = "Rua 2",
        phone = "123456789",
        cover = ""
    ),
)
package com.felippe.nearby.ui.component.marketdetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.felippe.nearby.ui.data.model.NearbyMarket
import com.felippe.nearby.ui.theme.Gray400
import com.felippe.nearby.ui.theme.Typography
import com.felippe.nearby.R
import com.felippe.nearby.ui.data.model.mock.mockMarkets
import com.felippe.nearby.ui.theme.Gray500


@Composable
fun NearbyMarketDetailsInfos(modifier: Modifier = Modifier, market: NearbyMarket) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_ticket),
                    contentDescription = "Ícone do cupom",
                    tint = Gray500
                )
                Text(
                    text = "${market.couponsQuantity} cupons disponíveis",
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    contentDescription = "Ícone do endereço",
                    tint = Gray500
                )
                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    contentDescription = "Ícone do telefone",
                    tint = Gray500
                )
                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500
                )
            }
        }
    }
}

@Preview
@Composable
private fun NearbyMarketDetailsInfosView() {
    NearbyMarketDetailsInfos(
        modifier = Modifier.fillMaxWidth(),
        market = mockMarkets.first()
    )
}
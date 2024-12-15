package com.felippe.nearby.ui.component.market

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felippe.nearby.ui.data.model.NearbyMarket
import com.felippe.nearby.ui.theme.Gray100
import com.felippe.nearby.ui.theme.Gray200
import com.felippe.nearby.R
import com.felippe.nearby.ui.theme.Gray400
import com.felippe.nearby.ui.theme.Gray500
import com.felippe.nearby.ui.theme.RedBase
import com.felippe.nearby.ui.theme.Typography

@Composable
fun NearbyMarketCard(
    modifier: Modifier = Modifier,
    market: NearbyMarket,
    onClick: (NearbyMarket) -> Unit
) {
    Card(
        modifier = modifier
            .clip(RoundedCornerShape(12.dp))
            .background(Gray100)
            .border(width = 1.dp, color = Gray200, shape = RoundedCornerShape(12.dp)),
        onClick = {
            onClick(market)
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Gray100)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .fillMaxWidth(0.3f)
                    .height(IntrinsicSize.Max)
                    .aspectRatio(ratio = 1f, matchHeightConstraintsFirst = true),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.img_burger),
                contentDescription = "Imagem do estabelecimento"
            )

            Column {
                Text(text = market.name, style = Typography.headlineSmall.copy(fontSize = 14.sp))
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = market.description,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    color = Gray500,
                    style = Typography.bodyLarge.copy(fontSize = 12.sp)
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Icon(
                        modifier = Modifier.size(24.dp),
                        tint = if (market.couponsQuantity > 0) RedBase else Gray400,
                        contentDescription = "Ícone de cupom",
                        painter = painterResource(id = R.drawable.ic_ticket)
                    )
                    Text(
                        text = "${market.couponsQuantity} cupons disponíveis",
                        color = Gray400,
                        style = Typography.bodyMedium.copy(fontSize = 12.sp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun NearbyMarketCardPreview() {
    NearbyMarketCard(
        modifier = Modifier.fillMaxWidth(),
        market = NearbyMarket(
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
        onClick = {}
    )
}
package com.felippe.nearby.ui.component.marketdetails

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.felippe.nearby.ui.data.model.NearbyRule
import com.felippe.nearby.ui.data.model.mock.mockMarkets
import com.felippe.nearby.ui.data.model.mock.mockRules
import com.felippe.nearby.ui.theme.Gray400
import com.felippe.nearby.ui.theme.Gray500
import com.felippe.nearby.ui.theme.Typography

@Composable
fun NearbyMarketDetailsRules(modifier: Modifier = Modifier, rules: List<NearbyRule>) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(text = "Regulamento", style = Typography.headlineSmall, color = Gray400)
        Text(
            modifier = Modifier.padding(start = 16.dp),
            text = rules.joinToString(separator = "\n", transform = { "• ${it.description}"}),
            style = Typography.labelMedium,
            lineHeight = 24.sp,
            color = Gray500
        )

    }
    
}

@Preview
@Composable
private fun NearbyMarketDetailsRulesPreview() {
    NearbyMarketDetailsRules(
        modifier = Modifier.fillMaxWidth(),
        rules = mockRules
    )
}
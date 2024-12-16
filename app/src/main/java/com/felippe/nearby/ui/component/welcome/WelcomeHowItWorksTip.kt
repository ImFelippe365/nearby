package com.felippe.nearby.ui.component.welcome

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.felippe.nearby.ui.theme.Gray500
import com.felippe.nearby.ui.theme.RedBase
import com.felippe.nearby.ui.theme.Typography

@Composable
fun WelcomeHowItWorksTip(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: String,
    @DrawableRes icon: Int
) {

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            contentDescription = "Ícone de como funciona",
            painter = painterResource(id = icon),
            tint = RedBase,
        )
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = title, style = Typography.headlineSmall)
            Text(text = subtitle, color = Gray500, style = Typography.headlineSmall)
        }
    }

}
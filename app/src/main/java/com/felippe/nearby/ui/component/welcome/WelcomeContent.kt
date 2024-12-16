package com.felippe.nearby.ui.component.welcome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.felippe.nearby.R
import com.felippe.nearby.ui.theme.Typography

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = "Veja como funciona: ", style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title =  "Encontre estabelecimentos",
            subtitle = "Veja locais pertos de você que são parcerios do Nearby",
            icon = R.drawable.ic_map_pin
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title =  "Ative o cupom com QR Code",
            subtitle = "Escaneie o código no estabelecimento para usar o beneficio",
            icon = R.drawable.ic_qrcode
        )
        WelcomeHowItWorksTip(
            modifier = Modifier.fillMaxWidth(),
            title =  "Garanta vantagem perto de você",
            subtitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimentos",
            icon = R.drawable.ic_ticket
        )
    }
}
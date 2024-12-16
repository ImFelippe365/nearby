package com.felippe.nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.felippe.nearby.ui.data.model.NearbyMarket
import com.felippe.nearby.ui.screen.HomeScreen
import com.felippe.nearby.ui.screen.MarketDetailsScreen
import com.felippe.nearby.ui.screen.SplashScreen
import com.felippe.nearby.ui.screen.WelcomeScreen
import com.felippe.nearby.ui.screen.route.Home
import com.felippe.nearby.ui.screen.route.Splash
import com.felippe.nearby.ui.screen.route.Welcome
import com.felippe.nearby.ui.theme.NearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NearbyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(
                            modifier = Modifier.fillMaxSize(),
                            onNavigateToWelcome = {
                                navController.navigate(Welcome)
                            }
                        )
                    }
                    composable<Welcome> {
                        WelcomeScreen(onNavigateToHome = {
                            navController.navigate(Home)
                        })
                    }
                    composable<Home> {
                        HomeScreen(onNavigateToMarketDetails = { market ->
                            navController.navigate(market)
                        })
                    }
                    composable<NearbyMarket> {
                        val selectedMarket = it.toRoute<NearbyMarket>()
                        MarketDetailsScreen(
                            market = selectedMarket,
                            onNavigateBack = { navController.popBackStack() })
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun MainActivityPreview() {

}
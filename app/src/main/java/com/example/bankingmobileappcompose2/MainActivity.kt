package com.example.bankingmobileappcompose2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingmobileappcompose2.ui.theme.BankingMobileAppCompose2Theme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bankingmobileappcompose2.cardSections.CardScreen
import com.example.bankingmobileappcompose2.configurationSections.ConfigurationScreen
import com.example.bankingmobileappcompose2.homeSections.CardsSection
import com.example.bankingmobileappcompose2.homeSections.HistorySection
import com.example.bankingmobileappcompose2.homeSections.ManagementSection


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankingMobileAppCompose2Theme {
                App()
            }
        }
    }
}


@Composable
fun App() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen() }
            composable("cards") { CardScreen() }
            composable("configuration") { ConfigurationScreen() }
        }
    }
}



@Preview
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){
            TopNavigationBar("Home")
            CardsSection()
            Spacer(modifier = Modifier.height(16.dp))
            ManagementSection()
            HistorySection()
        }
    }
}


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
import com.example.bankingmobileappcompose2.homeSections.CardsSection
import com.example.bankingmobileappcompose2.homeSections.HistorySection
import com.example.bankingmobileappcompose2.homeSections.ManagementSection


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BankingMobileAppCompose2Theme {
                HomeScreen()
            }
        }
    }
}



@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ){


            TopNavigationBar()
            CardsSection()
            Spacer(modifier = Modifier.height(16.dp))
            ManagementSection()
            HistorySection()
        }
    }
}


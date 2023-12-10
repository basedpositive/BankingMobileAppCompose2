package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.bankingmobileappcompose2.BottomNavigationBar
import com.example.bankingmobileappcompose2.TopNavigationBar
import com.example.bankingmobileappcompose2.configurationSections.ConfigurationSection
import com.example.bankingmobileappcompose2.data.Card
import com.example.bankingmobileappcompose2.homeSections.CardsSection
import com.example.bankingmobileappcompose2.homeSections.cards
import com.example.bankingmobileappcompose2.homeSections.getGradient
import com.example.bankingmobileappcompose2.ui.theme.OrangeEnd
import com.example.bankingmobileappcompose2.ui.theme.PurpleEnd
import com.example.bankingmobileappcompose2.ui.theme.PurpleStart
import com.example.bankingmobileappcompose2.ui.theme.RedStart

@Preview
@Composable
fun CardScreen() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { padding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
        ){

            TopNavigationBar("Cards")
            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                addCard(0)
                v_CardView(cards)
            }
        }
    }
}

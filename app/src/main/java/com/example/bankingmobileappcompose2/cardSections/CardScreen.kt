package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bankingmobileappcompose2.HomeScreen

import com.example.bankingmobileappcompose2.TopNavigationBar
import com.example.bankingmobileappcompose2.configurationSections.ConfigurationScreen

import com.example.bankingmobileappcompose2.homeSections.cards

object Routes {
    const val VIEW_CARDS = "view_cards"
    const val VIEW_ADD_CARDS = "view_add_cards"
}


@Composable
fun CardScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.VIEW_CARDS
    ) {
        composable(route = Routes.VIEW_CARDS) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ){

                TopNavigationBar("Cards")
                Spacer(modifier = Modifier.height(8.dp))

                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    addCard(navController)
                    v_CardView(cards)
                }
            }
        }
        composable(route = Routes.VIEW_ADD_CARDS) {
            addCardScreen()
        }
    }
}

@Composable
fun addCard(
    navController: NavHostController
) {
    Row(
        modifier = Modifier
            .padding(8.dp)
            .clickable { navController.navigate(Routes.VIEW_ADD_CARDS) },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            imageVector = Icons.Rounded.AddCircle,
            contentDescription = null,
            modifier = Modifier
        )

        Text(
            text = "Add card",
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

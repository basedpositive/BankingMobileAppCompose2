package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bankingmobileappcompose2.BottomNavigationBar
import com.example.bankingmobileappcompose2.TopNavigationBar
import com.example.bankingmobileappcompose2.homeSections.addNewCard

@Preview(showBackground = true)
@Composable
fun addCardScreen() {
    val navController = rememberNavController()
    Column(
        modifier = Modifier
            .fillMaxSize()
            ) {
                TopNavigationBar("Add Card")
                Spacer(modifier = Modifier.height(16.dp))

                Column(
                    modifier = Modifier
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    addCardSection(navController)
                }
    }
}
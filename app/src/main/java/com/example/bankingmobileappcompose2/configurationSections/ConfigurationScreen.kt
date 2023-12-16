package com.example.bankingmobileappcompose2.configurationSections

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.bankingmobileappcompose2.BottomNavigationBar
import com.example.bankingmobileappcompose2.TopNavigationBar


@Preview(showBackground = true)
@Composable
fun ConfigurationScreen() {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ){

            TopNavigationBar("Configuration")
            Spacer(modifier = Modifier.height(16.dp))
            ConfigurationSection()
    }
}
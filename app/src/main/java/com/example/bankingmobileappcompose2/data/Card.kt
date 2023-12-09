package com.example.bankingmobileappcompose2.data

import androidx.compose.ui.graphics.Brush

data class Card (
    val cardType: String,
    val cardNumber: String,
    val cardDate: String,
    val cardCode: String,
    val cardOwnerName: String,

    val cardColor: Brush
)
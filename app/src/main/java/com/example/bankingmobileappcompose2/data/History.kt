package com.example.bankingmobileappcompose2.data

data class History(
    val productType: String,
    val product: String,
    val productDate: org.threeten.bp.LocalDate,
    val productPrice: Double
)

package com.example.karenderiaapp.data


data class MenuItem(
    val name: String,
    val price: Double,
    val imageRes: Int
)


data class Order(
    val item: MenuItem,
    val quantity: Int
)
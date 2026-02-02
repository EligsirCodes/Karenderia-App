package com.example.karenderiaapp.data


data class MenuItem(
    val name: String,
    val price: Double
)


data class Order(
    val item: MenuItem,
    val quantity: Int
)
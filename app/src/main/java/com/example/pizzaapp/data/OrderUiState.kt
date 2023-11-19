package com.example.pizzaapp.data

data class OrderUiState(

    val quantity: Int = 0,

    val flavor: String = "",
    val dip : String = "",

    val date: String = "",

    val price: String = "",

    val pickupOptions: List<String> = listOf()
)

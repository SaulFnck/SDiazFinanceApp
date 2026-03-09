package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AutoStories
import androidx.compose.material.icons.rounded.Coffee
import androidx.compose.material.icons.rounded.Devices
import androidx.compose.material.icons.rounded.Fastfood
import androidx.compose.material.icons.rounded.LocalGasStation
import androidx.compose.material.icons.rounded.Restaurant
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material.icons.rounded.Smartphone
import androidx.compose.material.icons.rounded.Storefront
import androidx.compose.ui.graphics.vector.ImageVector

data class Transaction(
    val id: Int,
    val Establecimiento: String,
    val category: String,
    val monto: String, //Puede ser negativo
    val hora: String,
    val icon: ImageVector
)

//Categories = Groceries, Fuel, Food & Drinks, Electronics, Books, Dining

val transactions = listOf(
    Transaction(id = 1, Establecimiento = "SuperMarket", category = "Groceries", monto = "$45.99", hora = "10:00 AM", icon = Icons.Rounded.ShoppingCart),
    Transaction(id = 2, Establecimiento = "Shell Station", category = "Fuel", monto = "-$60.00", hora = "11:30 AM", icon = Icons.Rounded.LocalGasStation),
    Transaction(id = 3, Establecimiento = "Starbucks", category = "Food & Drinks", monto = "-$8.50", hora = "08:45 AM", icon = Icons.Rounded.Coffee),
    Transaction(id = 4, Establecimiento = "Best Buy", category = "Electronics", monto = "$450.00", hora = "02:15 PM", icon = Icons.Rounded.Devices),
    Transaction(id = 5, Establecimiento = "Barnes & Noble", category = "Books", monto = "-$25.00", hora = "05:00 PM", icon = Icons.Rounded.AutoStories),
    Transaction(id = 6, Establecimiento = "Italian Bistro", category = "Dining", monto = "$80.00", hora = "08:30 PM", icon = Icons.Rounded.Restaurant),
    Transaction(id = 7, Establecimiento = "Local Market", category = "Groceries", monto = "-$30.00", hora = "09:15 AM", icon = Icons.Rounded.Storefront),
    Transaction(id = 8, Establecimiento = "Cinema Snacks", category = "Food & Drinks", monto = "$20.00", hora = "07:00 PM", icon = Icons.Rounded.Fastfood),
    Transaction(id = 9, Establecimiento = "Texaco", category = "Fuel", monto = "-$45.00", hora = "04:45 PM", icon = Icons.Rounded.LocalGasStation),
    Transaction(id = 10, Establecimiento = "Apple Store", category = "Electronics", monto = "-$1,200.00", hora = "11:00 AM", icon = Icons.Rounded.Smartphone)
)

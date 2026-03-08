package com.example.financeapp.models

data class Transaction(
    val id: Int,
    val Establecimiento: String,
    val category: String,
    val monto: Double, //Puede ser negativo
    val hora: String,
    val image: String
)

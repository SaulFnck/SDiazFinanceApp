package com.example.financeapp.models

data class User(
    val id: Int,
    val name: String,
    val saldoActual: Double,
)

val users = listOf(
    User(id = 1, name = "Saul", saldoActual = 1000.0),
    User(id = 2, name = "Juan", saldoActual = 2000.0),
    User(id = 3, name = "Maria", saldoActual = 3000.0),
)

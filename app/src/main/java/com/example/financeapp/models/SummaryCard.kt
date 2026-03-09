package com.example.financeapp.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.financeapp.ui.theme.GreenCard
import com.example.financeapp.ui.theme.PurpleCard
import com.example.financeapp.ui.theme.YellowCard

data class SummaryCard(
    val id: Int,
    val title: String,
    val subtitle: String, //Monto o subtitulo
    val icon: ImageVector? = null, //Si no hay, es nulo
    val color: Color,
    val principalCard: Boolean = false,
    val modifier: Modifier = Modifier //Usar modifier que se pase en mainActivity
)

val summaryCards = listOf(
    SummaryCard(id = 1, title = "Actividad", subtitle = "De la semana", icon = Icons.Default.Face, color = GreenCard, principalCard = true),
    SummaryCard(id = 2, title = "Ventas", subtitle = "$280.99", color = YellowCard, principalCard = false),
    SummaryCard(id = 3, title = "Ganancias", subtitle = "$280.99", color = PurpleCard, principalCard = false)
)

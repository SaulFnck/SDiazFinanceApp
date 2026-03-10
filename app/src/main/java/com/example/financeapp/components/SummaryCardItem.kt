package com.example.financeapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.FinanceApp
import com.example.financeapp.models.SummaryCard
import com.example.financeapp.models.summaryCards
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.beish

@Composable
fun SummaryCardItem(cardItem: SummaryCard,modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(cardItem.color)
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        //Si tiene un icono
        if (cardItem.icon != null) {
            Icon(
                imageVector = cardItem.icon,
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
                    .padding(bottom = 5.dp),
                tint = MaterialTheme.colorScheme.onSurface
            )
        }

        Text(
            text= cardItem.title,
            fontSize = if(cardItem.principalCard) 20.sp else 15.sp,
            fontWeight = FontWeight.Bold,
            color = if(cardItem.principalCard) MaterialTheme.colorScheme.onSurface else MaterialTheme.colorScheme.onSurfaceVariant
        )

        Text(
            text = cardItem.subtitle,
            fontSize = if(cardItem.principalCard) 15.sp else 20.sp,
            fontWeight = if(cardItem.principalCard) FontWeight.ExtraBold else FontWeight.Bold,
            color = if(cardItem.principalCard) MaterialTheme.colorScheme.onSurfaceVariant else MaterialTheme.colorScheme.onSurface
        )

    }
}

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        FinanceAppTheme {
            SummaryCardItem(summaryCards[2])
        }
    }

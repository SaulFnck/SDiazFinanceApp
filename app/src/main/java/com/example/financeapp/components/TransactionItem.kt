package com.example.financeapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.financeapp.models.Transaction
import com.example.financeapp.models.summaryCards
import com.example.financeapp.models.transactions
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.beish

@Composable
fun TransactionItem(transaction: Transaction){

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    )
    {

        Row(
            modifier = Modifier
                .padding(10.dp)
        )
        {
            //Icono
            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = transaction.icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }

            //Texto
            Column(modifier = Modifier.padding(all = 5.dp))
            {
                Text(
                    text = transaction.Establecimiento,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Text(
                    text = transaction.category,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp,
                    color = Color.Gray
                )
            }
        }

        Column(
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(
                text = transaction.monto,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = transaction.hora,
                fontSize = 15.sp
            )
        }


    }


}

@Preview(showBackground = true)
@Composable
fun greetingPreview() {
    FinanceAppTheme {
        TransactionItem(transactions[3])
    }
}
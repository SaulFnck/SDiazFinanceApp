package com.example.financeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import com.example.financeapp.ui.theme.FinanceAppTheme
import com.example.financeapp.ui.theme.beish

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FinanceAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FinanceApp(innerPadding)
                }
            }
        }
    }
}

@Composable
fun FinanceApp(innerPadding: PaddingValues){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color.LightGray)
    ) {

        //Welcome
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween

        )
        {
            //Usuario
            Row(
                verticalAlignment = Alignment.CenterVertically,
            )
            {
                //Icono
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(beish),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Profile Picture",
                        modifier = Modifier.size(50.dp),
                        tint = Color.Black
                    )
                }


                Column(
                    modifier = Modifier
                        .padding(start = 12.dp)
                ) {
                    Text(
                        text = "Hola Saul",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 24.sp
                    )
                    Text(
                        text = "Bienvenido",
                        fontSize = 15.sp,
                        color = Color.Gray
                    )
                }


            }

            //Menu hamburguesa
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu",
                modifier = Modifier.size(30.dp),
                tint = Color.Black
            )
        }

        //SummaryCards
        Row() { }

        //Transactions
        Column() {
            Row() { }

            LazyColumn() { }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinanceAppTheme {
        FinanceApp(innerPadding = PaddingValues(25.dp))
    }
}

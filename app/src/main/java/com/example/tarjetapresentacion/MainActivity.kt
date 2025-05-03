package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.vector.ImageVector


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD0E8D0)
                ) {
                    TarjetaPresentacion()
                }
            }
        }
    }
}

@Composable
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFDFFFE0)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .background(Color(0xFF003366))
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "Android Logo",
                    modifier = Modifier.size(150.dp) // más grande
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Mathias Ramos",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = "Programador de android",
                color = Color(0xFF2E7D32),
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium
            )
        }

        Column(
            modifier = Modifier
                .padding(bottom = 32.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ContactRow(icon = Icons.Filled.Phone, info = "+595 991 704 865")
            ContactRow(icon = Icons.Filled.Share, info = "@MathiRamos")
            ContactRow(icon = Icons.Filled.Email, info = "mattr@gmail.com")
        }
    }
}


@Composable
fun ContactRow(icon: ImageVector, info: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .size(24.dp)
                .padding(end = 5.dp), // MÁS ESPACIO ENTRE ICONO Y TEXTO
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFF2E7D32),
                modifier = Modifier.size(20.dp)
            )
        }
        Text(
            text = info,
            fontSize = 16.sp,
            color = Color.Black
        )
    }
}



@Preview(showBackground = true)
@Composable
fun TarjetaPresentacionPreview() {
    TarjetaPresentacionTheme {
        TarjetaPresentacion()
    }
}

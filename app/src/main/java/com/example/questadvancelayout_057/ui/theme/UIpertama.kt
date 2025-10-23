package com.example.questadvancelayout_057.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questadvancelayout_057.R
@Composable
fun CardKontak(
    nama: String,
    detail1: String,
    detail2: String,
    warnaLatar: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp, horizontal = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = warnaLatar
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.umy_logo),
                contentDescription = "Logo Universitas",
                modifier = Modifier.size(70.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))


            Column(
                modifier = Modifier.weight(1f)
            ) {

                Text(
                    text = nama,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Text(
                    text = detail1,
                    fontSize = 14.sp,
                    color = Color.Yellow
                )

                Text(
                    text = detail2,
                    fontSize = 14.sp,
                    color = Color.White
                )
            }
        }
    }
}


@Composable
fun AktivitasPertama(modifier: Modifier = Modifier) {

    Box(modifier = modifier.fillMaxSize().background(Color.White)) {


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Teknologi Informasi",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Universitas Muhammadiyah Yogyakarta",
                fontSize = 16.sp,
                modifier = Modifier.padding(bottom = 20.dp)
            )




            CardKontak(
                nama = "Asroni",
                detail1 = "Kasihan, Bantul",
                detail2 = "",
                warnaLatar = Color(0xFFC62828)
            )


            CardKontak(
                nama = "Ajo",
                detail1 = "082345678977",
                detail2 = "Palembang",
                warnaLatar = Color(0xFF1565C0)
            )


            CardKontak(
                nama = "Dila",
                detail1 = "085890998765",
                detail2 = "Semarang",
                warnaLatar = Color(0xFF2E7D32)
            )


            Spacer(modifier = Modifier.weight(1f))


            Text(
                text = "copyright, 2025",
                fontSize = 12.sp,
                color = Color.Gray,
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }
    }
}
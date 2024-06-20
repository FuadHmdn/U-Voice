package com.tam.uvo.report.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Comment
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowUp
import androidx.compose.material.icons.outlined.SendAndArchive
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.R
import com.tam.uvo.ui.theme.UNILA

@Preview(showBackground = true, showSystemUi = true)
@Composable

fun Content() {
    var selectedCategory by remember { mutableStateOf("Pilih Kategori") }
    Column (
        modifier=Modifier
            .fillMaxSize(),
    ){
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp)
        ){
            Image(modifier = Modifier
                .padding(top = 9.dp)
                .size(50.dp)
                .clip(RoundedCornerShape(50.dp)),
                painter = painterResource(id = R.drawable.profile), contentDescription =""
            )

            Spacer(modifier = Modifier.width(15.dp))

            Column(modifier = Modifier.padding(top = 10.dp),
                    verticalArrangement = Arrangement.Center
            ) {
            Text(
                text = "Eric Slebew",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Universitas Lampung, Lampung, Indonesia",
                    fontSize = 12.sp,
                    color = Color.Black
                )
            }
        }
        //isi laporan
        Text(modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(top = 30.dp),
            text = "Isi Laporan",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
        Box(
            modifier = Modifier
                .padding(horizontal = 20.dp, vertical = 10.dp)
                .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(8.dp))
        ){
        Text(modifier = Modifier
            .padding(horizontal = 20.dp),
            text = "Hadehhh," +
                    "FMIPA Gedung Ilkom AC nya yang sudah rusak namun" +
                    " tidak diperbaiki sehingga ruangan sangat terasa panas.",
            fontSize = 20.sp,
            color = Color.Black
        )
        }
        //unggah foto
        Text(modifier = Modifier
            .padding(horizontal = 20.dp)
            .padding(top = 10.dp, bottom = 5.dp),
            text = "Unggah foto bukti laporan",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )

        Image(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .size(260.dp)
            .clip(RoundedCornerShape(50.dp)),
            painter = painterResource(id = R.drawable.ac), contentDescription = ""
        )
        //Kategori
        Text(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp),
            text = "Pilih Kategori",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )

        //RadioGroup untuk memilih kategori
        Box(modifier = Modifier
            .padding(horizontal = 5.dp, vertical = 10.dp)
            .border(width = 1.dp, color = Color.Black, shape = RoundedCornerShape(20.dp))
            ){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start
            ) {

                RadioButton(
                    selected = selectedCategory == "Fasilitas",
                    onClick = { selectedCategory = "Fasilitas" },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(modifier = Modifier.padding(top = 20.dp, end = 20.dp),
                    text = "Fasilitas")

                RadioButton(
                    selected = selectedCategory == "Akademik",
                    onClick = { selectedCategory = "Akademik" },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(modifier = Modifier.padding(top = 20.dp, end = 20.dp),
                    text = "Akademik")

                RadioButton(
                    selected = selectedCategory == "Keamanan",
                    onClick = { selectedCategory = "Keamanan" },
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                Text(modifier = Modifier.padding(top = 20.dp, end = 20.dp),
                    text = "Layanan")
                }
            }

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .padding(horizontal = 20.dp, vertical = 10.dp),
        ) {
             Row(modifier = Modifier
                 .width(200.dp)
                 .clip(RoundedCornerShape(10.dp))
                 .background(Color.Red.copy(alpha = .5f)),
             ){
                 Text(modifier = Modifier.padding(vertical=5.dp, horizontal = 10.dp),
                     text = "Dilarang membuat Laporan Palsu!",
                     fontSize =10.sp,
                     fontWeight = FontWeight.Bold,
                     color = Color.White
                 )
             }


            Button(
                modifier = Modifier
                    .padding(top = 50.dp)
                    .width(1000.dp)
                    .height(50.dp),
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = UNILA,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Kirim Laporan",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                )

                Icon(modifier = Modifier
                    .size(35.dp)
                    .padding(start = 10.dp, bottom = 5.dp)
                    .rotate(-45f),
                    imageVector = Icons.Outlined.SendAndArchive, contentDescription ="kirim",
                    tint = Color.White,
                    )
            }
        }
    }
}


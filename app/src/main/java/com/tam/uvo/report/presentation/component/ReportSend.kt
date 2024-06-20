package com.tam.uvo.report.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Message
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.ui.theme.UNILA


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ReportSend() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .background(Color.Gray.copy(alpha = .5f), RoundedCornerShape(10.dp))
    )
    {
        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }
        }

//garis bawah
        Divider(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 5.dp)
                .fillMaxWidth(),
            color = Color.Black.copy(alpha = .5f),
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            // Menempatkan Icon di pojok kanan atas
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }
        }

        //garis bawah
        Divider(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 5.dp)
                .fillMaxWidth(),
            color = Color.Black.copy(alpha = .5f),
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            // Menempatkan Icon di pojok kanan atas
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }

        }

        //garis bawah
        Divider(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 5.dp)
                .fillMaxWidth(),
            color = Color.Black.copy(alpha = .5f),
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            // Menempatkan Icon di pojok kanan atas
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }

        }

        //garis bawah
        Divider(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 5.dp)
                .fillMaxWidth(),
            color = Color.Black.copy(alpha = .5f),
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            // Menempatkan Icon di pojok kanan atas
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }

        }

        //garis bawah
        Divider(
            modifier = Modifier
                .padding(vertical = 10.dp, horizontal = 5.dp)
                .fillMaxWidth(),
            color = Color.Black.copy(alpha = .5f),
            thickness = 1.dp
        )

        Box(
            modifier = Modifier
                .size(width = 310.dp, height = 80.dp)
                .padding(vertical = 1.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(color = Color.White)
                .align(Alignment.CenterHorizontally)
        ) {
            // Menempatkan Icon di pojok kanan atas
            Icon(
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 10.dp, top = 10.dp)
                    .align(Alignment.TopEnd),
                imageVector = Icons.Outlined.Check,
                contentDescription = "",
                tint = UNILA
            )

            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(end = 20.dp)
            ) {
                Icon(
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 20.dp, top = 20.dp),
                    imageVector = Icons.Outlined.Message,
                    contentDescription = "",
                )

                Text(
                    modifier = Modifier
                        .padding(top = 15.dp, start = 30.dp),
                    text = "Laporan",
                    fontSize = 30.sp
                )

                Text(
                    modifier = Modifier
                        .padding(top = 50.dp, start = 30.dp),
                    text = "20-06-2024",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Black.copy(alpha = .5f)
                )
            }

        }

        Icon(
            modifier = Modifier
                .size(100.dp)
                .padding(15.dp)
                .clickable {  }
                .align(Alignment.End),

            imageVector = Icons.Outlined.AddBox,
            contentDescription = "",
            tint = UNILA
        )

    }

}



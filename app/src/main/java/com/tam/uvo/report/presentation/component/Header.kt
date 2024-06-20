package com.tam.uvo.report.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIos
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.ui.theme.UNILA

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .clip(RoundedCornerShape(bottomEnd = 50.dp))
            .background(UNILA)
            .padding(start = 20.dp, top = 20.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Box(modifier = Modifier
            .size(70.dp)
        ){
            Icon(
                imageVector = Icons.Outlined.ArrowBackIos, contentDescription ="back",
                tint = Color.White
            )
        }

        Text(
            text = "Report",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )

    }


}
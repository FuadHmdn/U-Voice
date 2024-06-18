package com.tam.uvo.profile.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.ui.theme.DarkGrey
import com.tam.uvo.ui.theme.Grey
import com.tam.uvo.ui.theme.UNILA

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignOut(){
    Box(
        modifier = Modifier.padding(start = 16.dp, end = 16.dp).fillMaxWidth(),
        contentAlignment = Alignment.Center
    ){
        Button(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(DarkGrey),
            onClick = { /*TODO*/ },
        ) {
            Text(
                text = "Sign Out",
                fontWeight = FontWeight.Bold,
                color = UNILA,
                fontSize = 18.sp
            )
        }
    }
}
package com.tam.uvo.space.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tam.uvo.ui.theme.UNILA

@Composable
fun Item(){
    Row(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp),
    ) {
        Button(
            modifier = Modifier
                .height(35.dp)
                .width(100.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(2.dp, UNILA)
        ) {
            Text(
                modifier = Modifier,
                text = "Create",
                color = UNILA
            )
        }

        Spacer(modifier = Modifier.width(7.dp))
        Button(
            modifier = Modifier
                .height(35.dp)
                .width(105.dp),
            onClick = { },
            colors = ButtonDefaults.buttonColors(Color.White),
            border = BorderStroke(2.dp, UNILA)
        ) {
            Text(
                modifier = Modifier,
                text = "Discover",
                color = UNILA
            )
        }
    }
}
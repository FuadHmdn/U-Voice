package com.tam.uvo.space.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.space.presentation.component.ForYouSection
import com.tam.uvo.space.presentation.component.Item
import com.tam.uvo.space.presentation.component.MySpace
import com.tam.uvo.space.presentation.component.PoliticsSection
import com.tam.uvo.space.presentation.component.TopBarSpace

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SpaceScreen() {
    Column {
        TopBarSpace()
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Text(
            modifier = Modifier
                .padding(start = 16.dp),
            text = "Your Space",
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        )
        Spacer(modifier = Modifier.padding(top = 7.dp))
        Item()
        Spacer(modifier = Modifier.padding(top = 22.dp))
        MySpace()
        Spacer(modifier = Modifier.padding(top = 16.dp))
        Text(
            modifier = Modifier
                .padding(start = 16.dp),
            text = "Discover Space",
            fontWeight = FontWeight.SemiBold,
            fontSize = 22.sp
        )

        ForYouSection()

        PoliticsSection()
    }
}
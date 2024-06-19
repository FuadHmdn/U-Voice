package com.tam.uvo.home.presentation.write

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tam.uvo.home.presentation.write.component.ProfileWrite
import com.tam.uvo.home.presentation.write.component.TopCreatePost

@Composable
fun WriteScreen(navController: NavController){
    Column(
        Modifier.fillMaxWidth()
    ) {
        TopCreatePost(navController)
        Spacer(modifier = Modifier.height(16.dp))
        ProfileWrite()
    }
}
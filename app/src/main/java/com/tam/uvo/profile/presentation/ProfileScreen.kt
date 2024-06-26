package com.tam.uvo.profile.presentation

import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tam.uvo.profile.presentation.component.General
import com.tam.uvo.profile.presentation.component.Notification
import com.tam.uvo.profile.presentation.component.ProfileData
import com.tam.uvo.profile.presentation.component.SignOut


@Composable
fun ProfileScreen(navController: NavController){
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(scrollState),
    ) {
        Spacer(modifier = Modifier.height(36.dp))
        ProfileData()
        Spacer(modifier = Modifier.height(16.dp))
        General()
        Spacer(modifier = Modifier.height(16.dp))
        Notification()
        Spacer(modifier = Modifier.height(16.dp))
        SignOut(navController)
        Spacer(modifier = Modifier.height(36.dp))
    }
}
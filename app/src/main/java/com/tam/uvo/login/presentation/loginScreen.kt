package com.tam.uvo.login.presentation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tam.uvo.login.presentation.component.ButtonLogIn
import com.tam.uvo.login.presentation.component.LogInForm
import com.tam.uvo.login.presentation.component.WelcomeBackLogIn
import com.tam.uvo.ui.theme.UNILA

@Composable
fun LoginScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Spacer(modifier = Modifier.height(96.dp))
        WelcomeBackLogIn()
        Spacer(modifier = Modifier.height(36.dp))
        LogInForm()
        Spacer(modifier = Modifier.height(36.dp))
        ButtonLogIn(navController)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
                .clickable { navController.navigate("Register") }
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                append("Belum memiliki akun?")
                withStyle(style = SpanStyle(color = UNILA)) {
                    append(" Buat akun")
                }
            }
        )
    }
}
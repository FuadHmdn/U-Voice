package com.tam.uvo.login.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
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
import com.tam.uvo.login.presentation.component.ButtonRegister
import com.tam.uvo.login.presentation.component.CreateAccount
import com.tam.uvo.login.presentation.component.LogInForm
import com.tam.uvo.login.presentation.component.SignUpForm
import com.tam.uvo.login.presentation.component.WelcomeBackLogIn
import com.tam.uvo.ui.theme.UNILA

@Composable
fun RegisterScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            modifier = Modifier.padding(start = 16.dp, top = 16.dp)
                .size(30.dp),
            imageVector = Icons.Outlined.ArrowBack,
            contentDescription = null,
            tint = UNILA
        )

        Spacer(modifier = Modifier.height(36.dp))
        CreateAccount()
        Spacer(modifier = Modifier.height(36.dp))
        SignUpForm()
        Spacer(modifier = Modifier.height(36.dp))
        ButtonRegister(navController)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = buildAnnotatedString {
                append("Sudah memiliki akun?")
                withStyle(style = SpanStyle(color = UNILA)) {
                    append(" LogIn")
                }
            }
        )
    }
}
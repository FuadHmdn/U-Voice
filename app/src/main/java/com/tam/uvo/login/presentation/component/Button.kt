package com.tam.uvo.login.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tam.uvo.navigation.Screens
import com.tam.uvo.ui.theme.UNILA

@Composable
fun ButtonLogIn(navController: NavController){
    Column(
        Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Button(
            modifier = Modifier.fillMaxWidth()
                .height(55.dp),
            shape = RoundedCornerShape(5.dp),
            onClick = { navController.navigate(Screens.HomeScreen.name) },
            colors = ButtonDefaults.buttonColors(UNILA)
        ) {
          Text(
              text = "LOGIN",
              fontSize = 20.sp,
              fontWeight = FontWeight.SemiBold
          )
        }
    }
}

@Composable
fun ButtonRegister(navController: NavController){
    Column(
        Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp)
    ) {
        Button(
            modifier = Modifier.fillMaxWidth()
                .height(55.dp),
            shape = RoundedCornerShape(5.dp),
            onClick = {  },
            colors = ButtonDefaults.buttonColors(UNILA)
        ) {
          Text(
              text = "CREATE ACCOUNT",
              fontSize = 20.sp,
              fontWeight = FontWeight.SemiBold
          )
        }
    }
}
package com.tam.uvo.login.presentation.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun LogInForm(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = { /*TODO*/ },

        ) {
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Email")

        }

//        var email = remember{ mutableSetOf("") }
//        OutlinedTextField(
//            value = email,
//            onValueChange = { email = it },
//            label = ""
//        )
    }
}
package com.tam.uvo.home.presentation.write.component

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.NotificationAdd
import androidx.compose.material.icons.outlined.Public
import androidx.compose.material.icons.outlined.SyncLock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.R
import com.tam.uvo.ui.theme.DarkGrey
import com.tam.uvo.ui.theme.Grey

@Preview(showBackground = true)
@Composable
fun ProfileWrite() {
    Row(
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(56.dp)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier
        ) {
            Text(
                text = "Arip Saputri",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Spacer(modifier = Modifier.height(5.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {

                Box(
                    modifier = Modifier
                        .height(26.dp)
                        .width(80.dp)
                        .background(DarkGrey)
                        .clip(RoundedCornerShape(20.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(20.dp),
                            imageVector = Icons.Outlined.Public,
                            contentDescription = null
                        )
                        Text(text = "Public",
                            fontSize = 11.sp)
                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .height(26.dp)
                        .width(70.dp)
                        .background(DarkGrey)
                        .clip(RoundedCornerShape(20.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(20.dp),
                            imageVector = Icons.Outlined.NotificationAdd,
                            contentDescription = null
                        )
                        Text(text = "Notif",
                            fontSize = 11.sp)

                    }
                }

                Spacer(modifier = Modifier.width(16.dp))

                Box(
                    modifier = Modifier
                        .height(26.dp)
                        .width(65.dp)
                        .background(DarkGrey)
                        .clip(RoundedCornerShape(20.dp))
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 10.dp, end = 10.dp)
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(20.dp),
                            imageVector = Icons.Outlined.SyncLock,
                            contentDescription = null
                        )
                        Text(text = "24H",
                            fontSize = 11.sp)

                    }
                }
            }
        }
    }
}
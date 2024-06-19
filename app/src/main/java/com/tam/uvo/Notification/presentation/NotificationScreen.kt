package com.tam.uvo.Notification.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.R
import com.tam.uvo.ui.theme.Blue

@Composable
fun NotificationScreen(){
    val scrollState = rememberScrollState()
    Column(modifier = Modifier.verticalScroll(scrollState) ) {
        Text(text = "Notification", fontSize = 28.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp, top = 16.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "New", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp, top = 16.dp, bottom = 5.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(Blue)) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Row {
                    Column {
                        Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                                .padding(start = 16.dp)
                                .clip(
                                    CircleShape
                                )
                                .size(40.dp) )
                            Spacer(modifier = Modifier.width(6.dp))
                            Column {
                                Text(
                                    text = buildAnnotatedString {
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                            append("Trio")
                                        }
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                            append(" Menyukai Postingan Anda")
                                        }

                                    },
                                    modifier = Modifier.padding(start = 16.dp)
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                            }

                        }
                        Divider(
                            color = Color.LightGray,
                            thickness = 1.dp,
                            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                        )

                    }
                }
                Row {
                    Column {
                        Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                                .padding(start = 16.dp)
                                .clip(
                                    CircleShape
                                )
                                .size(40.dp) )
                            Spacer(modifier = Modifier.width(6.dp))
                            Column {
                                Text(
                                    text = buildAnnotatedString {
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                            append("Eric")
                                        }
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                            append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                        }

                                    },
                                    modifier = Modifier.padding(start = 16.dp)
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                            }

                        }
                        Divider(
                            color = Color.LightGray,
                            thickness = 1.dp,
                            modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                        )

                    }
                }
                Row {
                    Column(modifier = Modifier.padding(bottom = 10.dp)) {
                        Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                            Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                                .padding(start = 16.dp)
                                .clip(
                                    CircleShape
                                )
                                .size(40.dp) )
                            Spacer(modifier = Modifier.width(6.dp))
                            Column {
                                Text(
                                    text = buildAnnotatedString {
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                            append("Eric")
                                        }
                                        withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                            append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                        }

                                    },
                                    modifier = Modifier.padding(start = 16.dp)
                                )
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                            }

                        }


                    }
                }
            }
        }
        Text(text = "7 Day Ago", fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp, top = 16.dp))
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }
        Text(text = "30 Day Ago", fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp, top = 16.dp))
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }
        Row {
            Column {
                Row(modifier = Modifier.padding(top = 16.dp), verticalAlignment = Alignment.CenterVertically) {
                    Image(painter = painterResource(id = R.drawable.profile), contentDescription = null, modifier = Modifier
                        .padding(start = 16.dp)
                        .clip(
                            CircleShape
                        )
                        .size(40.dp) )
                    Spacer(modifier = Modifier.width(6.dp))
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 15.sp)) {
                                    append("Eric")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Normal, fontSize = 15.sp)) {
                                    append(" dan 117 lainnya Mengomentari Postingan Anda  ")
                                }

                            },
                            modifier = Modifier.padding(start = 16.dp)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "5 min ago", modifier = Modifier.padding(start = 16.dp))

                    }

                }
                Divider(
                    color = Color.LightGray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
                )

            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun NotificationPreview() {
    NotificationScreen()
}


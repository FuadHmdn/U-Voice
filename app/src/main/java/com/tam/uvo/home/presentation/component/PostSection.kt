package com.tam.uvo.home.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Comment
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowDown
import androidx.compose.material.icons.outlined.KeyboardDoubleArrowUp
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tam.uvo.R
import com.tam.uvo.home.data.Post

var list = mutableListOf(
    Post(
        name = "Rifqi Jambi",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f1,
        comment = 334,
        up = 695,
        down = 43,
        desc = "Nyari tempat belajar yang nyaman? Yuk ke perpustakaan kami! Ruangannya cozy, koleksi bukunya lengkap, dan suasananya tenang banget. Dijamin betah deh!"
    ),
    Post(
        name = "Trio Tubaba",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f2,
        comment = 534,
        up = 573,
        down = 63,
        desc = "Proud banget jadi mahasiswa Unila! Lab Ilmu Komputer kita keren banget, fasilitasnya lengkap dan modern. Ga nyesel deh kuliah di sini!"
    ),
    Post(
        name = "Eric Medan",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f3,
        comment = 182,
        up = 547,
        down = 13,
        desc = "Teman-teman, yuk lebih sadar sama lingkungan sekitar. Ngumpul di trotoar emang seru, tapi jangan sampai ganggu pengguna jalan ya. Yuk cari tempat ngumpul yang lebih nyaman dan aman!"
    ),
    Post(
        name = "Ghulam Lambar",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f4,
        comment = 334,
        up = 522,
        down = 293,
        desc = "Wah, seminar tadi di Aula Unila keren banget! Pembicaranya inspiring, tempatnya nyaman, dan acaranya berjalan lancar. Salut buat panitianya! Anjay keren banget!"
    ),
    Post(
        name = "Fuad Kalianda",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f5,
        comment = 999,
        up = 497,
        down = 33,
        desc = "Heran deh, kantin sebagus ini kok masih aja sepi? Padahal makanannya enak, tempatnya bersih dan nyaman. Yuk ramaiin kantin kita biar makin seru!"
    ),
    Post(
        name = "Messi Jambi",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f6,
        comment = 334,
        up = 480,
        down = 73,
        desc = "Siang-siang panas gini paling enak minum es cekek! Seger banget rasanya, bikin badan langsung adem. Ada yang mau join?"
    ),
    Post(
        name = "Ronaldo Kwateh",
        profileImage = R.drawable.profile,
        postImage = R.drawable.f7,
        comment = 334,
        up = 349,
        down = 53,
        desc = "Teman-teman, ada yang sudah tahu gimana cara daftar MSIB? Mau tanya nih, tahap-tahapnya gimana aja ya? Mulai dari persyaratan sampai proses pendaftarannya, ada yang bisa kasih info lengkapnya?"
    )
)

@Composable
fun PostSection(navController: NavController){
    LazyColumn{
        item {
            TopBar()
            Spacer(modifier = Modifier.height(16.dp))
            Write(navController)
        }
        items(list.size){index ->
            PostItem(index)
        }
    }
}

@Composable
fun PostItem(index: Int){
    var item = list[index]

    Column(
        modifier = Modifier
            .padding(top = 16.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            //Profile Image
            Image(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .clickable { },
                painter = painterResource(id = item.profileImage),
                contentDescription = "Profile Image",
            )

            //Username, post minutes
            Column(
                modifier = Modifier
                    .padding(start = 10.dp),
                verticalArrangement = Arrangement.Center
            ){
                Text(
                    modifier = Modifier
                        .clickable {  },
                    text = item.name,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = "32m",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }

        }

        Spacer(modifier = Modifier.height(10.dp))

        //Description
        Text(
            modifier = Modifier
                .clickable {  },
            text = item.desc,
            fontSize = 15.sp
        )

        //Post
        Image(
            modifier = Modifier
                .padding(top = 10.dp)
                .clip(RoundedCornerShape(16.dp))
                .clickable { }
                .fillMaxWidth(),
            painter = painterResource(id = item.postImage),
            contentDescription = "Post Image",
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(10.dp))

        //UP, Down, Comment, Share
        Row(
            modifier = Modifier
                .padding(bottom = 10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            //Up
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.KeyboardDoubleArrowUp,
                    contentDescription = "up"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = item.up.toString(),
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }

            //Down
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.KeyboardDoubleArrowDown,
                    contentDescription = "down"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = item.down.toString(),
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }

            //Comment
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(20.dp),
                    imageVector = Icons.Outlined.Comment,
                    contentDescription = "Comment"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Comment",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }

            //Share
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(20.dp),
                    imageVector = Icons.Outlined.Share,
                    contentDescription = "Share"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Share",
                    fontSize = 12.sp,
                    color = Color.Gray
                    )
            }
        }
    }
}

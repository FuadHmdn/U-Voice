package com.tam.uvo.space.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tam.uvo.R
import com.tam.uvo.space.data.SpaceItem
import com.tam.uvo.ui.theme.Grey

val itemForYou = listOf(

    SpaceItem(
        image = R.drawable.football,
        title = "Footbal Club",
        description = "Despripsi tentang Space"
    ),
    SpaceItem(
        image = R.drawable.basket,
        title = "Basket Club",
        description = "Despripsi tentang Space"
    ),
    SpaceItem(
        image = R.drawable.skateboard,
        title = "Skateboard Club",
        description = "Despripsi tentang Space"
    ),
    SpaceItem(
        image = R.drawable.music,
        title = "Music Club",
        description = "Despripsi tentang Space"
    ),
    SpaceItem(
        image = R.drawable.running,
        title = "Running Club",
        description = "Despripsi tentang Space"
    )
)

@Composable
fun ForYouSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp),
            text = "For You",
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )
        Text(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 10.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.End,
            text = "View All",
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp,
            color = Color.Gray
        )

        ForYouItemSection()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ForYouItemSection(){
    LazyRow {
        items(itemForYou.size){index->
            ClubItem(index = index)
        }
    }
}

@Composable
fun ClubItem(index:Int){
    var item = itemForYou[index]
    var padding = 0.dp
    if(index == (itemForYou.size - 1)){
        padding = 16.dp
    }
    Box(
        modifier = Modifier
            .padding(start = 16.dp, end = padding)
            .height(170.dp)
            .width(150.dp)
            .clip(RoundedCornerShape(15.dp))
            .background(Grey)
    ){
        Column(
            modifier = Modifier
                .clickable {  }
                .fillMaxSize()
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                painter = painterResource(id = item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Text(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp),
                text = item.title,
                fontSize = 12.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
            )

            Text(
                modifier = Modifier
                    .padding(start = 10.dp),
                text = item.description,
                fontSize = 11.sp,
                color = Color.Gray,
            )
        }
    }
}
package com.example.bankingmobileappcompose2.homeSections

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.DateRange
import androidx.compose.material.icons.rounded.Place
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingmobileappcompose2.data.Management

val managementList = listOf(
    Management(
        icon = Icons.Rounded.Send,
        name = "Pay",
        background = Color.Black
    ),
    Management(
        icon = Icons.Rounded.Share,
        name = "Transfer",
        background = Color.Black
    ),
    Management(
        icon = Icons.Rounded.DateRange,
        name = "Invest",
        background = Color.Black
    ),
    Management(
        icon = Icons.Rounded.Place,
        name = "Extract",
        background = Color.Black
    ),
)

@Preview
@Composable
fun ManagementSection() {

    LazyRow( modifier = Modifier
        .padding(top = 16.dp)
    ){
        items(managementList.size) {
            ManagementItem(it)
        }
    }
}


@Composable
fun ManagementItem(
    index: Int
) {
    val management = managementList[index]
    var lastPaddingEnd = 0.dp
    if (index == managementList.size - 1) {
        lastPaddingEnd = 16.dp
    }

    Box(modifier = Modifier.padding(start = 8.dp, end = lastPaddingEnd)) {
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .background(Color.White)
            .size(105.dp)
            .clickable {}
            .padding(8.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(management.background)
                .padding(6.dp),
            Alignment.Center
        ) {
            Icon(
                modifier = Modifier
                    .size(36.dp),
                imageVector = management.icon,
                contentDescription = management.name,
                tint = Color.White
            )
        }

        Text(
            text = management.name,
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
            )
        }
    }
}

















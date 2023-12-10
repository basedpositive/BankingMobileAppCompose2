package com.example.bankingmobileappcompose2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TopNavigationBar(topText: String) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .background(Color.Black)
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.menu_hamburger),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .clip(MaterialTheme.shapes.small)
                .border(1.dp, Color.Black, MaterialTheme.shapes.small)
                .padding(4.dp)
        )
        Text(
            text = topText,
            fontSize = 17.sp,
            color = Color.White
        )

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(15.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .clickable {}
                .padding(6.dp),
        ) {
            Icon(
                imageVector = Icons.Rounded.Notifications,
                contentDescription = "Notification",
                tint = MaterialTheme.colorScheme.onSecondaryContainer,
            )
        }
    }
}











package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingmobileappcompose2.homeSections.cards

data class Data(
    val icon: ImageVector,
    val text: String
)

val item = listOf(
    Data(
        icon = Icons.Rounded.AddCircle,
        text = "Add card"
    )
)

@Composable
fun addCard(index: Int) {
    val item = item[index]

    Row(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Image(
            imageVector = item.icon,
            contentDescription = item.text
        )

        Text(
            text = item.text,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

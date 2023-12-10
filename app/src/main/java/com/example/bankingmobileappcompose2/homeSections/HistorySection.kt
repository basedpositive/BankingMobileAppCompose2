package com.example.bankingmobileappcompose2.homeSections

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bankingmobileappcompose2.R
import com.example.bankingmobileappcompose2.data.History
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter

val formatter: DateTimeFormatter = DateTimeFormatter.ofPattern("d MMM.")
val historyList = listOf(
    History(
        productType = "Patreon",
        product = "Patreon Subscription",
        productDate = LocalDate.of(2023, 12, 3),
        productPrice = 5.00
    ),
    History(
        productType = "Netflix",
        product = "Netflix Subscription",
        productDate = LocalDate.of(2023, 10, 12),
        productPrice = 26.00
    ),
    History(
        productType = "Youtube",
        product = "Youtube Subscription",
        productDate = LocalDate.of(2023, 12, 1),
        productPrice = 22.00
    )
)

fun sortHistoryByDate(historyList: List<History>): List<History> {
    return historyList.sortedByDescending { it.productDate }
}


@Preview
@Composable
fun HistorySection() {
    val sortedHistoryList = sortHistoryByDate(historyList)

    /* Text(
        text = "History",
        fontWeight = FontWeight.Bold,
    ) */

    LazyColumn(
        modifier = Modifier
            .padding(top = 16.dp)
    ) {
        items(sortedHistoryList.size) {
            HistoryItem(history = sortedHistoryList[it])
        }
    }
}

@Composable
fun HistoryItem(
    history: History
) {
    val image = when (history.productType) {
        "Youtube" -> painterResource(id = R.drawable.ic_youtube)
        "Patreon" -> painterResource(id = R.drawable.ic_patreon)
        else -> painterResource(id = R.drawable.ic_netflix)
    }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(25.dp))
            .clickable {}
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {

            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = image,
                    contentDescription = history.productType,
                    modifier = Modifier
                        .width(60.dp),
                )

                Column(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .weight(1f)
                ) {
                    Text(
                        text = history.product
                    )
                    Text(
                        text = history.productDate.format(formatter)
                    )
                }

                Text(
                    text = "$ ${history.productPrice}",
                    modifier = Modifier
                        .padding(end = 8.dp),
                    fontSize = 24.sp,
                )

            }
        }
    }
}



















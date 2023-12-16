package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.bankingmobileappcompose2.R
import com.example.bankingmobileappcompose2.data.Card
import com.example.bankingmobileappcompose2.ui.theme.OrangeEnd
import com.example.bankingmobileappcompose2.ui.theme.RedStart
import com.example.bankingmobileappcompose2.ui.theme.PurpleStart
import com.example.bankingmobileappcompose2.ui.theme.PurpleEnd


@Composable
fun v_CardView(cards: List<Card>) {
    LazyColumn(
        modifier = Modifier
            .padding(top = 8.dp),
    ) {
        items(cards.size) { index ->
            VerticalCardItem(index, cards)
        }
    }
}

@Composable
fun VerticalCardItem(
    index: Int,
    cards: List<Card>,
) {
    val card = cards[index]
    var lastItemPaddingBottom = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingBottom = 16.dp
    }

    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier
        .padding(top = 16.dp, bottom = lastItemPaddingBottom)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.cardColor)
                .width(290.dp)
                .height(180.dp)
                .clickable { }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ){

                Row(
                    modifier = Modifier,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_bank),
                        contentDescription = "Icon",
                        modifier = Modifier.size(32.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                    Text(
                        text = "BANK",
                        modifier = Modifier.padding(start = 8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 18.sp

                    )
                }
                Text(
                    text = "CREDIT",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 18.sp
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = card.cardNumber,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 18.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_wifi_outline),
                    contentDescription = "Icon",
                    modifier = Modifier.size(32.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Column {
                        Text(
                            text = "VALID",
                            fontSize = 7.sp
                        )
                        Text(
                            text = "THRU",
                            fontSize = 7.sp
                        )
                    }

                    Text(
                        text = card.cardDate,
                        modifier = Modifier.padding(start = 5.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }

                Text(
                    text = card.cardCode,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.padding(start = 32.dp),
                    fontSize = 18.sp
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = card.cardOwnerName,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 18.sp
                )
                Image(
                    painter = image,
                    contentDescription = card.cardType,
                    modifier = Modifier.width(60.dp)
                )
            }
        }
    }
}

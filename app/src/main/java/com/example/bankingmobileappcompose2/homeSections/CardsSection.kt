package com.example.bankingmobileappcompose2.homeSections

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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


var cards = listOf(

    Card(
        cardType = "VISA",
        cardNumber = "0000 2363 8364 8269",
        cardDate = "1/25",
        cardCode = "633",
        cardOwnerName = "Greet Carl",
        cardColor = getGradient(RedStart, OrangeEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "0000 2363 8364 8889",
        cardDate = "12/25",
        cardCode = "369",
        cardOwnerName = "Best Arthur",
        cardColor = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        cardType = "MASTER CARD",
        cardNumber = "0000 2363 8364 6639",
        cardDate = "9/25",
        cardCode = "558",
        cardOwnerName = "Eyed Herald",
        cardColor = getGradient(PurpleStart, PurpleEnd)
    ),
    Card(
        cardType = "VISA",
        cardNumber = "0000 2363 8364 5514",
        cardDate = "7/25",
        cardCode = "141",
        cardOwnerName = "English James",
        cardColor = getGradient(RedStart, OrangeEnd)
    )

)

fun getGradient(
    startColor: Color,
    endColor: Color
): Brush {
    return Brush.horizontalGradient(
        colors = listOf(startColor, endColor)
    )
}

fun addNewCard(name: String, number: String, typo: String, date: String, cvv: String) {
    val newCard = Card(
        cardType = typo,
        cardNumber = number,
        cardDate = date,
        cardCode = cvv,
        cardOwnerName = name,
        cardColor = getGradient(RedStart, OrangeEnd)
    )
    cards = cards + listOf(newCard)  // Добавление новой карты в список
}


@Preview
@Composable
fun CardsSection() {
    LazyRow(
        modifier = Modifier
            .padding(top = 16.dp)
    ) {
        items(cards.size) { index ->
            CardItem(index)
        }
    }
}


@Composable
fun CardItem(
    index: Int
) {
    val card = cards[index]
    var lastItemPaddingEnd = 0.dp
    if (index == cards.size - 1) {
        lastItemPaddingEnd = 16.dp
    }
    
    var image = painterResource(id = R.drawable.ic_visa)
    if (card.cardType == "MASTER CARD") {
        image = painterResource(id = R.drawable.ic_mastercard)
    }

    Box(modifier = Modifier
        .padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(card.cardColor)
                .width(250.dp)
                .height(160.dp)
                .clickable { }
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
            ){

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_bank),
                        contentDescription = "Icon",
                        modifier = Modifier.size(24.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                    Text(
                        text = "BANK",
                        modifier = Modifier.padding(start = 8.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color.White,

                    )
                }
                Text(
                    text = "CREDIT",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                Text(
                    text = card.cardNumber,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_wifi_outline),
                    contentDescription = "Icon",
                    modifier = Modifier.size(24.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
            ){
                Row {
                    Text(
                        text = "VALID\nTHRU",
                        fontSize = 7.sp
                    )

                    Text(
                        text = card.cardDate,
                        modifier = Modifier.padding(start = 5.dp),
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }

                Text(
                    text = card.cardCode,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = card.cardOwnerName,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
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



















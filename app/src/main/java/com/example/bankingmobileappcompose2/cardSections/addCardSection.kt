package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingmobileappcompose2.configurationSections.ConfigurationItem
import com.example.bankingmobileappcompose2.configurationSections.configurationList
import com.example.bankingmobileappcompose2.homeSections.addNewCard



@Preview
@Composable
fun addCardSection(){

    var name by remember { mutableStateOf("Best Arthur") }
    var number by remember { mutableStateOf("XXXX XXXX XXXX XXXX") }
    var typo by remember { mutableStateOf("Choose one") }
    var date by remember { mutableStateOf("MM/YY") }
    var cvv by remember { mutableStateOf("XXX") }

    Box(modifier = Modifier
        .clip(RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Name",
                fontWeight = FontWeight.Bold,
            )
            TextField(
                value = "Best Arthur",
                onValueChange = { name = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            )

            Text(
                text = "Number",
                fontWeight = FontWeight.Bold,
            )
            TextField(
                value = "XXXX XXXX XXXX XXXX",
                onValueChange = { number = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp)
            )

            Text(
                text = "Typo",
                fontWeight = FontWeight.Bold,
            )
            TextField(
                value = "Choose one",
                onValueChange = { typo = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowDown,
                        contentDescription = null
                    )
                }
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 10.dp)
                ) {
                    Text(
                        text = "Date Validate",
                        fontWeight = FontWeight.Bold,
                    )
                    TextField(
                        value = "MM/YY",
                        onValueChange = { date = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "CVV",
                        fontWeight = FontWeight.Bold,
                    )
                    TextField(
                        value = "XXX",
                        onValueChange = { cvv = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp)
                    )
                }

                Button(
                    onClick = {
                        addNewCard(name, number, typo, date, cvv)
                    },
                    modifier = Modifier
                        .padding(16.dp)
                ) {
                    Text(
                        text = "+",
                        color = Color.White,
                    )
                }
            }
        }
    }
}

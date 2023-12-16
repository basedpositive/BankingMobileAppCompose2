package com.example.bankingmobileappcompose2.cardSections

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.bankingmobileappcompose2.configurationSections.ConfigurationItem
import com.example.bankingmobileappcompose2.configurationSections.configurationList
import com.example.bankingmobileappcompose2.homeSections.addNewCard



@Composable
fun addCardSection(
    navController: NavHostController
) {
    var name by remember { mutableStateOf("Best Arthur") }
    var number by remember { mutableStateOf("0000 1111 2222 3333") }
    var typo by remember { mutableStateOf("Choose one") }
    var date by remember { mutableStateOf("00/11") }
    var cvv by remember { mutableStateOf("123") }

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
        ) {
            Text(
                text = "Name",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp, top = 16.dp)
            )
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Enter your name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Ascii,
                    imeAction = ImeAction.Next
                )
            )

            Text(
                text = "Number",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp, top = 16.dp)
            )
            OutlinedTextField(
                value = number,
                onValueChange = { number = it },
                label = { Text("Enter your card number") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Number,
                    imeAction = ImeAction.Next
                )
            )

            Text(
                text = "Typo",
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 4.dp, top = 16.dp)
            )
            OutlinedTextField(
                value = typo,
                onValueChange = { typo = it },
                label = { Text("On Progress...") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 10.dp),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Rounded.KeyboardArrowDown,
                        contentDescription = null
                    )
                },
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
                        modifier = Modifier.padding(bottom = 4.dp, top = 16.dp)
                    )
                    OutlinedTextField(
                        value = date,
                        onValueChange = { date = it },
                        label = { Text("Enter v/date") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.Next
                        )
                    )
                }

                Column(
                    modifier = Modifier
                        .weight(1f)
                ) {
                    Text(
                        text = "CVV",
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 4.dp, top = 16.dp)
                    )
                    OutlinedTextField(
                        value = cvv,
                        onValueChange = { cvv = it },
                        label = { Text("Enter cvv") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 10.dp),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = KeyboardType.Number,
                            imeAction = ImeAction.None
                        )
                    )
                }
            }

            ElevatedButton(
                onClick = {
                    addNewCard(name, number, typo, date, cvv)
                    navController.navigateUp()
                },
                modifier = Modifier.fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(
                    text = "Add",
                    color = Color.Black,
                )
            }
        }
    }
}



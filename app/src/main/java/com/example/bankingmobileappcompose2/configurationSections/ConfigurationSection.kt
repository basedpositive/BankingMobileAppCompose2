package com.example.bankingmobileappcompose2.configurationSections

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Divider
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
import com.example.bankingmobileappcompose2.R
import com.example.bankingmobileappcompose2.homeSections.HistoryItem
import com.example.bankingmobileappcompose2.homeSections.historyList
import com.example.bankingmobileappcompose2.ui.theme.Gray40

val configurationList = listOf(
    Configuration(
        icon = Icons.Rounded.AccountCircle,
        title = "Profile"
    ),
    Configuration(
        icon = Icons.Rounded.Settings,
        title = "Configuration"
    ),
    Configuration(
        icon = Icons.Rounded.Notifications,
        title = "Notification"
    ),
    Configuration(
        icon = Icons.Rounded.Info,
        title = "Information"
    ),
)


@Preview
@Composable
fun ConfigurationSection(){
    LazyColumn(
        modifier = Modifier
            .padding(64.dp)
    ) {
        items(configurationList.size) {
            ConfigurationItem(configuration = configurationList[it])
        }
    }
}


@Composable
fun ConfigurationItem(
    configuration: Configuration
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
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
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .clickable {}
                        .border(1.dp, Gray40, MaterialTheme.shapes.small)
                        .padding(6.dp),
                ) {
                    Icon(
                        imageVector = configuration.icon,
                        contentDescription = configuration.title,
                        )

                }


                Text(
                    text = configuration.title,
                    modifier = Modifier
                        .padding(start = 16.dp),
                    color = Gray40
                )
            }
        }
    }
    Divider(
        color = Gray40,
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .padding(end = 16.dp, start = 16.dp)
    )
}






















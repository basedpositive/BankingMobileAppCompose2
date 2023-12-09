package com.example.bankingmobileappcompose2.configurationSections

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Info
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bankingmobileappcompose2.R
import com.example.bankingmobileappcompose2.homeSections.HistoryItem
import com.example.bankingmobileappcompose2.homeSections.historyList

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
            .padding(top = 16.dp)
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
    Box(modifier = Modifier
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
                Icon(
                    imageVector = configuration.icon,
                    contentDescription = configuration.title
                )

                Text(
                    text = configuration.title,
                    modifier = Modifier
                        .padding(start = 16.dp)
                )
            }
        }
    }
}




















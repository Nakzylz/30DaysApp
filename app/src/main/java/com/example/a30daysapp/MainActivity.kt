package com.example.a30daysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.ui.res.stringResource
import com.example.a30daysapp.model.Day
import com.example.a30daysapp.model.days
import com.example.a30daysapp.ui.theme._30DaysAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysAppTheme {
                Scaffold(
                    topBar = { TopAppBar() },
                    content = { paddingValues ->
                        Surface(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(paddingValues),
                            color = MaterialTheme.colorScheme.background
                        ) {
                            DaysList()
                        }
                    }
                )
            }
        }
    }
}

@Composable
fun DayCard(tip: Day) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .animateContentSize()
            .clickable { expanded = !expanded },
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Day ${tip.day}",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))

            Image(
                painter = painterResource(tip.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(text = tip.title, fontSize = 20.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(4.dp))

            AnimatedVisibility(visible = expanded) {
                Column {
                    Text(text = tip.description)
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineMedium,
            )
        },
        modifier = modifier
    )
}

@Composable
fun DaysList() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(days.size) { index ->
            DayCard(tip = days[index])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDaysList() {
    _30DaysAppTheme {
        DaysList()
    }
}







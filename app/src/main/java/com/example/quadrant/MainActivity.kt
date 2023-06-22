package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrant()
                }
            }
        }
    }
}

@Composable
fun Quadrant() {
    Column(modifier = Modifier.fillMaxWidth()){
        Row(modifier = Modifier.weight(1f)){
            InfoCard(
                title = stringResource(id = R.string.text_composable_title),
                description = stringResource(R.string.text_composable_description),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(id = R.string.image_composable_title),
                description = stringResource(R.string.image_composable_description),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }

        Row(modifier = Modifier.weight(1f)){
            InfoCard(
                title = stringResource(id = R.string.row_composable_title),
                description = stringResource(R.string.row_composable_description),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            InfoCard(
                title = stringResource(id = R.string.column_composable_title),
                description = stringResource(R.string.column_composable_description),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )

        }


    }


}

@Composable
fun InfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier

) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )

    }


}

@Preview(showBackground = true)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        Quadrant()
    }
}
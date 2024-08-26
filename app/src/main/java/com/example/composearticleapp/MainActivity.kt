package com.example.composearticleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticleapp.ui.theme.ComposeArticleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleAppTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    ComposableApp(
                        title = stringResource(R.string.title),
                        paragraph1 = stringResource(R.string.short_description),
                        paragraph2 = stringResource(R.string.long_description),
                    )
                }
            }
        }
    }
}

@Composable
fun ComposableApp(title: String, paragraph1: String, paragraph2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier
                .padding(16.dp),
        )
        Text(
            text = paragraph1,
            modifier = modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragraph2,
            modifier = modifier
                .padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
    ComposeArticleAppTheme {
        ComposableApp(
            title = stringResource(R.string.title),
            paragraph1 = stringResource(R.string.short_description),
            paragraph2 = stringResource(R.string.long_description)
        )
    }
}
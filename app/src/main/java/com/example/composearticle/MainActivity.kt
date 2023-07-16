package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Jet(getString(R.string.jetpack_compose_text), getString(R.string.jetpack_text),getString(
                                            R.string.in_this_text))
                }
            }
        }
    }
}


@Composable
fun Ando(tit: String, prone:String,prtwo: String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = tit,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = prone,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
        )
        Text(
            text = prtwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }


}


@Composable
fun Jet(tit: String, prone:String,prtwo: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,


        )
        Ando(
            tit = tit,
            prone = prone,
            prtwo = prtwo,
            modifier = Modifier
                .fillMaxSize()

        )

    }
}

@Preview(showBackground = true)
@Composable
private fun JetPreview() {
    ComposeArticleTheme {
        Jet(stringResource(R.string.jetpack_compose_text), stringResource(R.string.jetpack_text), stringResource(R.string.in_this_text))
    }
}
package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
//                    BirthdayGreetingWithImg(stringResource(R.string.happy_birthday_text), stringResource(R.string.signature_text))
                }
            }
        }
    }
}

//@Composable
//fun BirthdayGreetingWithText(message: String, from: String, modifier: Modifier = Modifier){
//    Column(
//        modifier = modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ){
//        Text(
//            text = message,
//            fontSize = 36.sp,
//            modifier = Modifier.padding(top = 16.dp),
//        )
//        Text(
//            text = from,
//            fontSize = 24.sp,
//            modifier = Modifier
//                .align(alignment = Alignment.End)
//                .padding(end = 16.dp)
//        )
//    }
//}

//@Composable
//fun BirthdayGreetingWithImg(message: String, from: String, modifier: Modifier = Modifier){
//    val image = painterResource(R.drawable.androidparty)
//    Box {
//        Image(
//            painter = image,
//            contentDescription = null,
//            contentScale = ContentScale.Crop
//        )
//        BirthdayGreetingWithText(message = message, from = from)
//    }
//}

/* Compose 도움말 */
@Composable
fun ComposeHelpApp(){
    HelpCard(
        imagePainter = painterResource(R.drawable.bg_compose_background),
        title = stringResource(R.string.compose_title),
        shortDesc = stringResource(R.string.compose_short_desc),
        desc = stringResource(R.string.compose_desc)
    )
}

@Composable
fun HelpCard(imagePainter: Painter, title: String, shortDesc: String, desc: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDesc,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = desc,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}


//@Preview(showBackground = false)
@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
//        BirthdayGreetingWithImg("Happy Birthday Sam!", "- from Emma")
        ComposeHelpApp()
    }
}
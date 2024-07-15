package com.example.myjetpackapp

import android.media.Image
import android.media.MediaDescription
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.myjetpackapp.ui.theme.MyJetPackAppTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val fontFamily= FontFamily(
            Font(R.font.lexend_thin,FontWeight.Thin),
            Font(R.font.lexend_light,FontWeight.Light),
            Font(R.font.lexend_regular,FontWeight.Normal),
            Font(R.font.lexend_medium,FontWeight.Medium),
            Font(R.font.lexend_semibold,FontWeight.SemiBold),
            Font(R.font.lexend_bold,FontWeight.Bold),
            Font(R.font.lexend_extrabold,FontWeight.ExtraBold),
        )

        installSplashScreen()

        setContent {






            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color.Black),
                contentAlignment = Alignment.Center){
                Text(text = buildAnnotatedString {
                                                 withStyle(
                                                     style = SpanStyle(
                                                         color = Color.Green,
                                                         fontSize = 50.sp
                                                     )
                                                 ){
                                                     append("J")
                                                 }
                    append("etpack ")
                    withStyle(
                        style = SpanStyle(
                            color = Color.Green,
                            fontSize = 50.sp
                        )
                    ){
                        append("C")
                    }
                    append("ompose")
                },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily=fontFamily,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center,
                    textDecoration = TextDecoration.Underline
                )
            }





            val painter= painterResource(id = R.drawable.img_3)
            val description="Kermit in the snow"
            val title="Kermit is playing in the snow"
            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)){
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title
                )
            }


        }
    }
}



@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier=Modifier
){
    Card (
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 5.dp
        )
    ) {
        Box(
            modifier = Modifier.height(200.dp)){
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                ))
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            contentAlignment=Alignment.BottomStart){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }
    }
}





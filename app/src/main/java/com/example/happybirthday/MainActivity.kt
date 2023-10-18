package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}
@Composable
fun PersonalInfo (
    name: String,
    studentID: String,
    instagramAcc: String,
    phone: String,
    email: String,
    modifier: Modifier = Modifier
){
    Column (
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 22.dp)
        ){
            Image(
                painter = painterResource(R.drawable.download),
                contentDescription = "code Image",
                modifier
                    .height(90.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = name,
                fontSize = 22.sp,
            )
            Text(
                text = studentID,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
            )
        }

        Spacer(Modifier.height(200.dp))

        Column (
            modifier.padding(bottom = 70.dp)
        ) {
            Row {
                Image(painter = painterResource(R.drawable.whatsapp),
                    contentDescription = "WhatsApp Icon",
                    modifier
                        .height(25.dp)
                )
                Spacer(Modifier.width(14.dp))
                Text(text = phone)
            }
            Spacer(Modifier.height(16.dp))
            Row {
                Image(painter = painterResource(R.drawable.instagram),
                    contentDescription = "Instagram Icon",
                    modifier
                        .height(25.dp)
                )
                Spacer(Modifier.width(15.dp))
                Text(text = instagramAcc)
            }
            Spacer(Modifier.height(16.dp))
            Row {
                Image(painter = painterResource(R.drawable.gmail),
                    contentDescription = "Gmail Icon",
                    modifier
                        .height(25.dp)
                )
                Spacer(Modifier.width(17.dp))
                Text(text = email)
            }
        }
    }
}

@Preview(
    showBackground = true,
)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        PersonalInfo("Fahriza", "D121211042", "@fahrizagym", "081243123", "fahrizagym@gmil.com")
    }
}
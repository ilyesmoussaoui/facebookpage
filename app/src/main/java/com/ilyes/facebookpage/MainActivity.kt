package com.ilyes.facebookpage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ilyes.facebookpage.ui.theme.Blue
import com.ilyes.facebookpage.ui.theme.FacebookPageTheme
import com.ilyes.facebookpage.ui.theme.Green

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookPageTheme {
                Ilyes()
            }
        }
    }
}

@Composable
fun Ilyes(modifier: Modifier = Modifier) {
    Column(
        modifier= modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.fb_image),
            contentDescription = "",
            modifier = modifier
                .fillMaxWidth()
                .height(220.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = modifier.height(10.dp))
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

            horizontalArrangement = Arrangement.Center
        ) {
            Spacer(modifier = modifier.width(10.dp))

            Text(
                text = "Francais",
                style = TextStyle(),
                fontSize = 17.sp,

                )
            Spacer(modifier = modifier.width(10.dp))

            Canvas(modifier = Modifier.size(5.dp)) {
                drawCircle(
                    color = Color.Gray,
                    radius = size.minDimension / 2,
                    style = Fill
                )
            }
            Spacer(modifier = modifier.width(10.dp))

            Text(
                text = "English",
                style = TextStyle(),
                fontSize = 17.sp,

                )
            Spacer(modifier = modifier.width(10.dp))

            Canvas(modifier = Modifier.size(5.dp)) {
                drawCircle(
                    color = Color.Gray,
                    radius = size.minDimension / 2,
                    style = Fill
                )
            }
            Spacer(modifier = modifier.width(10.dp))

            Text(
                text = "More...",
                style = TextStyle(),
                fontSize = 17.sp,
                color = Blue

            )
            Spacer(modifier = modifier.width(10.dp))



        }
        Spacer(modifier = modifier.height(50.dp))


        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
            ,
            value = "",
            onValueChange = {

            },
            label = {
                Text(text = "Phone or Email")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
            ),
            maxLines = 1,
            singleLine = true,
            trailingIcon = {
                Icon(
                    painter = painterResource(id = R.drawable.info),
                    contentDescription = ""
                )
            },
        )
        Spacer(modifier = modifier.height(7.dp))
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
            ,
            value = "",
            onValueChange = {

            },
            label = {
                Text(text = "Password")
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
            ),
            maxLines = 1,
            singleLine = true,

            )
        Spacer(modifier = modifier.height(25.dp))



        Button(
            onClick = {

            },
            shape = RoundedCornerShape(8),
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue
            ),
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp),

            ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = "Log In",
                textAlign = TextAlign.Center,
            )
        }
        Spacer(modifier = modifier.height(10.dp))

        Text(
            text = "Forgot Password?",
            style = TextStyle(fontWeight = FontWeight.Bold),
            fontSize = 20.sp,
            color = Blue,


            )
        Spacer(modifier = modifier.height(70.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(1.dp)
                    .background(Color.Gray)
            )
            Spacer(modifier = modifier.width(5.dp))

            Text(
                text = "OR",
                style = TextStyle(),
                fontSize = 17.sp,

                )
            Spacer(modifier = modifier.width(5.dp))

            Box(
                modifier = Modifier
                    .width(160.dp)
                    .height(1.dp)
                    .background(Color.Gray)
            )

        }
        Spacer(modifier = modifier.height(70.dp))

        Button(
            onClick = {

            },
            shape = RoundedCornerShape(8),
            colors = ButtonDefaults.buttonColors(
                containerColor = Green
            ),
            modifier = Modifier
                .padding(start = 40.dp, end = 40.dp),

            ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                text = "Create New Facebook Account",
                textAlign = TextAlign.Center,
            )
        }








    }

}











@Preview
@Composable
fun FacebookPagePreview(modifier: Modifier = Modifier){
    Surface {
        FacebookPageTheme{
            Ilyes()
        }
    }
}


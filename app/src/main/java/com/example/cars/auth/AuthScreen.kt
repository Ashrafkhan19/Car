package com.example.cars.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cars.R
import com.example.cars.ui.theme.CarsTheme
import com.example.cars.ui.theme.seedColor

@Composable
fun AuthScreen(modifier: Modifier = Modifier) {


    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(seedColor))
            .padding(horizontal = 42.dp),
        //verticalArrangement = Arrangement.Center
    ) {



        Spacer(modifier = Modifier.weight(.05f))

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_playstore),
            contentDescription = "",
            modifier = Modifier.size(63.dp)
        )

        Spacer(modifier = Modifier.height(33.dp))

        Text(
            text = "Welcome", style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W900, lineHeight = 16.sp
            )
        )

        Spacer(modifier = Modifier.height(43.dp))

        Row {
            Text(
                text = "\u201c", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W900, lineHeight = 16.sp, fontSize = 58.sp
                )
            )
            Text(
                text = "In a world of finite resources, the true measure of innovation lies not in its complexity, but in its capacity to simplify and empower the human mind.",
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.W400, fontStyle = FontStyle.Italic, lineHeight = 30.sp
                ),
                modifier = Modifier.padding(top = 8.dp)
            )
        }


        Spacer(modifier = Modifier.weight(.075f))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.onBackground),
            contentPadding = PaddingValues(18.dp),
            shape = MaterialTheme.shapes.large
        ) {
            Text(
                text = "Sign-up", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, lineHeight = 16.sp, fontSize = 18.sp
                )
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(18.dp),
            shape = MaterialTheme.shapes.large,
            border = ButtonDefaults.outlinedButtonBorder.copy(brush = SolidColor(MaterialTheme.colorScheme.onBackground))
        ) {
            Text(
                text = "Sign-in", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, lineHeight = 16.sp, fontSize = 18.sp
                )
            )
        }

        Spacer(modifier = Modifier.weight(.025f))

        Text(
            text = "Terms",
            style = MaterialTheme.typography.titleMedium.copy(
                fontWeight = FontWeight.W400,
                fontSize = 16.sp,
                color = Color(0xFF4E4C4C),
                textDecoration = TextDecoration.Underline
            ),
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(48.dp))

    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewAuthScreen() {
    CarsTheme {
        AuthScreen()
    }
}
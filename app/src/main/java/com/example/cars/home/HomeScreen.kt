package com.example.cars.home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.twotone.PlayArrow
import androidx.compose.material.icons.twotone.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cars.R
import com.example.cars.ui.theme.CarsTheme
import com.example.cars.ui.theme.seedColor


@Composable
fun HomeScreen() {


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(seedColor))
            .padding(horizontal = 20.dp)

    ) {

        item {
            CarTopAppBar()
        }


        item {
            Spacer(modifier = Modifier.height(40.dp))
        }

        item {
            LazyRow(
                contentPadding = PaddingValues(horizontal = 16.dp),
                modifier = Modifier.offset(x = (-20).dp, y = 0.dp)
            ) {
                items(19) {
                    ArticleCard()
                }
            }
        }


        item {
            Spacer(modifier = Modifier.height(32.dp))
        }

        item {
            Text(
                text = "Recent Articles",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W700, fontSize = 22.sp, lineHeight = 31.5.sp
                ),
            )
        }

        item {
            Spacer(modifier = Modifier.height(32.dp))
        }


        items(10) {
            ArticleCardHorizontal()
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }

        item {
            Box(
                modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(.65f),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background),
                    contentPadding = PaddingValues(vertical = 8.dp),
                    shape = MaterialTheme.shapes.large
                ) {
                    Text(
                        text = "View All", style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.W500, lineHeight = 18.sp, fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(32.dp))
        }

        item {

            Column(
                modifier = Modifier
                    .layout { measurable, constraints ->
                        val placeable = measurable.measure(
                            constraints.copy(
                                maxWidth = constraints.maxWidth + 40.dp.roundToPx(), //add the end padding 16.dp
                            )
                        )
                        layout(placeable.width, placeable.height) {
                            placeable.place(0.dp.roundToPx(), 0)
                        }
                    }
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.onBackground)
                    .padding(vertical = 64.dp, horizontal = 12.dp)
            ) {

                Text(
                    text = "Social Connect", style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.W700, lineHeight = 30.sp, fontSize = 22.sp,
                        color = MaterialTheme.colorScheme.background
                    )
                )

                Text(
                    text = "Stay update with my latest post \non your favorite platforms", style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.W400, lineHeight = 21.sp, fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.background
                    )
                )

                Spacer(modifier = Modifier.height(16.dp))

                LazyRow(
                    contentPadding = PaddingValues(horizontal = 16.dp),
                    modifier = Modifier.offset(x = (-20).dp, y = 0.dp)
                ) {
                    items(19) {
                        SocialCard()
                    }
                }

            }

        }






    }

}

@Composable
fun SearchBar() {
    var text by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .padding(16.dp)
            .size(149.dp, 40.dp)
            .background(Color.White, shape = RoundedCornerShape(20.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            BasicTextField(
                value = text,
                onValueChange = { text = it },
                textStyle = TextStyle(color = Color.Gray, fontSize = 16.sp),
                singleLine = true,
                decorationBox = { innerTextField ->
                    if (text.isEmpty()) {
                        Text(
                            text = "Search ....",
                            style = TextStyle(color = Color(0xFF929292), fontSize = 16.sp)
                        )
                    }
                    innerTextField()
                },
                modifier = Modifier.weight(1f)
            )

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.Gray
            )
        }
    }
}

@Preview
@Composable
private fun ArticleCardPreview() {
    CarsTheme {
        ArticleCard()
    }
}

@Preview
@Composable
private fun SocialCardPreview() {
    CarsTheme {
        SocialCard()
    }
}

@Preview
@Composable
private fun ArticleCardHorizontalPreview() {
    CarsTheme {

        ArticleCardHorizontal()
    }
}

@Composable
fun ArticleCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .widthIn(max = 320.dp)
            .padding(end = 16.dp)
    ) {
        Column {
            ArticleImageWithIcons()

            Spacer(modifier = Modifier.height(18.dp))

            ArticleContent(
                category = "technology",
                title = "Step Into Tomorrow: Exploring Spatial Computing’s Impact On Industries And The Metaverse!",
                date = "26 Feb 2024"
            )
        }
    }
}

@Composable
fun SocialCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .widthIn(max = 260.dp)
            .padding(end = 16.dp)
    ) {
        Column {
            ArticleImageWithIcons(showSecondaryIcon = false)

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "The Ultimate Guide To Simplifying Your Routine With Generative AI Automation!",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W400, fontSize = 16.sp, lineHeight = 24.sp
                ),
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 8.dp)
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun ArticleCardHorizontal() {
    Card(
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        shape = RoundedCornerShape(16.dp),
        //elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 16.dp, bottom = 16.dp)
        //.fillMaxWidth()
    ) {
        Row {


            Box {
                Image(
                    painter = painterResource(id = R.drawable.car),
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth(.45f)
                        .height(353.dp),
                    contentScale = ContentScale.Crop
                )

                /*Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp, horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    FilledIconButton(onClick = { *//*TODO*//* }, shape = MaterialTheme.shapes.medium, colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.onBackground)) {
                        Icon(imageVector = Icons.TwoTone.PlayArrow, contentDescription = "", tint = MaterialTheme.colorScheme.background)
                    }

                    FilledIconButton(onClick = { *//*TODO*//* }, shape = MaterialTheme.shapes.medium, colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.onBackground)) {
                        Icon(imageVector = Icons.TwoTone.Star, contentDescription = "", tint = MaterialTheme.colorScheme.background)
                    }
                }*/

            }

            Spacer(modifier = Modifier.height(18.dp))

            Column(
                modifier = Modifier.padding(start = 16.dp)
            ) {

                Spacer(modifier = Modifier.height(12.dp))

                FilledIconButton(
                    onClick = { },
                    shape = MaterialTheme.shapes.small,
                    colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.onBackground)
                ) {
                    Icon(
                        imageVector = Icons.TwoTone.PlayArrow,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.background
                    )
                }
                // Category label
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(horizontal = 4.dp)
                ) {
                    Canvas(modifier = Modifier.size(13.dp)) {
                        drawCircle(color = Color.Black)
                    }
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = "technology",
                        style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.W500, fontSize = 14.sp, lineHeight = 31.5.sp
                        ),
                    )
                }


                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.W700,
                            )
                        ) {
                            append("Step Into Tomorrow: ")
                        }
                        append("Exploring Spatial Computing’s Impact On Industries And The Metaverse!")
                    },
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.W500, fontSize = 16.sp, lineHeight = 24.sp
                    ),
                    //modifier = Modifier.padding(horizontal = 16.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "26 Feb 2024",
                    style = MaterialTheme.typography.headlineSmall.copy(
                        fontWeight = FontWeight.W500, fontSize = 12.sp,
                    ),
                    color = Color(0xFF929292),
                    modifier = Modifier.padding(horizontal = 0.dp, vertical = 8.dp)
                )
            }


        }
    }
}

@Composable
fun ArticleImageWithIcons(showSecondaryIcon: Boolean = true, isHorizontal: Boolean = false) {
    Box {
        Image(
            painter = painterResource(id = R.drawable.car),
            contentDescription = "",
            modifier = if (isHorizontal) {
                Modifier
                    .fillMaxWidth(0.45f)
                    .height(353.dp)
            } else {
                Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            },
            contentScale = ContentScale.Crop
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FilledIconButton(
                onClick = { /*TODO*/ },
                shape = MaterialTheme.shapes.medium,
                colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.onBackground)
            ) {
                Icon(
                    imageVector = Icons.TwoTone.PlayArrow,
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.background
                )
            }

            if (showSecondaryIcon) {
                FilledIconButton(
                    onClick = { /*TODO*/ },
                    shape = MaterialTheme.shapes.medium,
                    colors = IconButtonDefaults.iconButtonColors(containerColor = MaterialTheme.colorScheme.onBackground)
                ) {
                    Icon(
                        imageVector = Icons.TwoTone.Star,
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.background
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleContent(category: String, title: String, date: String) {
    Column {
        CategoryLabel(category = category)

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.W700)) {
                    append("Step Into Tomorrow: ")
                }
                append(title)
            },
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W500, fontSize = 16.sp, lineHeight = 24.sp
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = date,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W500, fontSize = 12.sp,
            ),
            color = Color(0xFF929292),
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
    }
}

@Composable
fun CategoryLabel(category: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Canvas(modifier = Modifier.size(13.dp)) {
            drawCircle(color = Color.Black)
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = category,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W500, fontSize = 14.sp, lineHeight = 31.5.sp
            ),
        )
    }
}


@Composable
fun CarTopAppBar(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.ic_launcher_playstore
            ), contentDescription = "", modifier = Modifier.size(43.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        SearchBar()
    }
}

@Preview
@Composable
fun CarTopAppBarPreview() {
    CarsTheme {
        CarTopAppBar()
    }
}

@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    CarsTheme {
        HomeScreen()
    }
}
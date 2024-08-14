package com.example.cars.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cars.R
import com.example.cars.ui.theme.CarsTheme
import com.example.cars.ui.theme.grey
import com.example.cars.ui.theme.seedColor

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ArticleDetailScreen(
    onBack: () -> Unit
) {

    val tags = listOf(
        "Spatial Computing",
        "Industrial Metaverse",
        "AR in Retail",
        "Digital Interaction",
        "Enterprise Tools",
        "AR/VR Technology"
    )

    Column(
        modifier = Modifier
            .background(color = seedColor)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .systemBarsPadding()
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 12.dp, horizontal = 16.dp),
            //.background(MaterialTheme.colorScheme.background),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(
                id = R.drawable.ic_back
            ), contentDescription = "", modifier = Modifier
                .size(46.dp)
                .clickable {
                    onBack()
                })


            Spacer(modifier = Modifier.weight(1f))

            Image(
                painter = painterResource(
                    id = R.drawable.ic_logo
                ), contentDescription = "", modifier = Modifier.size(43.dp)
            )


        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .padding(top = 32.dp)
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(fontWeight = FontWeight.W700)) {
                        append("Step Into Tomorrow: ")
                    }
                    append("Exploring Spatial Computing’s Impact On Industries And The Metaverse!")
                },
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W400, fontSize = 26.sp, lineHeight = 33.sp
                ),
                //modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
            ) {

                ArticleTag(
                    key = "Type", value = "Article"
                )

                ArticleTag(
                    key = "Category", value = "Technology"
                )

                ArticleTag(
                    key = "Date", value = "26 Feb 2024"
                )
            }

            Spacer(modifier = Modifier.height(26.dp))

            Box {
                Image(
                    painter = painterResource(id = R.drawable.car),
                    contentDescription = "",
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp, horizontal = 16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_bookmark),
                        contentDescription = null,
                        modifier = Modifier.size(46.dp)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.ic_share),
                        contentDescription = null,
                        modifier = Modifier.size(46.dp)
                    )

                }
            }

            Spacer(modifier = Modifier.height(26.dp))


        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(18.dp),
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .padding(bottom = 8.dp)

        ) {

            Text(
                text = "Intro", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
                ), color = grey
            )

            Text(
                text = "Now: Simulating the enterprise",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
                ),
                //color = grey
            )

            Text(
                text = "Introduction #1", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
                ), color = grey
            )

            Text(
                text = "Intro #3", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
                ), color = grey
            )

            Text(
                text = "Conclusion", style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
                ), color = grey
            )

        }

        HorizontalDivider(thickness = 3.dp)

        ArticleContent()

        Spacer(modifier = Modifier.height(8.dp))

        FlowRow(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            tags.forEach {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth(.5f)
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.background),
                    contentPadding = PaddingValues(vertical = 8.dp),
                    shape = MaterialTheme.shapes.large
                ) {
                    Text(
                        text = it, style = MaterialTheme.typography.headlineSmall.copy(
                            fontWeight = FontWeight.W500,
                            lineHeight = 16.sp,
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    )
                }
            }
        }


        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = "Recent Articles",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W700, fontSize = 22.sp, lineHeight = 31.5.sp
                ),
            )

            Spacer(modifier = Modifier.height(32.dp))

            LazyRow {
                items(10) {
                    ArticleCard()
                }
            }
        }


    }

}

@Composable
private fun ArticleContent() {
    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "A",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W400, fontSize = 100.sp, lineHeight = 30.sp
                ),
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "s the industrial metaverse evolves into a critical enterprise , industrial applications. Leveraging",
                style = MaterialTheme.typography.headlineSmall.copy(
                    fontWeight = FontWeight.W400, fontSize = 18.sp, lineHeight = 30.sp
                ),
            )

        }

        Text(
            text = stringResource(id = R.string.article),
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W400, fontSize = 18.sp, lineHeight = 30.sp
            ),
        )
    }
}

@Composable
private fun ArticleTag(key: String, value: String) {
    Column {
        Text(
            text = key, style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W500, fontSize = 14.sp, lineHeight = 16.5.sp
            ), color = grey
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = value,
            style = MaterialTheme.typography.headlineSmall.copy(
                fontWeight = FontWeight.W500, fontSize = 18.sp, lineHeight = 21.5.sp
            ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ArticleDetailScreenPreview() {
    CarsTheme {
        ArticleDetailScreen {

        }
    }
}


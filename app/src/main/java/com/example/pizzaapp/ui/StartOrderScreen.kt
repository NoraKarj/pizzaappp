package com.example.pizzaapp.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign

import androidx.compose.ui.unit.dp
import com.example.pizzaapp.R



@Composable
fun StartOrderScreen(
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.order_pizza),
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            color = Color(0xFF36846b),
            modifier = Modifier
                .padding(top = 6.dp, bottom = 6.dp)
                .fillMaxWidth()
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PizzaItem(
                        R.drawable.pizza1,
                        "Pepperoni",
                        "Classic American-style pizza with thinly sliced pepperoni for a rich and spicy flavor.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                    PizzaItem(
                        R.drawable.pizza2,
                        "Italian",
                        "Delicious pizza with rich tomato sauce, olives, pepperoni, and fresh mushrooms.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                }
            }
            item {
                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PizzaItem(
                        R.drawable.pizza3,
                        "BBQ Chicken",
                        "Savory BBQ Chicken pizza featuring a medley of smoky barbecue sauce and succulent chicken, creating a culinary experience.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                    PizzaItem(
                        R.drawable.pizza4,
                        "Veggie",
                        "Light and delicious vegetarian pizza with various mushrooms, creating a perfect, mouth-watering option.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                }
            }
            item {
                Spacer(modifier = Modifier.height(20.dp))
            }
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    PizzaItem(
                        R.drawable.pizza5,
                        "Grill Gourmet",
                        "Enjoy a delicious pizza that combines grilled meat, onions, cherry tomatoes, mozzarella cheese, and gouda cheese. An unforgettable experience.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                    PizzaItem(
                        R.drawable.pizza6,
                        "Four Season",
                        "The fresh mushroom pizza is a perfect choice for those who love fresh flavors. Mushrooms, ham, and cheese come together in this delicious pizza.",
                        onNextButtonClicked,
                        Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Composable
fun SelectQuantityButton(
    @StringRes labelResourceId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(min = 250.dp)
    ) {
        Text(stringResource(labelResourceId))
    }
}

@Composable
fun PizzaItem(
    @DrawableRes imageRes: Int,
    name: String,
    description: String,
    onNextButtonClicked: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier.clickable { onNextButtonClicked(imageRes) }
    ) {
        Image(
            painter = painterResource(imageRes),
            contentDescription = null,
            modifier = Modifier
                .width(125.dp)
                .height(125.dp)
                .wrapContentWidth(Alignment.CenterHorizontally)
                .wrapContentHeight(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = name,
            style = MaterialTheme.typography.headlineSmall,
            color = Color(0xFF36846b),
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.labelMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
    }
}
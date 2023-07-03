package com.ninidze.pokerapp.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.ui.theme.PokerAppTheme
import com.ninidze.pokerapp.utils.Constants.SMALL_BLIND

@Composable
fun PokerActionArea(
    modifier: Modifier = Modifier,
    currentBid: Int = SMALL_BLIND * 2,
    onRaiseClick: (Int) -> Unit,
    onCallClick: () -> Unit,
    onFoldClick: () -> Unit
) {
    var isRaiseSliderVisible by remember { mutableStateOf(false) }
    var raiseValue by remember { mutableStateOf((currentBid * 2f)) }

    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = CenterHorizontally
    ) {
        Row {
            Button(onClick = {
                isRaiseSliderVisible = !isRaiseSliderVisible
                if (!isRaiseSliderVisible) {
                    onRaiseClick.invoke(raiseValue.toInt())
                }
            }) {
                Column(horizontalAlignment = CenterHorizontally) {
                    Text(text = "$${raiseValue.toInt()}")
                    Text(text = "Raise")
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                isRaiseSliderVisible = false
                onCallClick.invoke()
            }) {
                Column(horizontalAlignment = CenterHorizontally) {
                    Text(text = "$$currentBid")
                    Text(text = "Call")
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    isRaiseSliderVisible = false
                    onFoldClick.invoke()
                }) {
                Column(horizontalAlignment = CenterHorizontally) {
                    Text(text = "$$currentBid")
                    Text(text = "Fold")
                }
            }

        }
        Spacer(modifier = Modifier.height(8.dp))
        AnimatedVisibility(visible = isRaiseSliderVisible) {
            Slider(
                modifier = Modifier
                    .padding(horizontal = 36.dp)
                    .fillMaxWidth(),
                valueRange = 0f..1000f,
                value = raiseValue,
                onValueChange = {
                    if (it < (currentBid * 2f)) return@Slider
                    raiseValue = it
                }
            )
        }
    }
}

@Preview
@Composable
fun PokerActionAreaPreview() {
    PokerAppTheme {
        PokerActionArea(
            onRaiseClick = {},
            onCallClick = {},
            onFoldClick = {}
        )
    }
}
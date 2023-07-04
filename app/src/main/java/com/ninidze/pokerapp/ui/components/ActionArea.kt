package com.ninidze.pokerapp.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.ui.LocalIsLandscape
import com.ninidze.pokerapp.utils.Constants.SMALL_BLIND

@Composable
fun PokerActionArea(
    modifier: Modifier = Modifier,
    currentBid: Int = SMALL_BLIND * 2,
    onRaiseClick: (Int) -> Unit,
    onCallClick: () -> Unit,
    onFoldClick: () -> Unit
) {
    val isLandscape = LocalIsLandscape.current
    val isRaiseSliderVisible = remember { mutableStateOf(false) }
    val raiseValue = remember { mutableStateOf((currentBid * 2f)) }

    if (isLandscape) {
        Row(
            modifier = modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                ActionButtons(
                    isRaiseSliderVisible = isRaiseSliderVisible,
                    raiseValue = raiseValue,
                    currentBid = currentBid,
                    onRaiseClick = onRaiseClick,
                    onCallClick = onCallClick,
                    onFoldClick = onFoldClick
                )
            }

            AnimatedVisibility(visible = isRaiseSliderVisible.value) {
                VerticalSlider(
                    modifier = Modifier
                        .padding(horizontal = 36.dp)
                        .fillMaxWidth(),
                    valueRange = 0f..1000f,
                    value = raiseValue.value,
                    onValueChange = {
                        if (it < (currentBid * 2f)) return@VerticalSlider
                        raiseValue.value = it
                    }
                )
            }
        }
    } else {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = CenterHorizontally
        ) {
            Row {
                ActionButtons(
                    isRaiseSliderVisible = isRaiseSliderVisible,
                    raiseValue = raiseValue,
                    currentBid = currentBid,
                    onRaiseClick = onRaiseClick,
                    onCallClick = onCallClick,
                    onFoldClick = onFoldClick
                )
            }
            Spacer(modifier = Modifier.height(8.dp))

            AnimatedVisibility(visible = isRaiseSliderVisible.value) {
                Slider(
                    modifier = Modifier
                        .padding(horizontal = 36.dp)
                        .fillMaxWidth(),
                    valueRange = 0f..1000f,
                    value = raiseValue.value,
                    onValueChange = {
                        if (it < (currentBid * 2f)) return@Slider
                        raiseValue.value = it
                    }
                )
            }
        }
    }
}

@Composable
private fun ActionButtons(
    isRaiseSliderVisible: MutableState<Boolean>,
    raiseValue: MutableState<Float>,
    currentBid: Int,
    onRaiseClick: (Int) -> Unit,
    onCallClick: () -> Unit,
    onFoldClick: () -> Unit
) {
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {
            isRaiseSliderVisible.value = !isRaiseSliderVisible.value
            if (!isRaiseSliderVisible.value) {
                onRaiseClick.invoke(raiseValue.value.toInt())
            }
        }) {
        Column(horizontalAlignment = CenterHorizontally) {
            Text(text = "$${raiseValue.value.toInt()}")
            Text(text = "Raise")
        }
    }
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {
            isRaiseSliderVisible.value = false
            onCallClick.invoke()
        }) {
        Column(horizontalAlignment = CenterHorizontally) {
            Text(text = "$$currentBid")
            Text(text = "Call")
        }
    }
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {
            isRaiseSliderVisible.value = false
            onFoldClick.invoke()
        }) {
        Column(horizontalAlignment = CenterHorizontally) {
            Text(text = "$$currentBid")
            Text(text = "Fold")
        }
    }
}

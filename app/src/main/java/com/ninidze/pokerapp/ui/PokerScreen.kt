package com.ninidze.pokerapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.ui.components.PokerActionArea
import com.ninidze.pokerapp.ui.components.PokerTable
import com.ninidze.pokerapp.ui.theme.BackgroundColor

@Composable
fun PokerScreen() {
    Column(
        modifier = Modifier
            .background(BackgroundColor)
            .fillMaxSize(),
        horizontalAlignment = CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PokerTable()
        Spacer(modifier = Modifier.height(12.dp))
        PokerActionArea(
            onRaiseClick = { },
            onCallClick = { },
            onFoldClick = { }
        )
    }
}
package com.ninidze.pokerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.models.PlayingCard
import com.ninidze.pokerapp.utils.CardImageMapper

@Composable
fun MyCards(
    modifier: Modifier = Modifier,
    first: PlayingCard,
    second: PlayingCard
) {
    Row(modifier = modifier) {
        Image(
            painter = painterResource(id = CardImageMapper.cards[first] ?: error("invalid card")),
            contentDescription = first.toString()
        )
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = CardImageMapper.cards[second] ?: error("invalid card")),
            contentDescription = second.toString()
        )
    }
}
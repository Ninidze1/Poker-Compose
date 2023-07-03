package com.ninidze.pokerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.models.Card
import com.ninidze.pokerapp.utils.CardImageMapper

@Composable
fun MyCards(
    modifier: Modifier = Modifier,
    first: Card,
    second: Card
) {
    Row(modifier = modifier) {
        Image(
            painter = painterResource(id = getCardImage(card = first)),
            contentDescription = first.toString()
        )
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = getCardImage(card = second)),
            contentDescription = second.toString()
        )
    }
}

@Composable
fun getCardImage(card: Card) = remember(card) {
    CardImageMapper.cards[card] ?: error("invalid card")
}
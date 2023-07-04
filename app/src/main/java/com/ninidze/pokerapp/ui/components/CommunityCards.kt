package com.ninidze.pokerapp.ui.components

import PlayingCardUI
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.models.Card
import com.ninidze.pokerapp.ui.LocalIsLandscape

@Composable
fun CommunityCards(communityCards: List<Card?>) {
    val flopCards = communityCards.take(3)
    val turnCard = communityCards.getOrNull(3)
    val riverCard = communityCards.getOrNull(4)
    val isLandscape = LocalIsLandscape.current

    if (isLandscape) {
        Row {
            communityCards.forEach { card ->
                PlayingCardUI(card = card)
            }
        }
    } else {
        Column(horizontalAlignment = CenterHorizontally) {
            Row {
                flopCards.forEach { card ->
                    PlayingCardUI(card = card)
                }
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                PlayingCardUI(card = turnCard)
                PlayingCardUI(card = riverCard)
            }
        }
    }
}
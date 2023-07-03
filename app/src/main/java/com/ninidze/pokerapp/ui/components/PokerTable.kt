package com.ninidze.pokerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.models.CardType
import com.ninidze.pokerapp.models.CardValue
import com.ninidze.pokerapp.models.PlayingCard
import com.ninidze.pokerapp.utils.Constants
import com.ninidze.pokerapp.utils.Constants.PLAYER_CARD_PADDING

@Composable
fun PokerTable() {
    var tableSize by remember { mutableStateOf(IntSize.Zero) }
    Box(
        modifier = Modifier,
        contentAlignment = Alignment.Center
    ) {
        // Draw the poker table
        Image(
            modifier = Modifier.onGloballyPositioned {
                tableSize = it.size
                println("Poker Table: ${it.size}")
            },
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_table),
            contentDescription = "Poker Table"
        )

        // Place players
        (0 until Constants.NUM_OF_PLAYERS).forEach { playerIndex ->
            if (playerIndex == 0) return@forEach
            PlayerUI(
                playerIndex = playerIndex,
                cash = 100,
                modifier = Modifier
                    .offset { getPlayerOffset(playerIndex, tableSize) }
            )
        }

        MyCards(
            modifier = Modifier
                .offset { IntOffset(0, (tableSize.height / 3) + PLAYER_CARD_PADDING) },
            first = PlayingCard(CardType.DIAMONDS, CardValue.ACE),
            second = PlayingCard(CardType.CLUBS, CardValue.ACE),
        )
    }
}

fun getPlayerOffset(playerIndex: Int, tableSize: IntSize): IntOffset {
    return when (playerIndex) {
        1 -> IntOffset(
            x = ((tableSize.width / 2) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
            y = ((tableSize.height / 5) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
        )

        2 -> IntOffset(
            x = -((tableSize.width / 2) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
            y = ((tableSize.height / 5) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
        )

        3 -> IntOffset(
            x = ((tableSize.width / 2) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
            y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
        )

        4 -> IntOffset(
            x = -((tableSize.width / 2) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
            y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - Constants.PLAYER_CARD_PADDING),
        )

        else -> IntOffset.Zero
    }
}
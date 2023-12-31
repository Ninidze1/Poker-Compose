package com.ninidze.pokerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.models.Card
import com.ninidze.pokerapp.models.CardType
import com.ninidze.pokerapp.models.CardValue
import com.ninidze.pokerapp.models.GameState
import com.ninidze.pokerapp.ui.LocalIsLandscape
import com.ninidze.pokerapp.utils.Constants
import com.ninidze.pokerapp.utils.Constants.PLAYER_CARD_PADDING

@Composable
fun PokerTable(gameState: GameState) {
    val isLandscape = LocalIsLandscape.current
    var tableSize by remember { mutableStateOf(IntSize.Zero) }

    Box(
        modifier = Modifier.let { landscapeModifier ->
            if (isLandscape) {
                landscapeModifier.fillMaxWidth(0.7f)
            } else {
                landscapeModifier
            }
        },
        contentAlignment = Alignment.Center
    ) {
        // Render Board
        Image(modifier = Modifier.onGloballyPositioned {
            tableSize = it.size
        }.let { landScapeModifier ->
            if (isLandscape) {
                landScapeModifier
                    .scale(1.5f)
                    .padding(20.dp)
                    .rotate(90f)
            } else {
                landScapeModifier
            }
        },
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_table),
            contentDescription = "Poker Table"
        )

        // Render Players
        (0 until Constants.PLAYER_COUNT).forEach { playerIndex ->
            if (playerIndex == 0) return@forEach
            PlayerUI(playerIndex = playerIndex,
                cash = gameState.players[playerIndex].chips,
                modifier = Modifier.offset { getPlayerOffset(playerIndex, tableSize, isLandscape) })
        }

        // Render Community Cards / Pot
        Column(
            modifier = Modifier.offset { IntOffset(0, -Constants.CARD_SIZE * 2) },
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Card {
                Text(
                    modifier = Modifier.padding(6.dp),
                    fontWeight = FontWeight.Bold,
                    text = "Pot: $${gameState.pot}"
                )
            }
            Spacer(modifier = Modifier.height(12.dp))
            CommunityCards(
                communityCards = listOf(
                    Card(CardType.DIAMONDS, CardValue.ACE),
                    Card(CardType.CLUBS, CardValue.JACK),
                    Card(CardType.HEARTS, CardValue.KING),
                    Card(CardType.SPADES, CardValue.THREE),
                    null,
                )
            )
        }

        // My Hand Cards
        MyCards(
            modifier = Modifier.offset {
                IntOffset(
                    x = 0, y = (tableSize.height / 3) + PLAYER_CARD_PADDING
                )
            },
            first = Card(CardType.DIAMONDS, CardValue.ACE),
            second = Card(CardType.CLUBS, CardValue.ACE),
        )
    }
}

fun getPlayerOffset(playerIndex: Int, tableSize: IntSize, isLandscape: Boolean): IntOffset {
    return if (isLandscape) {
        when (playerIndex) {
            1 -> IntOffset(
                x = -(((tableSize.width / 2) * 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = ((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            2 -> IntOffset(
                x = -(((tableSize.width / 2) * 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            3 -> IntOffset(
                x = (((tableSize.width / 2) * 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            4 -> IntOffset(
                x = (((tableSize.width / 2) * 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = ((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            else -> IntOffset.Zero
        }
    } else {
        when (playerIndex) {
            1 -> IntOffset(
                x = -((tableSize.width / 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = ((tableSize.height / 5) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            2 -> IntOffset(
                x = -((tableSize.width / 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            3 -> IntOffset(
                x = ((tableSize.width / 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = -((tableSize.height / 3) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            4 -> IntOffset(
                x = ((tableSize.width / 2) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
                y = ((tableSize.height / 5) - (Constants.CARD_SIZE) - PLAYER_CARD_PADDING),
            )

            else -> IntOffset.Zero
        }
    }
}

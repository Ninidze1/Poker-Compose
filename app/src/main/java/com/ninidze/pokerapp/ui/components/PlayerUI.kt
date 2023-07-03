package com.ninidze.pokerapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.utils.Constants.CARD_SIZE

@Composable
fun PlayerUI(
    playerIndex: Int,
    cash: Int,
    modifier: Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = CenterHorizontally
    ) {
        Box {
            Image(
                modifier = Modifier
                    .size(CARD_SIZE.dp)
                    .graphicsLayer {
                        if (playerIndex % 2 == 0) {
                            scaleX = -1f
                        }
                    }
                    .offset {
                        IntOffset(-CARD_SIZE * 2, 0)
                    },
                painter = painterResource(id = R.drawable.cards_hand_hidden),
                contentDescription = "Hidden cards"
            )
            Image(
                modifier = Modifier
                    .size(CARD_SIZE.dp)
                    .clip(RoundedCornerShape(10.dp)),
                painter = ColorPainter(Color.Blue),
                contentDescription = "Player Avatar"
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Card(
            modifier = Modifier,
            colors = CardDefaults.cardColors(),
        ) {
            Text(
                modifier = Modifier.padding(8.dp),
                fontWeight = Bold,
                text = "$$cash"
            )
        }
    }
}
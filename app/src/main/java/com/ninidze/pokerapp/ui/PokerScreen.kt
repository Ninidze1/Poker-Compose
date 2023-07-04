import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.models.GameState
import com.ninidze.pokerapp.ui.LocalIsLandscape
import com.ninidze.pokerapp.ui.components.PokerActionArea
import com.ninidze.pokerapp.ui.components.PokerTable
import com.ninidze.pokerapp.ui.theme.BackgroundColor

@Composable
fun PokerScreen(gameState: GameState, isLandscape: Boolean = false) {
    CompositionLocalProvider(LocalIsLandscape provides isLandscape) {
        if (isLandscape) {
            Row(
                modifier = Modifier
                    .background(BackgroundColor)
                    .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                PokerLayout(gameState)
            }
        } else {
            Column(
                modifier = Modifier
                    .background(BackgroundColor)
                    .fillMaxSize(),
                horizontalAlignment = CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                PokerLayout(gameState)
            }
        }
    }
}

@Composable
fun PokerLayout(gameState: GameState) {
    PokerTable(gameState)
    Spacer(modifier = Modifier.height(12.dp))
    PokerActionArea(
        onRaiseClick = { raisedBet ->
            println("raisedBet: $raisedBet")
        },
        onCallClick = { },
        onFoldClick = { }
    )
}
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.ninidze.pokerapp.models.PlayingCard
import com.ninidze.pokerapp.utils.CardImageMapper

@Composable
fun PlayingCardUI(card: PlayingCard) {
    Image(
        painter = painterResource(id = CardImageMapper.cards[card] ?: error("Invalid card")),
        contentDescription = "Playing Card: ${card.value} ${card.value}"
    )
}

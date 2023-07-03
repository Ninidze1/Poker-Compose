import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.models.Card
import com.ninidze.pokerapp.ui.components.getCardImage

@Composable
fun PlayingCardUI(
    modifier: Modifier = Modifier,
    card: Card?
) {
    Image(
        modifier = modifier.padding(horizontal = 2.dp),
        painter = painterResource(
            id = if (card == null) {
                R.drawable.card_back
            } else {
                getCardImage(card = card)
            }
        ),
        contentDescription = "Playing Card: ${card?.value} ${card?.value}"
    )
}

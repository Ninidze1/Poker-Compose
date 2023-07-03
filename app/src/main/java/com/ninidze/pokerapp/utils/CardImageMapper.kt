package com.ninidze.pokerapp.utils

import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.models.Card
import com.ninidze.pokerapp.models.CardType
import com.ninidze.pokerapp.models.CardValue

object CardImageMapper {
    val cards = mapOf(
        Card(CardType.SPADES, CardValue.TWO) to R.drawable.card_spades_2,
        Card(CardType.SPADES, CardValue.THREE) to R.drawable.card_spades_3,
        Card(CardType.SPADES, CardValue.FOUR) to R.drawable.card_spades_4,
        Card(CardType.SPADES, CardValue.FIVE) to R.drawable.card_spades_5,
        Card(CardType.SPADES, CardValue.SIX) to R.drawable.card_spades_6,
        Card(CardType.SPADES, CardValue.SEVEN) to R.drawable.card_spades_7,
        Card(CardType.SPADES, CardValue.EIGHT) to R.drawable.card_spades_8,
        Card(CardType.SPADES, CardValue.NINE) to R.drawable.card_spades_9,
        Card(CardType.SPADES, CardValue.TEN) to R.drawable.card_spades_10,
        Card(CardType.SPADES, CardValue.JACK) to R.drawable.card_spades_j,
        Card(CardType.SPADES, CardValue.QUEEN) to R.drawable.card_spades_q,
        Card(CardType.SPADES, CardValue.KING) to R.drawable.card_spades_k,
        Card(CardType.SPADES, CardValue.ACE) to R.drawable.card_spades_a,
        // Hearts
        Card(CardType.HEARTS, CardValue.TWO) to R.drawable.card_hearts_2,
        Card(CardType.HEARTS, CardValue.THREE) to R.drawable.card_hearts_3,
        Card(CardType.HEARTS, CardValue.FOUR) to R.drawable.card_hearts_4,
        Card(CardType.HEARTS, CardValue.FIVE) to R.drawable.card_hearts_5,
        Card(CardType.HEARTS, CardValue.SIX) to R.drawable.card_hearts_6,
        Card(CardType.HEARTS, CardValue.SEVEN) to R.drawable.card_hearts_7,
        Card(CardType.HEARTS, CardValue.EIGHT) to R.drawable.card_hearts_8,
        Card(CardType.HEARTS, CardValue.NINE) to R.drawable.card_hearts_9,
        Card(CardType.HEARTS, CardValue.TEN) to R.drawable.card_hearts_10,
        Card(CardType.HEARTS, CardValue.JACK) to R.drawable.card_hearts_j,
        Card(CardType.HEARTS, CardValue.QUEEN) to R.drawable.card_hearts_q,
        Card(CardType.HEARTS, CardValue.KING) to R.drawable.card_hearts_k,
        Card(CardType.HEARTS, CardValue.ACE) to R.drawable.card_hearts_a,
        // Diamonds
        Card(CardType.DIAMONDS, CardValue.TWO) to R.drawable.card_diamonds_2,
        Card(CardType.DIAMONDS, CardValue.THREE) to R.drawable.card_diamonds_3,
        Card(CardType.DIAMONDS, CardValue.FOUR) to R.drawable.card_diamonds_4,
        Card(CardType.DIAMONDS, CardValue.FIVE) to R.drawable.card_diamonds_5,
        Card(CardType.DIAMONDS, CardValue.SIX) to R.drawable.card_diamonds_6,
        Card(CardType.DIAMONDS, CardValue.SEVEN) to R.drawable.card_diamonds_7,
        Card(CardType.DIAMONDS, CardValue.EIGHT) to R.drawable.card_diamonds_8,
        Card(CardType.DIAMONDS, CardValue.NINE) to R.drawable.card_diamonds_9,
        Card(CardType.DIAMONDS, CardValue.TEN) to R.drawable.card_diamonds_10,
        Card(CardType.DIAMONDS, CardValue.JACK) to R.drawable.card_diamonds_j,
        Card(CardType.DIAMONDS, CardValue.QUEEN) to R.drawable.card_diamonds_q,
        Card(CardType.DIAMONDS, CardValue.KING) to R.drawable.card_diamonds_k,
        Card(CardType.DIAMONDS, CardValue.ACE) to R.drawable.card_diamonds_a,
        // Clubs
        Card(CardType.CLUBS, CardValue.TWO) to R.drawable.card_clubs_2,
        Card(CardType.CLUBS, CardValue.THREE) to R.drawable.card_clubs_3,
        Card(CardType.CLUBS, CardValue.FOUR) to R.drawable.card_clubs_4,
        Card(CardType.CLUBS, CardValue.FIVE) to R.drawable.card_clubs_5,
        Card(CardType.CLUBS, CardValue.SIX) to R.drawable.card_clubs_6,
        Card(CardType.CLUBS, CardValue.SEVEN) to R.drawable.card_clubs_7,
        Card(CardType.CLUBS, CardValue.EIGHT) to R.drawable.card_clubs_8,
        Card(CardType.CLUBS, CardValue.NINE) to R.drawable.card_clubs_9,
        Card(CardType.CLUBS, CardValue.TEN) to R.drawable.card_clubs_10,
        Card(CardType.CLUBS, CardValue.JACK) to R.drawable.card_clubs_j,
        Card(CardType.CLUBS, CardValue.QUEEN) to R.drawable.card_clubs_q,
        Card(CardType.CLUBS, CardValue.KING) to R.drawable.card_clubs_k,
        Card(CardType.CLUBS, CardValue.ACE) to R.drawable.card_clubs_a
    )
}
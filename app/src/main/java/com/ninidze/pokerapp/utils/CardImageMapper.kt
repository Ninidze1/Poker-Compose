package com.ninidze.pokerapp.utils

import com.ninidze.pokerapp.R
import com.ninidze.pokerapp.models.CardType
import com.ninidze.pokerapp.models.CardValue
import com.ninidze.pokerapp.models.PlayingCard

object CardImageMapper {
    val cards = mapOf(
        PlayingCard(CardType.SPADES, CardValue.TWO) to R.drawable.card_spades_2,
        PlayingCard(CardType.SPADES, CardValue.THREE) to R.drawable.card_spades_3,
        PlayingCard(CardType.SPADES, CardValue.FOUR) to R.drawable.card_spades_4,
        PlayingCard(CardType.SPADES, CardValue.FIVE) to R.drawable.card_spades_5,
        PlayingCard(CardType.SPADES, CardValue.SIX) to R.drawable.card_spades_6,
        PlayingCard(CardType.SPADES, CardValue.SEVEN) to R.drawable.card_spades_7,
        PlayingCard(CardType.SPADES, CardValue.EIGHT) to R.drawable.card_spades_8,
        PlayingCard(CardType.SPADES, CardValue.NINE) to R.drawable.card_spades_9,
        PlayingCard(CardType.SPADES, CardValue.TEN) to R.drawable.card_spades_10,
        PlayingCard(CardType.SPADES, CardValue.JACK) to R.drawable.card_spades_j,
        PlayingCard(CardType.SPADES, CardValue.QUEEN) to R.drawable.card_spades_q,
        PlayingCard(CardType.SPADES, CardValue.KING) to R.drawable.card_spades_k,
        PlayingCard(CardType.SPADES, CardValue.ACE) to R.drawable.card_spades_a,
        // Hearts
        PlayingCard(CardType.HEARTS, CardValue.TWO) to R.drawable.card_hearts_2,
        PlayingCard(CardType.HEARTS, CardValue.THREE) to R.drawable.card_hearts_3,
        PlayingCard(CardType.HEARTS, CardValue.FOUR) to R.drawable.card_hearts_4,
        PlayingCard(CardType.HEARTS, CardValue.FIVE) to R.drawable.card_hearts_5,
        PlayingCard(CardType.HEARTS, CardValue.SIX) to R.drawable.card_hearts_6,
        PlayingCard(CardType.HEARTS, CardValue.SEVEN) to R.drawable.card_hearts_7,
        PlayingCard(CardType.HEARTS, CardValue.EIGHT) to R.drawable.card_hearts_8,
        PlayingCard(CardType.HEARTS, CardValue.NINE) to R.drawable.card_hearts_9,
        PlayingCard(CardType.HEARTS, CardValue.TEN) to R.drawable.card_hearts_10,
        PlayingCard(CardType.HEARTS, CardValue.JACK) to R.drawable.card_hearts_j,
        PlayingCard(CardType.HEARTS, CardValue.QUEEN) to R.drawable.card_hearts_q,
        PlayingCard(CardType.HEARTS, CardValue.KING) to R.drawable.card_hearts_k,
        PlayingCard(CardType.HEARTS, CardValue.ACE) to R.drawable.card_hearts_a,
        // Diamonds
        PlayingCard(CardType.DIAMONDS, CardValue.TWO) to R.drawable.card_diamonds_2,
        PlayingCard(CardType.DIAMONDS, CardValue.THREE) to R.drawable.card_diamonds_3,
        PlayingCard(CardType.DIAMONDS, CardValue.FOUR) to R.drawable.card_diamonds_4,
        PlayingCard(CardType.DIAMONDS, CardValue.FIVE) to R.drawable.card_diamonds_5,
        PlayingCard(CardType.DIAMONDS, CardValue.SIX) to R.drawable.card_diamonds_6,
        PlayingCard(CardType.DIAMONDS, CardValue.SEVEN) to R.drawable.card_diamonds_7,
        PlayingCard(CardType.DIAMONDS, CardValue.EIGHT) to R.drawable.card_diamonds_8,
        PlayingCard(CardType.DIAMONDS, CardValue.NINE) to R.drawable.card_diamonds_9,
        PlayingCard(CardType.DIAMONDS, CardValue.TEN) to R.drawable.card_diamonds_10,
        PlayingCard(CardType.DIAMONDS, CardValue.JACK) to R.drawable.card_diamonds_j,
        PlayingCard(CardType.DIAMONDS, CardValue.QUEEN) to R.drawable.card_diamonds_q,
        PlayingCard(CardType.DIAMONDS, CardValue.KING) to R.drawable.card_diamonds_k,
        PlayingCard(CardType.DIAMONDS, CardValue.ACE) to R.drawable.card_diamonds_a,
        // Clubs
        PlayingCard(CardType.CLUBS, CardValue.TWO) to R.drawable.card_clubs_2,
        PlayingCard(CardType.CLUBS, CardValue.THREE) to R.drawable.card_clubs_3,
        PlayingCard(CardType.CLUBS, CardValue.FOUR) to R.drawable.card_clubs_4,
        PlayingCard(CardType.CLUBS, CardValue.FIVE) to R.drawable.card_clubs_5,
        PlayingCard(CardType.CLUBS, CardValue.SIX) to R.drawable.card_clubs_6,
        PlayingCard(CardType.CLUBS, CardValue.SEVEN) to R.drawable.card_clubs_7,
        PlayingCard(CardType.CLUBS, CardValue.EIGHT) to R.drawable.card_clubs_8,
        PlayingCard(CardType.CLUBS, CardValue.NINE) to R.drawable.card_clubs_9,
        PlayingCard(CardType.CLUBS, CardValue.TEN) to R.drawable.card_clubs_10,
        PlayingCard(CardType.CLUBS, CardValue.JACK) to R.drawable.card_clubs_j,
        PlayingCard(CardType.CLUBS, CardValue.QUEEN) to R.drawable.card_clubs_q,
        PlayingCard(CardType.CLUBS, CardValue.KING) to R.drawable.card_clubs_k,
        PlayingCard(CardType.CLUBS, CardValue.ACE) to R.drawable.card_clubs_a
    )
}
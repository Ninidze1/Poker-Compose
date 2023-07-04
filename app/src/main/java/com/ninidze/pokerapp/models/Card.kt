package com.ninidze.pokerapp.models

data class Card(
    val type: CardType,
    val value: CardValue
) {
    override fun toString(): String {
        return "${value.label} ${type.name}"
    }
}

enum class CardType {
    SPADES, HEARTS, DIAMONDS, CLUBS
}

enum class CardValue(val label: String) {
    TWO("2"), THREE("3"), FOUR("4"), FIVE("5"),
    SIX("6"), SEVEN("7"), EIGHT("8"),
    NINE("9"), TEN("10"), JACK("j"),
    QUEEN("q"), KING("k"), ACE("a")
}


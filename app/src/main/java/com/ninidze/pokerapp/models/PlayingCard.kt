package com.ninidze.pokerapp.models

data class PlayingCard(
    val type: CardType,
    val value: CardValue
) {
    override fun toString(): String {
        return "${value.label} ${type.name}"
    }
}


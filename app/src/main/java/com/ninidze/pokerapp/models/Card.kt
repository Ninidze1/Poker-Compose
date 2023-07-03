package com.ninidze.pokerapp.models

data class Card(
    val type: CardType,
    val value: CardValue
) {
    override fun toString(): String {
        return "${value.label} ${type.name}"
    }
}


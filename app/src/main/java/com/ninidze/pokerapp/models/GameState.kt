package com.ninidze.pokerapp.models

import com.ninidze.pokerapp.utils.Constants.SMALL_BLIND

data class GameState(
    val players: List<Player>,
    val communityCards: List<Card>,
    val pot: Int,
    val smallBlind: Int,
    val bigBlind: Int,
    val currentPlayer: Int,
    val currentBet: Int,
    val isFinished: Boolean
) {
    companion object {
        fun initialState(playerCount: Int): GameState {
            val players = (0 until playerCount).map { playerIndex ->
                Player.initialPlayer(playerIndex)
            }
            return GameState(
                players = players,
                communityCards = listOf(),
                pot = SMALL_BLIND * 3,
                smallBlind = SMALL_BLIND,
                bigBlind = SMALL_BLIND * 2,
                currentPlayer = 1,
                currentBet = SMALL_BLIND * 2,
                isFinished = false
            )
        }
    }
}

data class Player(
    val name: String,
    val chips: Int,
    val cards: List<Card>?,
    val bet: Int,
    val isFolded: Boolean,
    val isAllIn: Boolean
) {
    companion object {
        fun initialPlayer(playerIndex: Int): Player {
            return Player(
                name = "Player ${playerIndex + 1}",
                chips = 1000,
                cards = listOf(),
                bet = 0,
                isFolded = false,
                isAllIn = false
            )
        }
    }
}
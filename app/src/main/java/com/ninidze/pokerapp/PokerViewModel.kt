package com.ninidze.pokerapp

import androidx.lifecycle.ViewModel
import com.ninidze.pokerapp.models.GameState
import com.ninidze.pokerapp.utils.Constants.PLAYER_COUNT
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PokerViewModel : ViewModel() {
    private val _gameState = MutableStateFlow(GameState.initialState(PLAYER_COUNT))
    val gameState: StateFlow<GameState> = _gameState
}
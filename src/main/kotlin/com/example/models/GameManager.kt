package com.example.models

import java.util.concurrent.ConcurrentHashMap

class GameManager {
    private val games = ConcurrentHashMap<String, TicTacToeGame>()

    fun getAvailableGame(): TicTacToeGame? {
        // Look for a game with exactly one player
        return games.values.firstOrNull { !it.isGameFull() }
    }

    fun createGame(gameId: String): TicTacToeGame {
        val game = TicTacToeGame(gameId)
        games[gameId] = game
        return game
    }

    fun getGame(gameId: String): TicTacToeGame? {
        return games[gameId]
    }

    fun removeGame(gameId: String) {
        games.remove(gameId)
    }
}
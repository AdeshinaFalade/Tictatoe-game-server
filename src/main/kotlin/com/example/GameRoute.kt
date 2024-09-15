package com.example

import io.ktor.server.routing.*
import io.ktor.server.websocket.*
import io.ktor.websocket.*
import com.example.models.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import java.util.*


fun Route.createGame(gameManager: GameManager) {
    get("/create") {
        val gameId = generateGameId()
        val game = gameManager.getAvailableGame() ?: gameManager.createGame(gameId)
        call.respond(mapOf("gameId" to game.gameId))
    }
}

fun generateGameId(): String {
    return UUID.randomUUID().toString()
}
package com.example.plugins

import com.example.createGame
import com.example.models.*
import com.example.socket
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(gameManager: GameManager) {
    routing {
        socket(gameManager)

        createGame(gameManager)

        get("/hello") {
            call.respondText("Hello World!")
        }
    }
}

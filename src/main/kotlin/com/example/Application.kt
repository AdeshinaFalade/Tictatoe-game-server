package com.example

import com.example.models.*
import com.example.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val gameManager = GameManager()
    configureSockets()
    configureSerialization()
    configureMonitoring()
    configureRouting(gameManager)
}

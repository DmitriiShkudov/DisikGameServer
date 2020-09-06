package com.server.demo

import org.springframework.web.bind.annotation.RequestMapping

import org.springframework.web.bind.annotation.RestController


@RestController
class MessageController {

    @RequestMapping("/gameinfo/")
    fun indexGameInfo(): String {

        System.err.println("Gameinfo")
        return "Holy shiit."

    }

    @RequestMapping("/newplayer/")
    fun indexNewPlayer(): String {

        System.err.println("newplayer")
        return "Holy shiit!!!"

    }
}
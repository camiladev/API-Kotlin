package eu.edu.kotlinteste.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.awt.List



@RestController
@RequestMapping("/games")
class GameController {

    @GetMapping
    fun getGames(): ArrayList<String> {
        val gameList = ArrayList<String>()
        gameList.add("CS:GO")
        gameList.add("Candy Crush")
        gameList.add("Age of Empires")
        return gameList
    }

    //forma simplificada
//   @GetMapping("listaGames")
//   fun getGamesLista(): List = listOf<String>("CS:GO", "Candy Crush", "Age of Empires")
}
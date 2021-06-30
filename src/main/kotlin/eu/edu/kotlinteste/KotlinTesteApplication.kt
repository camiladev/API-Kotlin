package eu.edu.kotlinteste

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTesteApplication

fun main(args: Array<String>) {
	runApplication<KotlinTesteApplication>(*args)
}

//@RestController
//@RequestMapping("games")
//class GameController {
//
//	@GetMapping
//	fun getGames(): List{
//		val gameList = ArrayList()
//		gameList.add("CS:GO")
//		gameList.add("Candy Crush")
//		gameList.add("Age of Empires")
//		return gameList
//	}
//
//}
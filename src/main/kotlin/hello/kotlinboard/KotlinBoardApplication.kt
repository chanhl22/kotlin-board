package hello.kotlinboard

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinBoardApplication

fun main(args: Array<String>) {
    runApplication<KotlinBoardApplication>(*args)
}

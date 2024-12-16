package hello.kotlinboard.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(private val repository: HelloRepository) {

    @GetMapping("/hello")
    fun hello(): String {
        return "hello"
    }

    @PostMapping("/hello/hello")
    fun save(@RequestBody entity: HelloEntity): HelloEntity = repository.save(entity)

    @GetMapping("/hello/hello")
    fun findAll(): List<HelloEntity> = repository.findAll().toList()

}
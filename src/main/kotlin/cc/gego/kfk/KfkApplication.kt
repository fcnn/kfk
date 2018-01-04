package cc.gego.kfk

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KfkApplication

fun main(args: Array<String>) {
    runApplication<KfkApplication>(*args)
}

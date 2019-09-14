package com.profitserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProfitserverApplication

fun main(args: Array<String>) {
    runApplication<ProfitserverApplication>(*args)
}

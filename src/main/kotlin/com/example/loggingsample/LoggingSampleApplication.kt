package com.example.loggingsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LoggingSampleApplication

fun main(args: Array<String>) {
    runApplication<LoggingSampleApplication>(*args)
}

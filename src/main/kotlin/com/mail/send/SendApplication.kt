package com.mail.send

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SendApplication

fun main(args: Array<String>) {
	runApplication<SendApplication>(*args)
}

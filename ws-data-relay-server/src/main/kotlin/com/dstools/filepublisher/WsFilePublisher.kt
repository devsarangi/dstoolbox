package com.dstools.filepublisher

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WsDataRelayServerApplication

fun main(args: Array<String>) {
	runApplication<WsDataRelayServerApplication>(*args)
}

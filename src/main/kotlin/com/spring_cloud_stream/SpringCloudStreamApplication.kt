package com.spring_cloud_stream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudStreamApplication

fun main(args: Array<String>) {
    runApplication<SpringCloudStreamApplication>(*args)
}

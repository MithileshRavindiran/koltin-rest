package com.kotlin.rest.controller

import com.kotlin.rest.controller.service.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by mravindran on 07/05/20.
 */
@RestController
open class GreetingController(val greetingService: GreetingService) {

//    @Autowired
//    lateinit var greetingService: GreetingService


    @GetMapping("/greet")
    fun getGreeting(@RequestParam(value = "name", defaultValue = "World") name: String) : String {
        return greetingService.greetAppend(name)
    }
}
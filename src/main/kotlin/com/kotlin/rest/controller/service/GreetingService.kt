package com.kotlin.rest.controller.service

import org.springframework.stereotype.Service

/**
 * Created by mravindran on 07/05/20.
 */
@Service
class GreetingService {

    fun  greetAppend(name : String): String {
        return "Hello  Have a Nice Day ".plus(name.toUpperCase());
    }
 }
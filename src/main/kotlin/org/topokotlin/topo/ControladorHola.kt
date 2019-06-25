package org.topokotlin.topo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class ControladorHola{


    @GetMapping("/hola")
    fun hola():String{

        return "Hola mundo desde Kotlin"
    }
}
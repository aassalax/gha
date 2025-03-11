package com.learning.gha

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class TodosController(
    private val service: TodosService
) {

    @GetMapping
    fun getAllTodos() : ResponseEntity<Todos> {
        return ResponseEntity.ok(emptySet())
    }
}
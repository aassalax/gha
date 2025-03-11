package com.learning.gha

import org.springframework.stereotype.Service

@Service
class TodosService(
    private val repository: TodosRepository
) {
}
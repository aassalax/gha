package com.learning.gha

typealias Todos = Collection<Todo>

data class Todo(
    val id: Long,
    val title: String,
    val status: Status,
    val author: User,
)

enum class Status {
    NOT_STARTED,
    IN_PROGRESS,
    COMPLETE,
    ABORTED
}

data class User(val id: Long, val name: String)
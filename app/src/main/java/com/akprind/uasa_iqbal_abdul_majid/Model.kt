package com.iqbal_abdul_majid.myapplication

class Model {
    lateinit var id: String
    lateinit var title: String
    lateinit var userId: String
    var completed: Boolean = false

    constructor(id: String, title: String, userId: String, completed: Boolean) {
        this.id = id
        this.title = title
        this.userId = userId
        this.completed = completed
    }

    constructor()
}
package com.rjhwork.mycompany.singletonpattern

class CurrentUser private constructor() {

    private var name:String = ""

    companion object {
        private val user = CurrentUser()

        fun getUser():CurrentUser {
            return user
        }
    }

    fun setName(n : String) {
        name = n
    }

    fun outputName() {
        println(name)
    }
}
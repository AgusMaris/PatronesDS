package com.example.patronesds.state

abstract class Estado{
    abstract fun timbre():Int
}

class Normal : Estado(){
    override fun timbre():Int{
        println("Normal")
        return 5
    }
}

class Reunion: Estado(){
    override fun timbre():Int{
        println("Silencio")
        return 1
    }
}

class AireLibre: Estado(){
    override fun timbre():Int{
        println("Fuerte")
        return 10
    }
}
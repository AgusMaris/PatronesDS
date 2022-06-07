package com.example.patronesds.observer

interface IObserver{
    fun Update()
}

class Tablero(private val arco:Arco, private val nombre: String) : IObserver{
    override fun Update() {
        println("-----------------------------------------------------")
        println("$nombre")
        println("Goles: ${arco.getGoles()}")
        println("-----------------------------------------------------")
    }
}
package com.example.patronesds.observer


fun main() {
    // Creo los arcos
    val arcoLocal: Arco = Arco()
    val arcoVisitante: Arco = Arco()

    // Creo los tableros
    val tableroLocal1: Tablero = Tablero(arcoLocal, "Tablero Local 1")
    val tableroLocal2: Tablero = Tablero(arcoLocal, "Tablero Local 2")

    val tableroVisitante1: Tablero = Tablero(arcoVisitante, "Tablero Visitante 1")
    val tableroVisitante2: Tablero = Tablero(arcoVisitante, "Tablero Visitante 2")


    // Agrego cada tablero a la lista de observadores de los arcos
    arcoLocal.Agregar(tableroLocal1)
    arcoLocal.Agregar(tableroLocal2)

    arcoVisitante.Agregar(tableroVisitante1)
    arcoVisitante.Agregar(tableroVisitante2)

    arcoLocal.setGoles(1)
    arcoLocal.setGoles(2)

    arcoVisitante.setGoles(1)

    println("Fin")

}
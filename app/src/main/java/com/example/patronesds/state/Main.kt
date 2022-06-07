package com.example.patronesds.state;

fun main(){
    val telefono = Telefono()
    telefono.sonar()

    val reunion=Reunion()
    telefono.setearEstado(reunion)
    telefono.sonar()

    telefono.setearEstado(AireLibre())
    telefono.sonar()

    telefono.setearEstado(Normal())
    telefono.sonar()
}
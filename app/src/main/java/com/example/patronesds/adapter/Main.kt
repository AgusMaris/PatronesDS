package com.example.patronesds.adapter

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main(){
    // Se desconoce el origen y operaciones de el adaptado
    // Se debe suponer que el adaptado ya esta instanciado
    // Pero para que funcione en este ejemplo se debe instanciarlo
    val adaptado = Factura()

    val adaptador:IAdaptador = Adaptador(adaptado)
    println("Cliente: ${adaptador.VerFechaFormateada()}")
}
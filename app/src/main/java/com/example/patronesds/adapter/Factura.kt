package com.example.patronesds.adapter

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
class Factura {
    private var fechaFactura: LocalDate = LocalDate.now()

    fun verFecha(): String {
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fechaString = fechaFactura.format(formatter)
        println("Fecha desde el adaptado: $fechaString")
        return fechaString
    }
}
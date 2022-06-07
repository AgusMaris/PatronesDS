package com.example.patronesds.adapter
import android.os.Build
import androidx.annotation.RequiresApi

interface IAdaptador{
    fun VerFechaFormateada():String
}

@RequiresApi(Build.VERSION_CODES.O)
class Adaptador(val factura:Factura):IAdaptador{
    override fun VerFechaFormateada():String {
        val fecha= factura.verFecha()
        val fechaAdaptada=fecha.substring(6,10)+fecha.substring(3,5)+fecha.substring(0,2)

        println("Fecha desde el adaptador: $fechaAdaptada")
        return fechaAdaptada

    }
}


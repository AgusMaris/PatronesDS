package com.example.patronesds.state;

class Telefono(private var estado:Estado=Normal()){

    fun sonar(){
        println("Sonando...")
        estado.timbre()
    }

    fun setearEstado(estado:Estado){
        this.estado=estado
    }


}
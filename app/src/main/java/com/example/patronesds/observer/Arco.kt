package com.example.patronesds.observer

interface IObservable {
    fun Agregar(observer: IObserver)
    fun Eliminar(observer: IObserver)
    fun Notificar()
}


class Arco : IObservable {
    private var observers: ArrayList<IObserver> = ArrayList()
    private var goles: Int =0

    fun getGoles(): Int {
        return goles
    }

    fun setGoles(valor: Int) {
        this.goles = valor
        this.Notificar()
    }

    override fun Agregar(observer: IObserver) {
        observers.add(observer)
    }

    override fun Eliminar(observer: IObserver) {
        observers.remove(observer)
    }

    override fun Notificar() {
        println("Notificando a los tableros...")
        for (observer in observers) {
            observer.Update()
        }
    }


}
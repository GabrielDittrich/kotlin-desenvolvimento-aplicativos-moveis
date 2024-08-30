interface Veiculos {
    fun mover()
}

class Bicicleta: Veiculos {
    override fun mover() {
        println("A bicicleta está se movendo")
    }
}

class Carros: Veiculos{
    override fun mover() {
        println("O carro está se movendo")
    }
}

fun main(){
    val bi = Bicicleta()
    val car = Carros()

    bi.mover()
    car.mover()
}
abstract class Forma {
    abstract fun calcularArea() : Double

}

class Circulo(val raio: Float) : Forma(){
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

class Retangulo(val larg: Double, val alt:Double) : Forma(){
    override fun calcularArea(): Double {
        return larg * alt
    }
}

fun main(){
    val cir = Circulo(5.0f)
    val ret = Retangulo(4.0,5.0)

    println("Área do circulo ${cir.calcularArea()}")
    println("Área do retângulo ${ret.calcularArea()}")

}
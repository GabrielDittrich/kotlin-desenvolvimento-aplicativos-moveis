open class Veiculo(val modelo: String ){
    open fun ligarMotor(){
     println("Motor ligado");
 }
}

class Carro(modelo: String) : Veiculo(modelo){
    override fun ligarMotor() {
    println("$modelo Vrum Vrum")
    }
}

class Moto(modelo : String) : Veiculo(modelo){
    override fun ligarMotor() {
        println("$modelo Randandandandandandan")
    }
}

fun main() {

    println("Informe o carro: ")
    val nomeCarro = readln()
    val ca = Carro(nomeCarro)

    ca.ligarMotor()

    println("\nInforme a moto: ")
    val nomeMoto = readln()
    val mo = Moto(nomeMoto)

    mo.ligarMotor()
}
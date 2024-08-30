abstract class Funcionario {
    abstract fun calcularBonus() : Double

}
    class Programador(val salario: Float) : Funcionario(){
        override fun calcularBonus(): Double {
        return salario * 0.10;
        }
    }

    class Gerente(val salario: Float): Funcionario(){
        override fun calcularBonus(): Double {
        return salario * 0.10
    }
}

fun main(){
    val pro = Programador(2200.00f)
    val ge = Gerente(2200.00f)

    pro.calcularBonus()
    ge.calcularBonus()

    println("Salário do Programador: ${pro.calcularBonus()}")
    println("Salário do Gerente: ${pro.calcularBonus()}")
}

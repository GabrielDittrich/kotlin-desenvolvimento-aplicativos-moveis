interface Trabalhador {
    fun trabalhar()
}

class Professor : Trabalhador{
    override fun trabalhar() {
        println("Professor dando aula")
    }
}

class Engenheiro() : Trabalhador{
    override fun trabalhar() {
       println("Engenheiro montando a casa")
    }
}

fun main(){
    val eng = Engenheiro()
    val pro = Professor()

    eng.trabalhar()
    pro.trabalhar()

}
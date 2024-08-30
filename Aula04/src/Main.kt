class Carro (var marca: String, var modelo: String) {
    /* EM JAVA
      String marca;
      String modelo;

      Carro(String marca, String modelo){

      this.marca = marca;
      this.modelos = modelo;
      }     */

    private var preco : Float = 1000.0f

    constructor(marca: String) : this(marca, "sem modelo")

    /*var marca : String = "A"
    var modelo : String = "B"*/

    fun detalhes(){
        println("\n-----------------")
        println("Detalhes do Carro: ")
        println(" > Marca: $marca")
        println(" > Modelo: $modelo")
        println(" > Preco: $preco")
        println("-----------------\n")
    }

    fun setPreco(novoPreco: Float){
        preco = novoPreco
    }

    fun getPreco() : Float {
        return preco
    }
}

class AtividadeCelular(val marca: String,val modelo: String, val preco: Float){

    fun detalhe(){
        println("-->Marca: $marca, -->Modelo: $modelo, -->Preco: R$ $preco")
    }
}

open class Animal(var nome: String){
    open fun som(){
        println("O animal fez barulho...")
    }
}

class Cachorro(nome: String) : Animal(nome) {

    override fun som() {
        println("AuAu")
    }
}

    fun main() {
        val meuCarro = Carro("AAA", "BBBB")
        val outroCarro = Carro("CCC")

        // meuCarro.marca = "azul"
        // meuCarro.modelo = "grande"
        // println(meuCarro.marca)
        // println(meuCarro.modelo)
        // meuCarro.preco = 2000.0f
        // outroCarro.preco = 50000.0f

/*
        outroCarro.setPreco(50000.0f)
        meuCarro.setPreco(19.99f)

        meuCarro.detalhes()
        outroCarro.detalhes()
 */

//    val celular = AtividadeCelular("Samsung","A14",999f)
//    celular.detalhe()

      val ca = Cachorro("rex")
      println(ca.nome)

      ca.som()
}


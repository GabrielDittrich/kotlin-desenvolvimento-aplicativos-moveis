fun imprimirNome(nome:String?){

   if(nome != null){
      println(nome)
      println(nome.length)
   }else
   println("Erro")
}

fun main() {
/*
   println("Digite uma frase")
   val texto = readLine() ?: ""

   val vogais = "aeiou"
   var contador = 0

   for(letra in texto){
      if(letra in vogais ){
         contador++
      }
   }
   println("vogais: $contador")
*/
/*
   println("Digite uma palavra: ")
   val palavra = readLine() ?: ""
   val palavraR = palavra.reversed().repeat(3)

   println("$palavra -- $palavraR")
*/
/*
   println("Digite um texto")
   var texto = readLine()

   println("Digite o indice: ")
   var indice = readLine()

   println("Digite o final: ")
   var final = readLine()

   val intIndice = indice?.toIntOrNull()
   val intFinal = final?.toIntOrNull()

   if (texto != null && intIndice != null && intFinal != null) {
      val textoFinal = texto.substring(intIndice, intFinal)
      println("Resultado: $textoFinal")
   } else {
      println("Erro: Índices inválidos ou texto nulo.")
   }
*/
/*
println("Digite uma palavra: ")
   var palavra = readLine()

   if (palavra != null){
      println(palavra.length)
   }else {
      println("Nao deu boa")
   }
*/
/*
println("Digite uma palavra: ")
   var palavr = readLine()

   if(palavr != null) {
     var novPalavr = palavr.replace(" ", "-")
      println(novPalavr)
      return
   }
   return println("Não deu certo");
*/
/*
   println("Digite a primeira nota: ")
   var num1 = readLine()
   println("Digite a segunda nota:")
   var num2 = readLine()
   println("Digite a terceira nota")
   var num3 = readLine()

   var num1f = num1?.toFloatOrNull()
   var num2f = num2?.toFloatOrNull()
   var num3f = num3?.toFloatOrNull()

   if (num1f != null && num2f != null && num3f != null){
   var notaFinal = (num1f+num2f+num3f)/3
      println("A sua media final é: $notaFinal")
      return
   }
   return println("Não deu boa :( tente denovo")
*/


}


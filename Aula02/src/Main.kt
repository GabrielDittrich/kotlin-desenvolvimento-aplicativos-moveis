import java.io.DataInput
import kotlin.Unit.toString

fun saoAnagramas(str1: String, str2: String): Boolean {
  // Normalizar as Strings
  val normalizada1 = str1.toLowerCase().replace(" ", "")
  val normalizada2 = str2.toLowerCase().replace(" ", "")

  // Ordenar os caracteres
  val ordenada1 = normalizada1.toCharArray().sorted()
  val ordenada2 = normalizada2.toCharArray().sorted()

  // Comparar as Strings ordenadas
  return ordenada1 == ordenada2
}
fun atividadeAnagrama(){
  println("Digite a primeira String: ")
  var string1 : String? = readLine()

  println("Digite a segunda String")
  var string2 : String? = readLine()

  string1 = string1.toString()
  string2 = string2.toString()

  if (saoAnagramas(string1, string2)) {
    println("\"$string1\" e \"$string2\" são anagramas.")
  } else {
    println("\"$string1\" e \"$string2\" não são anagramas.")
  }

}
fun SaoPalindromo(str1: String,str2: String): Boolean{
  val padronizar1 = str1.toLowerCase().replace(" ","")
  val padronizar2 = str2.toLowerCase().replace(" ","")

  val reverter = padronizar2.reversed()

return padronizar1 == reverter
}
fun atividadePalindromo() {
  println("Digite a primeira String: ")
  var str1: String? = readLine()
  println("Digite a segunda String: ")
  var str2: String? = readLine()

  str1 = str1.toString()
  str2 = str2.toString()

  if (SaoPalindromo(str1, str2)) {
    println("\"$str1\" e \"$str2\" são palíndromos uma da outra.")
  } else {
    println("\"$str1\" e \"$str2\" não são palíndromos uma da outra.")
  }
}
fun atividadeDesconto(){
  println("Digite o valor do produto: R$")
  val valorProduto = readLine()?.toFloat() ?: 0.0f
  println("Digite o valor do desconto: R$")
  val valorDesconto = readLine()?.toFloat() ?: 0.0f

  val valorFinal = (valorProduto*valorDesconto/100)
  println("Valor com desconto é R$ $valorFinal")

}
fun switch(){
  val dia = 3
  val nome = when(dia){
    1 -> "Domingo"
    2 -> "Segunda"
    else -> "outro dia"
  }
}

fun percorrerFruta(){

  val frutas = listOf("Maça","Banana","Laranja")

  for ((indice, fruta) in frutas.withIndex()){
    println("$indice --- $fruta")
  }
}

fun comprimirString(input: String): String{
if (input.isEmpty()) return ""

  val stringBuilder = StringBuilder()
  var contador = 1

  for (i  in 1 until input.length){
    if (input[i] == input[i - 1]){
      contador++
    }else{
      stringBuilder.append(input[i - 1])
      stringBuilder.append(contador)
      contador = 1
    }
  }
  stringBuilder.append(input.last())
  stringBuilder.append(contador)

  return stringBuilder.toString()
}
fun atividadeComprimirString(){
println("Digite uma String")
  var original : String? = readLine()
  original = original.toString()

  val comprimido = comprimirString(original)

println("Original: $original")
  println("Comprimido: $comprimido")
}

fun atividadeIntercalarClasse(){
  println("Digite a primeira String: ")
  var strin1 = readLine()
  println("Digite a segunda String ( de mesmo comprimento ): ")
  var strin2 = readLine()

  for ((contador) in str1)
}
fun main() {
// atividadeAnagrama()
// atividadePalindromo()
// atividadeDesconto()
// switch()
// percorrerFruta()
//atividadeComprimirString()

}

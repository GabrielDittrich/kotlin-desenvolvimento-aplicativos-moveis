fun main() {

    val temperaturas = floatArrayOf(12.0f,24.0f,19.2f,10.0f,32.0f)

    var max: Float = temperaturas[0]
    var min: Float = temperaturas[0]

    for(temp in temperaturas){
        println("Max: $max --- Temp: $temp")
        println()

        if (temp > max){
            max = temp
        }

        if (temp<min){
            min = temp
        }
    }
println("Max: $max")
println("Min: $min")
}
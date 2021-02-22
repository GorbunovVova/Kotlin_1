fun main(args: Array<String>) {

//    Преобразуйте  var five: Char = '5' в String, Byte, Short, Int, Double, FLoat и Long
    var five: Char = '5'
    var fiveString = five.toString()
    var fiveByte = five.toByte()
    var fiveShort = five.toShort()
    var fiveInt = five.toInt()
    var fiveDouble = five.toDouble()
    var fiveFloat = five.toFloat()
    var fiveLong = five.toLong()
    println(fiveString + " " + fiveByte + " " + fiveShort + " " + fiveInt + " " + fiveDouble + " " + fiveFloat + " " + fiveLong)
/*    Формулировка задания не совсем ясна
    В данном случае Char '5' преобразуется в Int 53(как и другие числовые типы), если же в задании нужно получить Int 5 , то нужно сделать так - var fiveInt = five.toString().toInt()*/

}
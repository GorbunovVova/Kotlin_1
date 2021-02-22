fun main(args: Array<String>) {

//    Напишите программу, которая запрашивает у пользователя два числа в переменные “a” и “b”. Проверьте больше ли "a" чем "b" и получите результат в виде переменой типа boolean.
    println("Введите первое число:")
    var a = readLine()
    var aToDouble = a!!.toDouble()
    println("Введите второе число:")
    var b = readLine()
    var bToDouble = b!!.toDouble()
    var isFirstBiggerThanSecond = aToDouble > bToDouble
    println(isFirstBiggerThanSecond)

}
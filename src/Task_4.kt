fun main(args: Array<String>) {

//    Напишите программу, запрашивающую имя пользователя и выводящую приветствие пользователя в консоль, после ввода имени.
    println("Введите имя пользователя:")
    var userName: String? = readLine()
    var stringUserName: String = userName.toString()
    print("Добро пожаловать, $stringUserName!")

}
fun main()
{
    println("Введите первую цифру:")
    val s1 = readLine()?.toIntOrNull()

    println("Введите вторую цифру:")
    val s2 = readLine()?.toIntOrNull()

    if (s1 != null && s2 != null && s1 in 0..9 && s2 in 0..9 && s1 != s2)
    {
        val a1 = s1 * 10 + s2
        val a2 = s2 * 10 + s1

        if (a1 % 2 != 0)
        {
            println(a1)
        }

        else if (a2 % 2 != 0)
        {
            println(a2)
        }

        else
        {
            println("Создать нечетное число невозможно")
        }
    }

    else
    {
        println("Введите две разные цифры от 0 до 9.")
    }
}

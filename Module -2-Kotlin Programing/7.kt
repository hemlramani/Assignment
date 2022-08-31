fun main()
{
    println("Enter the Number ")
    var number = readLine()!!.toInt()

    if(number%2==0)
    {
        println("$number is Even")
    }
    else
    {
        println("$number is Odd")
    }
}
fun main()
{
    println("Enter the First Number : ")
    var num1 = readLine()!!.toFloat()

    println("Enter the Second Number : ")
    var num2 = readLine()!!.toFloat()

    var quotient = num1/num2
    var remainder = num1%num2

    println("Quotient is $quotient")
    println("Remainder is $remainder")
    
}

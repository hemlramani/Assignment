fun main()
{

    println("Enter First Number")
    var x= readLine()!!.toInt()
    println("Enter Second Number")
    var y= readLine()!!.toInt()
    println("Enter Third Number")
    var z= readLine()!!.toInt()

    max(x,y,z)

}

fun max(num1:Int,num2:Int,num3:Int)
{




    var a = if(num1>num2) num1 else num2

    var b = if(a>num3) a else num3

    println("$num1,$num2 and $num3 Maximum Number is $b")
}

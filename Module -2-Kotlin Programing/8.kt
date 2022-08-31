fun main()
{
    println("Enter your String ")
    var str = readLine()

    println("Enter Your Character")
    var ch = readLine()!![0]

    var frequency = 0

    for (i in 0..str!!.length-1)
    {
        if(ch == str[i])
        {
            frequency++
        }
    }

    println("Frequency of $ch = $frequency")
}
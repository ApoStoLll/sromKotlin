
val lab1 = Lab1()
val lab2 = Lab2()

fun main(){
    checkLab2()
    //checkLab1()
}

fun checkLab2(){
    val num1 = Digit(
        beta = 2,
        hex = "D4D2110984907B5625309D956521BAB4157B8B1ECE04043249A3D379AC112E5B9AF44E721E148D88A942744CF56A06B92D28A0DB950FE4CED2B41A0BD38BCE7D0BE1055CF5DE38F2A588C2C9A79A75011058C320A7B661C6CE1C36C7D870758307E5D2CF07D9B6E8D529779B6B2910DD17B6766A7EFEE215A98CAC300F2827DB"
    )
    val num2 = Digit(
        beta = 2,
        hex = "3A7EF2554E8940FA9B93B2A5E822CC7BB262F4A14159E4318CAE3ABF5AEB1022EC6D01DEFAB48B528868679D649B445A753684C13F6C3ADBAB059D635A2882090FC166EA9F0AAACD16A062149E4A0952F7FAAB14A0E9D3CB0BE9200DBD3B0342496421826919148E617AF1DB66978B1FCD28F8408506B79979CCBCC7F7E5FDE7"
    )
    val num3 = Digit(
        beta = 2,
        hex = "9AF44E721E148D88A942745E822CC7BB262F4A14159E4318CAE3ABF5AEB1022EC6D"
    )
    val num4 = Digit(
        beta = 2,
        hex = "9AF44E72A9B93B2A5E822CC7BB262F4A14159F4A14159E43121E148D88A9427442EC8868679D649B445A753684C13F6C3ADBAB0596D"
    )
    val numToTest = Digit(
        beta = 2,
        hex = "491"
    )
    val numToTest2 = Digit(
        beta = 2,
        hex = "F31"
    )
    val numToTest3 = Digit(
        beta = 2,
        hex = "F1"
    )
    //gcd2(num2, num1)
    //lcm2(num1, num2)
    //addMod2(num1, num2, num3)
    //subMod2(num1, num2, num3)
    //mulMod2(num1, num2, num3)
    //powerMod2(num1, num2, num3)
    //test21(num1, num2, num4, num3)
    test22(numToTest,numToTest2,numToTest3)
}

fun gcd2(num1: Digit, num2: Digit){
    val res = lab2.gcd(num2.binary, num1.binary)
    println(res.getNumber(2).hex)
}

fun lcm2(num1: Digit, num2: Digit){
    val res = lab2.lcm(num1.binary, num2.binary)
    println(res.getNumber(2).hex)
}

fun addMod2(num1 : Digit, num2 : Digit, num3: Digit){
    val res = lab2.addMod(num1.binary, num2.binary, num3.binary)
    println(res.getNumber(2).hex)
}

fun subMod2(num1 : Digit, num2 : Digit, num3: Digit){
    val res = lab2.subMod(num1.binary, num2.binary, num3.binary)
    println(res.getNumber(2).hex)
}

fun mulMod2(num1 : Digit, num2 : Digit, num3: Digit){
    val res = lab2.mulMod(num1.binary, num2.binary, num3.binary)
    println(res.getNumber(2).hex)
}

fun powerMod2(num1 : Digit, num2 : Digit, num3: Digit){
    val res = lab2.gorner(num1.binary, num2.binary, num3.binary)
    println(res.getNumber(2).hex)
}

fun test21(num1 : Digit, num2: Digit, num3: Digit, mod : Digit){
    val n12 = lab2.addMod(num1.binary, num2.binary, mod.binary)
    val n12s3 = lab2.mulMod(n12, num3.binary, mod.binary)
    val n123 = lab2.mulMod(num3.binary, n12, mod.binary)

    val n13 = lab2.mulMod(num1.binary, num3.binary, mod.binary)
    val n23 = lab2.mulMod(num2.binary, num3.binary, mod.binary)
    val n123s = lab2.addMod(n13, n23, mod.binary)
    if(n123s == n123)
        println("Ok")
    else
        println("Wrong")
}

fun test22(num1 : Digit, num2: Digit, num3: Digit){
    val numNA = lab2.mulMod(num1.binary, num2.binary, num3.binary)
    var b = mutableListOf<Int>()
    for(i in 0 until num1.decimal.toInt())
        b = lab2.addMod(b, num2.binary, num3.binary) as MutableList<Int>
    if(numNA == b)
        println("Ok")
    else println("Wrong")
}

fun checkLab1(){
    var beta = 1024
    val num1 = Digit(
        beta,
        "D4D2110984907B5625309D956521BAB4157B8B1ECE04043249A3D379AC112E5B9AF44E721E148D88A942744CF56A06B92D28A0DB950FE4CED2B41A0BD38BCE7D0BE1055CF5DE38F2A588C2C9A79A75011058C320A7B661C6CE1C36C7D870758307E5D2CF07D9B6E8D529779B6B2910DD17B6766A7EFEE215A98CAC300F2827DB"
    )
    val num2 = Digit(
        beta = beta,
        hex = "3A7EF2554E8940FA9B93B2A5E822CC7BB262F4A14159E4318CAE3ABF5AEB1022EC6D01DEFAB48B528868679D649B445A753684C13F6C3ADBAB059D635A2882090FC166EA9F0AAACD16A062149E4A0952F7FAAB14A0E9D3CB0BE9200DBD3B0342496421826919148E617AF1DB66978B1FCD28F8408506B79979CCBCC7F7E5FDE7"
    )
    val num1Div = Digit(
        beta = 2,
        hex = "B"
    )
    val num2Div = Digit(
        beta = 2,
        hex = "9B"
    )
    //print(num1.binary.size)
    //add1(num1Div, num2Div, 2)
    //sub1(num1, num2)
    //mul1(num1Div, num2Div, beta)
    //div1(num1, num2)
    power1(num1Div, num2Div)
    //test11(num1, num2, num1Div)
    //test12(num1Div.apply { beta = 1024 }, num2Div.apply { beta = 1024 })
}

fun add1(num1 : Digit, num2 : Digit, beta : Int){
    val resAdd = lab1.add(num1.bigNum, num2.bigNum, beta).getNumber(beta = beta)
    println(resAdd.hex)
}

fun sub1(num1 : Digit, num2 : Digit, beta : Int){
    val resSub = lab1.sub(num1.bigNum, num2.bigNum, beta).getNumber(beta = beta)
    println(resSub.hex)
}

fun mul1(num1 : Digit, num2 : Digit, beta : Int){
    val resMul = lab1.mul(num1.bigNum, num2.bigNum, beta).getNumber(beta = beta)
    println(resMul.hex)
}

fun power1(num1 : Digit, num2 : Digit){
    println("num1 : ${num1.binary}, num2 : ${num2.binary}")
    val resPower = lab1.power(num1.binary, num2.binary)
    //println(resPower.getNumber().binary)
    println(resPower.getNumber(2).hex)
}

fun div1(num1 : Digit, num2: Digit){
    val resDiv = lab1.div(num2.binary, num1.binary)
    val q = resDiv.q.getNumber(beta = 2)
    val r = resDiv.r.getNumber(beta = 2)
    println(q.hex)
}

fun test11(num1 : Digit, num2: Digit, num3 : Digit){
    val sum12 = lab1.add(num1.bigNum, num2.bigNum, 1024)
    val sum12mul3 = lab1.mul(sum12, num3.bigNum, 1024)
    val n3m1s2 = lab1.mul(num3.bigNum, sum12, 1024)

    val n1m3 = lab1.mul(num1.bigNum, num3.bigNum, 1024)
    val n2m3 = lab1.mul(num2.bigNum, num3.bigNum, 1024)
    val n123 = lab1.add(n1m3, n2m3, 1024)
    if(n3m1s2 == sum12mul3 && n3m1s2 == n123)
        println("Ok")
    else println("Wrong")
}

fun test12(num1 : Digit, num2 : Digit){
    var nSum = mutableListOf<Int>()
    for(i in 0 until num1.decimal.toInt())
        nSum = lab1.add(nSum, num2.bigNum, 2) as MutableList<Int>
    val numNa = lab1.mul(num1.bigNum, num2.bigNum, 2)
    println("nSum : $nSum, na : $numNa")
    if(numNa == nSum)
        println("Ok")
    else println("Wrong")
}
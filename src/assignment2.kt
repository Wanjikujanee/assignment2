fun main(){
    printName("Jane")
    var result=getRemainder(7,3)
    println(result)
    var sum=Sum(3,6,9,1)
    println(sum)
    interestingFunFact("dancing")

}

fun printName(name:String){
    println("Hello" + " " + name)
}
fun getRemainder(num1:Int,num2:Int):Int{
    var modulus=num1 % num2
    return modulus
}
fun Sum(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return sum
}
fun interestingFunFact(fact:String){
    println("i like" +" " + fact)
}



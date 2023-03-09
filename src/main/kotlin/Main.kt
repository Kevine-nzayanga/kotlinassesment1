fun main() {
var title= names("drivers","Drinks")
 var numbers = digits(arrayOf(12,45,36,78,13,1))

    var separate= sentence("Maiden")
var allofit= paragraph(arrayOf("I", "will", "sleep","late"))

    var calculations=calculator(56,34,67,10,2)

calculations.addition()
    calculations.subtraction()
    calculations.division()
    calculations.multiplication()

}



//1. Write and invoke a function that takes in any 2 strings and returns the first
//character of the longer string or the first character of the first string if they are
//equal in length.
fun names(name1:String,name2:String):Unit {
    var length1 = name1.length
    var length2 = name2.length
    println(length1)
    println(length2)
    var longer = if (length1 == length2)
        println(name1[0])
    else
        println(name1[0])
return longer


}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements
fun digits(array: Array<Int>):String{
    var average= array.average()
    var smallest= array.min()
    var largest= array.max()

var all = ("$smallest, $largest, $average")
return all

}

//Write and call a function that takes in a string and splits it into all the
//characters that constitute it. Your function should print out this output.

fun sentence(word:String){
    for (x in word)
        println(x)


}

//Write and call a function that takes in an array of strings, joins them all into
//one string and returns it.

fun paragraph(array: Array<String>):String{
    var joining= array.contentToString()

    return joining

}


//Create a calculator class that is capable of the following functions:
//(i) Addition of any 2 numbers
//(ii) Subtraction between any 2 numbers
//(iii) Accurate division between any 2 numbers
//(iv) Multiplication of any 2 numbers
//Instantiate your calculator object and invoke all its functions

class calculator(var num1:Int,var num2:Int,var num3:Int,var num4:Int,var num5:Int){
    fun addition (){
        var add= num1+num2
        println(add)
    }
    fun subtraction(){
        var sub= num1-num4
        println(sub)
    }
   fun division(){
       var div= num2/num5
       println(div)
   }
fun multiplication (){
    var multi= num4*num1
    println(multi)
}
}






//    var long= if (name1.length ==name2.length)
//        println(name1[0])
//    else
//        println(name1[0])

//   var answer = if (name1.length==name2.length) {
//       println(name1.first())}
//       else
//       { println(name1) }

//    return answer



import java.lang.Exception
import kotlin.system.exitProcess

class Main() {

    val listOfFunctions = mutableListOf<MyFunctions>()
    var functionCounter = 0

    val listOfVariables = mutableListOf<MyFunctions>()
    var variableCounter = 0

    fun printToList(argument: String) {
        val myPrint = MyPrint(argument)
        listOfFunctions.add(myPrint)
        functionCounter++
    }

    fun main(){
        print("type start\n")
        if(readLine()!!.toLowerCase() == "start"){
            print("Starting\n")
            startRecording()
        } else
            print("you need to type start\n")



    }


    fun startRecording() {
        var rawInput = readLine()!!.toLowerCase()
        var input = TextParser(rawInput).parse()

        while (input != "stop") {
            when(input){
                "var" -> {storeVar(rawInput)}
            }


            rawInput = TextParser(readLine()!!).parse()
        }

        print("Stopped\n")
    }

    private fun storeVar(rawInput: String) {

        print(rawInput)
        val input = rawInput.split(" ")
        storeVarUnit(input[1].toString())
        
    }

    private fun storeVarUnit(data: String){
        print(data)
        val variable = MyVar(data)
        listOfVariables.add(variable)
    }
}

fun main(){
    val main = Main()
    main.main()


}
import java.lang.Exception
import kotlin.system.exitProcess

class Main() {

    val listOfFunctions = mutableListOf<MyFunctions>()

    val listOfVariables = mutableListOf<MyFunctions>()
    fun printToList(argument: String) {
        val myPrint = MyPrint(argument)
        listOfFunctions.add(myPrint)
    }

    fun main() {
        print("type start\n")
        if (readLine()!!.toLowerCase() == "start") {
            print("Starting\n")
            startRecording()
        } else
            print("you need to type start\n")


    }


    fun startRecording() {
        var rawInput = readLine()!!.toLowerCase()
        var input = TextParser(rawInput).parse()

        while (input != "stop") {
            when (input) {
                "var" -> {storeVar(rawInput)}

                "print" -> {printValue(rawInput)}
                
                "if" -> {storeIf(rawInput)}

            }


            rawInput = readLine()!!
            input = TextParser(rawInput).parse()
        }

        print("Stopped\n")
    }

    private fun storeIf(rawInput: String) {
        val firstVar = rawInput.split(" ")[1]
        val operator = rawInput.split(" ")[2]
        val secondVar = rawInput.split(" ")[3]

        val myNewIf = MyIf(firstVar, operator, secondVar)

        print(myNewIf.execute())

    }

    private fun printValue(rawInput: String) {
        print(rawInput + "\n")
        val varToSearchFor = rawInput.split(" ")[1]
        print("searching for $varToSearchFor\n")

        for (myVariable in listOfVariables) {
            if (myVariable.toString() == varToSearchFor){
                val myNewPrint = MyPrint(myVariable.toString())
                listOfFunctions.add(myNewPrint)
                myNewPrint.execute()
                print("\n")
                return
            }
        }

        val myNewVar = MyVar(varToSearchFor)
        val myNewPrint = MyPrint(myNewVar)

        listOfFunctions.add(myNewPrint)
        myNewPrint.execute()
        print("\n")

    }

    private fun storeVar(rawInput: String) {

        print(rawInput + "\n")
        val input = rawInput.split(" ")
        storeVarUnit(input[1].toString())

    }

    private fun storeVarUnit(data: String) {
        val variable = MyVar(data)
        listOfVariables.add(variable)
    }
}

fun main() {
    val main = Main()
    main.main()


}
class Main(){

    val listOfFunctions = mutableListOf<MyFunctions>()
    var functionCounter = 0

    val listOfVariables = mutableListOf<MyFunctions>()
    var variableCounter = 0

    fun main(args: Array<String>) {
        print("Type start to start recording")
        val input = readLine()!!

        val myTextParser = TextParser(input)


    }

    fun printToList(argument: String) {
        val myPrint = MyPrint(argument)
        listOfFunctions.add(myPrint)
        functionCounter++
    }

    fun startRecording() {
        var input = readLine()!!

        while (TextParser(input).parse() != "1") {

        }
    }

    fun stopRecording() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun runProgram() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
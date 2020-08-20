class TextParser(var input: String) {

    val listOfWords = listOf(input.toLowerCase())

    fun parse(): String {
        val listOfWords = readLine()!!.split(" ")
        if (listOfWords.size == 1) {
            when (listOfWords[0]) {
                "start" -> return "Start"
                "stop" -> return "stop"
                "run" -> return "run"
            }
        }

        return textToFunction(listOfWords).toString()

    }

    fun textToFunction(listOfWords: List<String>): String{
        when(listOfWords[0]){
            "print" ->  return printParser((listOfWords.subList(1,listOfWords.size)))
            "var"   ->  return varParser((listOfWords.subList(1,listOfWords.size)))
            "if"    ->  return ifParser((listOfWords.subList(1,listOfWords.size)))
        }
        return "Error in TextToFunction"
    }


    private fun printParser(printWords: List<String>): String {
        return "Print"

    }

    private fun varParser(varWords: List<String>): String {
        return "Var"
    }


    private fun ifParser(ifWords: List<String>): String {
        return "if"
    }
}

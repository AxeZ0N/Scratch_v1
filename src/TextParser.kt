import kotlin.system.exitProcess

class TextParser(var input: String) {

    val listOfWords = input.toLowerCase().split(" ")

    fun parse(): String {
        if (listOfWords.size == 1) {
            when (listOfWords[0]) {
                "start" -> return "start"
                "stop" -> return "stop"
                "run" -> return "run"
            }
        }
        return textToFunction(listOfWords)
    }

    fun textToFunction(listOfWords: List<String>): String{
        when(listOfWords[0]){
            "var" -> return "var"

            "print" -> return "print"

            "if" -> return "if"
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

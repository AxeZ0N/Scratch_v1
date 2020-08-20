class TextParser(var input: String) {

    val listOfWords = listOf(input.toLowerCase())

    fun parse(): String {
        if (listOfWords.size == 1) {
            when (listOfWords[0]) {
                "start" -> return "0"
                "stop" -> return "1"
                "run" -> return "2"
            }
        }

        return textToFunction(listOfWords).toString()

    }

    fun textToFunction(listOfWords: List<String>){
        when(listOfWords[1]){
            "print" ->  printParser((listOfWords.subList(1,listOfWords.size)))
            "var"   ->  varParser((listOfWords.subList(1,listOfWords.size)))
            "if"    ->  ifParser((listOfWords.subList(1,listOfWords.size)))
        }
    }


    private fun printParser(printWords: List<String>) {


    }

    private fun varParser(varWords: List<String>) {

    }


    private fun ifParser(ifWords: List<String>) {

    }
}

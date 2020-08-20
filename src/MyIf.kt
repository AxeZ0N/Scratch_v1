class MyIf(var firstVal: String, var secondVal: String, var operator: String): MyFunctions() {

    fun execute(): Boolean? {
        when (operator) {
            "=" -> return firstVal == secondVal
            ">" -> return firstVal > secondVal
            "<" -> return firstVal < secondVal
        }
        return null
    }


}
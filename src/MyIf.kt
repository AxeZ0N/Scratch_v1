class MyIf(var firstVal: String, var operator: String, var secondVal: String): MyFunctions() {

    fun execute(): Boolean? {
        when (operator) {
            "=" -> return firstVal == secondVal
            ">" -> return firstVal > secondVal
            "<" -> return firstVal < secondVal
        }
        return null
    }


}
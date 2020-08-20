class MyPrint(var default: Any) {
    init {
        when (default) {
            default is String -> print(default)
            default is MyVar -> {
                val myVal = default as MyVar
                print(myVal.data)
            }
        }
    }


}
class MyPrint(var default: String): MyFunctions()  {
    constructor(default: MyVar): this(default.data){}

    fun execute(): String{
        print(default)
        return default
    }



}
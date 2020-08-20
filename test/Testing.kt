import org.junit.Test
import kotlin.test.assertEquals

class Testing() {

    @Test
    fun varReturnsCorrectValue(){
        val valToStore = "Hello"
        val myObject = MyVar(valToStore)
        print(
            assertEquals(valToStore, myObject.data)
        )
    }

    @Test
    fun varIsAbleToMakeObject(){
        val valToStore = "Hello"
        val varObject = MyVar(valToStore)

        print(
            assertEquals(valToStore, varObject.data)
        )

    }

    @Test
    fun ifHasCorrectOperator() {
        val firstVal = "1"
        val secondVal = "2"
        val operator = "<"
        val myObject = MyIf(firstVal, secondVal, operator)

        print(
            assertEquals(operator, myObject.operator)
        )
    }

    @Test
    fun ifHasCorrectFirst() {
        val firstVal = "1"
        val secondVal = "2"
        val operator = "<"
        val myObject = MyIf(firstVal, secondVal, operator)

        print(
            assertEquals(firstVal, myObject.firstVal)
        )
    }

    @Test
    fun ifHasCorrectSecond() {
        val firstVal = "1"
        val secondVal = "2"
        val operator = "<"
        val myObject = MyIf(firstVal, secondVal, operator)

        print(
            assertEquals(secondVal, myObject.secondVal)
        )
    }

    /*

    @Test
    fun printHasCorrectOutput() {
        val valToPrint = "Hello print test"
        assertEquals(valToPrint, MyVar().usePrint(valToPrint))
    }

    @Test
    fun functionContainerHoldsValue() {
        val valToStore: MyVar = MyVar().useVar("ValToStore")
        val pc = 0

        assertEquals(valToStore, MyContainer().store(valToStore, pc))

    }

    @Test
    fun functionContainerHoldsFunctions() {
        val valToStore: MyVar = MyVar().useVar("ValToStore")
        val pc = 0

        assertEquals(valToStore, MyContainer().store(valToStore, pc))

    }

    @Test
    fun functionContainerHoldsPC() {
        val valToStore: MyVar = MyVar().useVar("ValToStore")
        val pc = 0

        assertEquals(pc, MyContainer().store(valToStore, pc))

    }

    @Test
    fun functionContainerHoldsVariables() {
        var pc = 0
        val valToStore: MyVar = MyVar().useVar("ValToStore")

        val container: MyContainer = MyContainer().store(valToStore, pc)

        assertEquals(valToStore, container.get("var1"))

    }

    @Test
    fun functionContainerExecutesNextInstruction() {
        var pc = 0
        val valToStore: MyVar = MyVar.useVar("ValToStore")

        val functionToStore: MyVar = MyVar.usePrint()

        val container: MyContainer = MyContainer.store(valToStore, pc)

        container.store(functionToStore)

        assertEquals("ValToStore", container.execute())

    }

*/
}
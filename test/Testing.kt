import org.junit.Test
import kotlin.test.assertEquals

class Testing() {

    @Test
    fun varReturnsCorrectValue() {
        val valToStore = "Hello"
        val myObject = MyVar(valToStore)
        print(
            assertEquals(valToStore, myObject.data)
        )
    }

    @Test
    fun varIsAbleToMakeObject() {
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

    @Test
    fun printHasCorrectOutput() {
        val valToPrint = "Hello print test"
        val myObject = MyPrint(valToPrint)
        print(
            assertEquals(valToPrint, myObject.execute())
        )
    }

    @Test
    fun textParserReturnsValues(){
        val myStart = TextParser("Start")
        val myStop = TextParser("Stop")
        val myRun = TextParser("run")

        assertEquals("0", myStart.parse())
        assertEquals("1", myStop.parse())
        assertEquals("2", myRun.parse())
    }

}
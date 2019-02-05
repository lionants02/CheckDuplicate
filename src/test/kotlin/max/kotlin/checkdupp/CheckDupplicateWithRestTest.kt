package max.kotlin.checkdupp

import org.junit.Ignore
import org.junit.Test

class CheckDupplicateWithRestTest {

    @Test(expected = max.kotlin.checkdupp.DupplicateProcessException::class)
    fun duplicateNameRegister() {
        println("Register 1")
        CheckDupplicateWithRest("maxkung").register()
        println("Register 2")
        CheckDupplicateWithRest("maxkung").register()
    }

    @Ignore("Test for single.")
    fun register() {
        val checker = CheckDupplicateWithRest("max")
        checker.register()
    }
}

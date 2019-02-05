package max.kotlin.checkdupp

import org.junit.Ignore
import org.junit.Test

@Ignore("Not work.")
class CheckDupplicateWithFileTest {

    @Test
    fun register() {
        val check = CheckDupplicateWithFile()
        check.register()
    }

    @Test(expected = DupplicateProcessException::class)
    fun registerDupp() {
        val check = CheckDupplicateWithFile()
        check.register()
    }
}

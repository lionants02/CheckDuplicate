package max.kotlin.checkdupp

import org.junit.Ignore
import org.junit.Test

@Ignore("For lab test.")
class CheckDupplicateRestLabTest {

    @Test
    fun firstStep() {
        val checker = CheckDupplicateWithRest("maxkung")
        checker.register()
        checker.joinForLabTest()
    }

    @Test
    fun secDiffName() {
        val checker = CheckDupplicateWithRest("max")
        checker.register()
        checker.joinForLabTest()
    }

    @Test(expected = DupplicateProcessException::class)
    fun thDupp() {
        val checker = CheckDupplicateWithRest("max")
        checker.register()
    }
}

package max.kotlin.checkdupp

import max.kotlin.checkdupp.webservice.WebServiceCheckerProcess

class CheckDupplicateWithRest(private val processName: String) : CheckDupplicate {
    private val checkProcess: WebServiceCheckerProcess = WebServiceCheckerProcess(processName)

    override fun register() {
        if (checkProcess.isDupplicate())
            throw DupplicateProcessException("rest duppliate $processName")

        checkProcess.lockProcess()
    }

    internal fun joinForLabTest() {
        checkProcess.join()
    }
}

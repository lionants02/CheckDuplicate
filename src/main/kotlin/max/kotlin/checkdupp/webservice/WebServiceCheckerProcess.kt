package max.kotlin.checkdupp.webservice

class WebServiceCheckerProcess(internal val processName: String) {
    init {
        jvmName = processName
    }

    private lateinit var server: Server

    fun isDupplicate(): Boolean {

        var port = DEFAULT_PORT

        while (true)
            try {
                val rest = buildApiClient("http://$DEFAULT_HOST:$port")
                val processName = rest.getApiProcessName().execute().body()
                if (jvmName == processName)
                    return true
                else
                    port++
            } catch (ex: java.net.ConnectException) {
                println("Not connet not duplicate.")
                return false
            }
    }

    fun lockProcess() {
        server = Server()
    }

    fun join() {
        server.join()
    }

    companion object {
        internal lateinit var jvmName: String
    }
}

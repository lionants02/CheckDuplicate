package max.kotlin.checkdupp.webservice

import max.kotlin.checkdupp.webservice.jetty.JettyServerTuning
import max.kotlin.checkdupp.webservice.jetty.ServletContextBuilder
import max.kotlin.checkdupp.webservice.jetty.build
import org.eclipse.jetty.server.Server

internal class Server(host: String = DEFAULT_HOST, port: Int = DEFAULT_PORT) {
    private val context = ServletContextBuilder().build()
    private val server = Server(JettyServerTuning.threadPool)

    init {
        var myport = port
        var loop = true

        while (loop)
            try {
                println("Bind addres is http://$host:$myport")
                server.connectors =
                    JettyServerTuning.getConnectors(server, host, myport)
                server.handler = context
                server.addBean(JettyServerTuning.getMonitor(server))
                server.start()
                loop = false
            } catch (ignore: java.io.IOException) {
                println("Cannot port bind next is ${++myport}")
            }
    }

    fun join() {
        server.join()
    }
}

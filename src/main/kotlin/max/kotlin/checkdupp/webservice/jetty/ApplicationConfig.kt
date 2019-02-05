package max.kotlin.checkdupp.webservice.jetty

import org.glassfish.jersey.server.ResourceConfig

internal class ApplicationConfig : ResourceConfig() {
    init {
        packages("max.kotlin.checkdupp.webservice.jetty.api")
    }
}

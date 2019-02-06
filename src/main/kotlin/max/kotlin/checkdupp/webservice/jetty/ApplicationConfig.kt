package max.kotlin.checkdupp.webservice.jetty

import max.kotlin.checkdupp.webservice.jetty.api.LandingPage
import org.glassfish.jersey.server.ResourceConfig

internal class ApplicationConfig : ResourceConfig() {
    init {
        val rex = Regex("""^class (.*)\.[\w\d_]+""")
        val fullCalssName = LandingPage::class.toString()
        val groupPackageName = rex.matchEntire(fullCalssName)?.groupValues
        packages(groupPackageName!!.last())
    }
}

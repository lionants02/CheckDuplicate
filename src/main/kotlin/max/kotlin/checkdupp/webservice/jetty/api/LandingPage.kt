package max.kotlin.checkdupp.webservice.jetty.api

import max.kotlin.checkdupp.webservice.WebServiceCheckerProcess
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/")
internal class LandingPage {
    @GET
    @Path("/processname")
    fun name(): String {
        return WebServiceCheckerProcess.jvmName
    }
}

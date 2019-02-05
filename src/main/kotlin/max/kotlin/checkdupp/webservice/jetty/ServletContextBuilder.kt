package max.kotlin.checkdupp.webservice.jetty

import max.kotlin.checkdupp.webservice.ROOT_PART
import org.eclipse.jetty.servlet.ServletContextHandler
import org.eclipse.jetty.servlet.ServletContextHandler.SESSIONS
import org.eclipse.jetty.servlet.ServletHolder
import org.glassfish.jersey.servlet.ServletContainer

internal class ServletContextBuilder

internal fun ServletContextBuilder.build(): ServletContextHandler {
    val context = ServletContextHandler(SESSIONS)
    context.setContextPath(ROOT_PART)
    val jersey = ServletHolder(ServletContainer(ApplicationConfig()))
    jersey.initOrder = 0
    context.addServlet(jersey, "/*")

    return context
}

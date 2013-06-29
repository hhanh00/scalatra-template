import org.scalatra._
import javax.servlet.ServletContext
import com.typesafe.config.ConfigFactory
import com.hanh.AppServlet

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new AppServlet, "/*")
  }
}


// @GENERATOR:play-routes-compiler
// @SOURCE:/home/soft/PaDEL-descriptor-ws/conf/routes
// @DATE:Thu Apr 05 10:10:14 GMT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """computedescriptors""", """controllers.Application.computeDescriptors(params:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_computeDescriptors0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("computedescriptors")))
  )
  private[this] lazy val controllers_Application_computeDescriptors0_invoker = createInvoker(
    controllers.Application.computeDescriptors(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "computeDescriptors",
      Seq(classOf[String]),
      "GET",
      """ Home page""",
      this.prefix + """computedescriptors"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_computeDescriptors0_route(params) =>
      call(params.fromQuery[String]("params", None)) { (params) =>
        controllers_Application_computeDescriptors0_invoker.call(controllers.Application.computeDescriptors(params))
      }
  }
}
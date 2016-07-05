
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/workspace/conf/routes
// @DATE:Tue Jul 05 16:36:11 UTC 2016

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
    ("""GET""", prefix, """controllers.Application.index(numOfWords:Option[Int])"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.search(ngram:Option[String])"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """unique""", """controllers.Application.unique(numOfWords:Option[Int])"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """legomenon""", """controllers.Application.legomenon(repeated:Option[Int])"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index(fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Seq(classOf[Option[Int]]),
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_search1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_search1_invoker = createInvoker(
    controllers.Application.search(fakeValue[Option[String]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Seq(classOf[Option[String]]),
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_unique2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("unique")))
  )
  private[this] lazy val controllers_Application_unique2_invoker = createInvoker(
    controllers.Application.unique(fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "unique",
      Seq(classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """unique"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_legomenon3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("legomenon")))
  )
  private[this] lazy val controllers_Application_legomenon3_invoker = createInvoker(
    controllers.Application.legomenon(fakeValue[Option[Int]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "legomenon",
      Seq(classOf[Option[Int]]),
      "GET",
      """""",
      this.prefix + """legomenon"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_at4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    controllers.Assets.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call(params.fromQuery[Option[Int]]("numOfWords", None)) { (numOfWords) =>
        controllers_Application_index0_invoker.call(controllers.Application.index(numOfWords))
      }
  
    // @LINE:7
    case controllers_Application_search1_route(params) =>
      call(params.fromQuery[Option[String]]("ngram", None)) { (ngram) =>
        controllers_Application_search1_invoker.call(controllers.Application.search(ngram))
      }
  
    // @LINE:8
    case controllers_Application_unique2_route(params) =>
      call(params.fromQuery[Option[Int]]("numOfWords", None)) { (numOfWords) =>
        controllers_Application_unique2_invoker.call(controllers.Application.unique(numOfWords))
      }
  
    // @LINE:9
    case controllers_Application_legomenon3_route(params) =>
      call(params.fromQuery[Option[Int]]("repeated", None)) { (repeated) =>
        controllers_Application_legomenon3_invoker.call(controllers.Application.legomenon(repeated))
      }
  
    // @LINE:15
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at4_invoker.call(controllers.Assets.at(path, file))
      }
  }
}
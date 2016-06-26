
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/workspace/conf/routes
// @DATE:Sun Jun 26 23:53:31 UTC 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def search(ngram:Option[String]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search" + queryString(List(Some(implicitly[QueryStringBindable[Option[String]]].unbind("ngram", ngram)))))
    }
  
    // @LINE:6
    def index(numOfWords:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + queryString(List(Some(implicitly[QueryStringBindable[Option[Int]]].unbind("numOfWords", numOfWords)))))
    }
  
    // @LINE:8
    def unique(numOfWords:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "unique" + queryString(List(Some(implicitly[QueryStringBindable[Option[Int]]].unbind("numOfWords", numOfWords)))))
    }
  
    // @LINE:9
    def legomenon(repeated:Option[Int]): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "legomenon" + queryString(List(Some(implicitly[QueryStringBindable[Option[Int]]].unbind("repeated", repeated)))))
    }
  
  }


}
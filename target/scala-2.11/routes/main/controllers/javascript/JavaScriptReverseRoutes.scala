
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/workspace/conf/routes
// @DATE:Sun Jun 19 00:47:40 UTC 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:13
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function(ngram) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(""" + implicitly[QueryStringBindable[Option[String]]].javascriptUnbind + """)("ngram", ngram)])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function(numOfWords) {
          return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("numOfWords", numOfWords)])})
        }
      """
    )
  
    // @LINE:8
    def unique: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.unique",
      """
        function(numOfWords) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "unique" + _qS([(""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("numOfWords", numOfWords)])})
        }
      """
    )
  
  }


}
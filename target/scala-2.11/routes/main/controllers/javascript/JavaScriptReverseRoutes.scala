
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/workspace/conf/routes
// @DATE:Wed Jun 22 06:24:30 UTC 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
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
  
    // @LINE:9
    def legomenon: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.legomenon",
      """
        function(repeated) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "legomenon" + _qS([(""" + implicitly[QueryStringBindable[Option[Int]]].javascriptUnbind + """)("repeated", repeated)])})
        }
      """
    )
  
  }


}
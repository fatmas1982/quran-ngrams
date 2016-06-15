
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ubuntu/workspace/conf/routes
// @DATE:Wed Jun 15 02:21:00 UTC 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

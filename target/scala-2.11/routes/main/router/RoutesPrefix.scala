
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/soft/PaDEL-descriptor-ws/conf/routes
// @DATE:Thu Apr 05 10:10:14 GMT 2018


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

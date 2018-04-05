
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/soft/PaDEL-descriptor-ws/conf/routes
// @DATE:Thu Apr 05 10:10:14 GMT 2018

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def computeDescriptors(params:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "computedescriptors" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("params", params)))))
    }
  
  }


}
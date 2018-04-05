
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/soft/PaDEL-descriptor-ws/conf/routes
// @DATE:Thu Apr 05 10:10:14 GMT 2018

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}

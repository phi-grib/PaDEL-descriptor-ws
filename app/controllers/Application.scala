package controllers

import play.api._
import play.api.mvc._
import padeldescriptor.PaDELDescriptorApp

object Application extends Controller {

  val app = PaDELDescriptorApp.getApplication()

  def computeDescriptors(params: String) = Action {
    val t0 = System.nanoTime()
    val lparams = params.split('|')
    app.launchCommandLine(lparams)
    println(params)
    val t1 = System.nanoTime()
    Ok("Elapsed time: " + (t1 - t0) / 1000000 + " ms")
  }

}
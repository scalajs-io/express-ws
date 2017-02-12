package io.scalajs.npm.expressws

import io.scalajs.npm.express.Router

import scala.scalajs.js

/**
  * Express-WS Routing Mix-in
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait WsRouting extends js.Object {

  /**
    * Registers the web socket listener for the given path
    */
  def ws(path: String, callback: js.Function): Unit = js.native

}

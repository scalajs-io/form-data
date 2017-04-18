package io.scalajs.npm.formdata

import io.scalajs.{RawOptions, nodejs}
import io.scalajs.nodejs.http.IncomingMessage
import io.scalajs.util.ScalaJsHelper._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

/**
  * form-data - A library to create readable "multipart/form-data" streams. Can be used to submit forms
  * and file uploads to other web applications.
  * @see https://www.npmjs.com/package/form-data
  * @author lawrence.daniels@gmail.com
  */
@js.native
trait FormData extends js.Object {

  def append(field: String, value: js.Any, options: FormOptions | RawOptions = js.native): Unit = js.native

  def getBoundary(): js.Any = js.native

  def submit(options: SubmitOptions, callback: js.Function2[nodejs.Error, IncomingMessage, Any]): Unit = js.native

  def submit(uri: String, callback: js.Function2[nodejs.Error, IncomingMessage, Any]): Unit = js.native

}

@js.native
@JSImport("form-data", JSImport.Namespace)
object FormData extends js.Object {

  def apply(): FormData = this.New[FormData]()

}
package io.scalajs.npm.formdata

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Form Optional Settings
  * @author lawrence.daniels@gmail.com
  */
@ScalaJSDefined
class FormOptions(val header: js.UndefOr[String] = js.undefined,
                  val filename: js.UndefOr[String] = js.undefined,
                  val contentType: js.UndefOr[String] = js.undefined,
                  val knownLength: js.UndefOr[Int] = js.undefined) extends js.Object
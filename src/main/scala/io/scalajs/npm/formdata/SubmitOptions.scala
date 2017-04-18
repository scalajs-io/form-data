package io.scalajs.npm.formdata

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Submit Optional Settings
  * @author lawrence.daniels@gmail.com
  */
@ScalaJSDefined
class SubmitOptions(val host: js.UndefOr[String] = js.undefined,
                    val path: js.UndefOr[String] = js.undefined,
                    val auth: js.UndefOr[String] = js.undefined,
                    val headers: js.UndefOr[js.Dictionary[js.Any]]) extends js.Object
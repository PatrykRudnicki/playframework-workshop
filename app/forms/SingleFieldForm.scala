package forms

import play.api.data.{Form, Forms}
import play.api.data.Forms.text

object SingleFieldForm {
  val form: Form[String] = Form(Forms.single("value" -> text()))
}

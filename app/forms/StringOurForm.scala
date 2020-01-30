package forms

import play.api.data.{Form, Forms}
import play.api.data.Forms._

object StringOurForm {
  val form: Form[String] = Form(Forms.single("value" -> text()))

}

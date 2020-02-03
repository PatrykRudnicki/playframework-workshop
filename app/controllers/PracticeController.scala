package controllers

import forms.SingleFieldForm.form
import javax.inject.Inject
import play.api.mvc._
import views.html.practice

class PracticeController @Inject()(val mcc: MessagesControllerComponents, practicePage: practice)
    extends MessagesAbstractController(mcc) {



  def displayPage(): Action[AnyContent] = Action { implicit request =>
    Ok(practicePage(form))
  }

  def submit(): Action[AnyContent] = Action { implicit request =>
    val resultForm = form.bindFromRequest()

    resultForm.fold(
      formWithErrors => BadRequest(practicePage(formWithErrors)),
      correctValue => Ok(correctValue)
    )
  }
}

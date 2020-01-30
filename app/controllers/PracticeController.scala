package controllers

import javax.inject.Inject
import play.api.mvc._
import views.html.practice
import forms.StringOurForm.form

class PracticeController @Inject()(val mcc: MessagesControllerComponents, practicePage: practice)
  extends MessagesAbstractController(mcc) {
  def displayPage(): Action[AnyContent] = Action { implicit request =>
    Ok(practicePage(form))
  }

  def submitPage(): Action[AnyContent] = Action { implicit request =>
    val resultForm = form.bindFromRequest()
    resultForm.fold(
      formWithErrors => BadRequest(practicePage(formWithErrors)),
      correctForm => Ok(correctForm)
    )
  }
}

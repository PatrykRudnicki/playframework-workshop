package controllers

import javax.inject.Inject
import play.api.mvc._
import views.html.practice

class PracticeController @Inject()(val controllerComponents: ControllerComponents, practicePage: practice) extends BaseController {
  def displayPage(): Action[AnyContent] = Action { implicit request =>
    Ok(practicePage())
  }
}

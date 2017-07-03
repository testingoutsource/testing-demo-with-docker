package stepDefs

import cucumber.api.scala.ScalaDsl
import cucumber.api.scala.EN
import hooks.WebHooks
import org.openqa.selenium.support.ui.WebDriverWait
import org.scalatest.{FlatSpec, Matchers}
import org.scalatest.selenium.WebBrowser


trait RootStepDefs extends ScalaDsl with WebBrowser with Matchers with WebHooks with EN {


    val homeUrl = "http://localhost:3003"
    implicit val waitFor = new WebDriverWait(driver, 3)

}

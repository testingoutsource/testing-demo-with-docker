package stepDefs

import cucumber.api.DataTable
import cucumber.api.scala.EN
import org.openqa.selenium.By
import scala.collection.JavaConversions._

class StepDefs extends RootStepDefs {


  Given("""^I want go to home page of hotel management platform$""") { () =>
      go to homeUrl
  }

  When("""^I click "([^"]*)" link$""") { (linkText: String) =>
    driver.findElement(By.linkText(linkText)).click()
  }

  When("""^I login to website$""") {
    () =>
      Thread.sleep(1000)
      driver.findElement(By.id("username")).sendKeys("admin")
      driver.findElement(By.id("password")).sendKeys("password")
      driver.findElement(By.id("doLogin")).click()
  }

  Then("""^I should be on "([^"]*)" page$""") { (title: String) =>
    driver.getTitle should be(title)
    Thread.sleep(200)
  }

  Then("""^I enter following data in text fields:$""") { (dataTable: DataTable) =>
    for (data: java.util.Map[String, String] <- dataTable.asMaps(classOf[String], classOf[String])) {
      driver.findElement(By.id(data.get("field"))).sendKeys(data.get("value"))
    }
  }

  Then("""^I click on "([^"]*)" button$""") { (buttonId: String) =>
    click on buttonId
    Thread.sleep(300)
  }

  Then("""^I should be able to delete input hotel$""") { () =>
    driver.findElements(By.className("hotelDelete")).head.click()
    Thread.sleep(200)
  }

  Then("""^I should be entering multiple\((\d+)\) values in page$""") { (times: Int) =>
    1 to times map { position =>
      driver.findElement(By.id("hotelName")).sendKeys(s"name$position")
      driver.findElement(By.id("address")).sendKeys(s"address$position")
      driver.findElement(By.id("owner")).sendKeys(s"owner$position")
      driver.findElement(By.id("phone")).sendKeys(s"phone$position")
      driver.findElement(By.id("email")).sendKeys(s"email$position")
      driver.findElement(By.id("createHotel")).click()
      Thread.sleep(200)
    }
  }


}




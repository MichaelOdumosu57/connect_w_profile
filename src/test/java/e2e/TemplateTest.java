package e2e;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclasses.UIBaseClass;
import util.E2EUtils;

public class TemplateTest extends UIBaseClass {

  E2EUtils e2eutil = E2EUtils.getCommonUtils();

  @Test
  public void openChrome() throws InterruptedException {

    e2eUtil
    .enterIntoInput(driver, By.id("input"), "I am working sucessfully")
    .waitForScreenToUpdate(10000);
  }
}

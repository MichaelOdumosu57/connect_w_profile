package baseclasses;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import browsers.E2EChrome;
import util.CommonUtils;
import util.E2EUtils;

public class UIBaseClass {

  public  static WebDriver driver;
  public static JavascriptExecutor js;
  WebDriverWait wait;

  public E2EUtils e2eUtil = E2EUtils.getCommonUtils();






  @BeforeMethod
  public void startWithCleanBrowser() throws InterruptedException, AWTException {

    E2EChrome chrome = new E2EChrome();
    driver = chrome.getDriver();
    js = (JavascriptExecutor) driver;
    driver.get("https://google.com");

  }










}

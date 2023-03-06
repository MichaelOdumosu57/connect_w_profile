package browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import util.CommonUtils;

public class E2EChrome  {

  WebDriver driver;
  public  WebDriver getDriver() {
    return getDriver(false);
  }



  public  WebDriver getDriver(Boolean headless) {

    System.setProperty(
      "webdriver.chrome.driver",
      CommonUtils.dotenv.get("CHROMEDRIVER")
    );
    System.setProperty("webdriver.chrome.logfile", "C:\\Users\\Restop-8734\\chromedriver.log");
    System.setProperty("webdriver.chrome.verboseLogging", "true");

    ChromeOptions options = new ChromeOptions();
    options
    .addArguments("--no-sandbox")
    .addArguments("--user-data-dir=C:\\Users\\Restop-8734\\AppData\\Local\\Google\\Chrome\\User Data")
    .addArguments("--start-maximized")
    .addArguments("disable-infobars")
    .addArguments("--disable-extensions")
    .addArguments("--disable-gpu")
    .addArguments("--disable-gpu")
    .addArguments("--disable-dev-shm-usage'")
    .addArguments("--profile-directory=Default")
    .setExperimentalOption("useAutomationExtension", false);
    if(headless == true){
      options.addArguments("--headless");
    }
    // ChromeDriverService service = new ChromeDriverService.Builder()
    // .usingDriverExecutable(new File(CommonUtils.dotenv.get("CHROMEDRIVER")))
    // .build();
    driver = new ChromeDriver(options);
    return driver;
  }

}



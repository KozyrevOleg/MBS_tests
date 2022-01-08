package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Map;

public class ApplicationManager {
  WebDriver driver;
  public NavigationHelper navigationHelper;
  public AdministratorHelper administratorHelper;
  JavascriptExecutor js;
  private Map<String, Object> vars;

  public void init() {
    System.setProperty("webdriver.gecko.driver", "C:\\Java test\\Selenium\\geckodriver.exe");
    System.setProperty("webdriver.chrome.driver", "C:\\Java test\\Selenium\\chromedriver.exe");
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
    driver.get("https://mspbackups.com/AP/Administrators");
    driver.manage().window().setSize(new Dimension(1368, 768));
    driver.findElement(By.id("txtLogin")).click();
    driver.findElement(By.id("txtLogin")).sendKeys("oleg.k@msp360.com");
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).sendKeys("123");
    driver.findElement(By.id("btnLogin")).click();
    //driver.switchTo().frame(0);
    //js.executeScript("window.scrollTo(0,0)");
    navigationHelper = new NavigationHelper(driver);
    administratorHelper = new AdministratorHelper(driver);
}

  public void stop() {
  navigationHelper.driver.quit();
}

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }

  public AdministratorHelper getAdministratorHelper() {
    return administratorHelper;
  }
}

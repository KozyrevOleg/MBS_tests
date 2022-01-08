package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void openAdministratorsPage() {
    driver.switchTo().defaultContent();
    driver.findElement(By.id("organization")).click();
    driver.findElement(By.linkText("Administrators")).click();
  }

  public void SelectPermissionTab() {
    click(By.cssSelector(".mbs-tabset_item:nth-child(2) > .mbs-tabset_link"));
  }

  public void SelectCompaniesTab() {
    click(By.cssSelector("li.mbs-tabset_item:nth-child(3) > button:nth-child(1)"));
  }


  public void LoginSubAdmin() {
      System.setProperty("webdriver.gecko.driver", "C:\\Java test\\Selenium\\geckodriver.exe");
      System.setProperty("webdriver.chrome.driver", "C:\\Java test\\Selenium\\chromedriver.exe");
      driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://mspbackups.com/AP/Administrators");
      driver.manage().window().setSize(new Dimension(1366, 728));
      type("txtLogin", "admin3@msp360.com");
      type("txtPassword", "123123123");
      click(By.id("btnLogin"));
      //driver.switchTo().frame(0);
      //js.executeScript("window.scrollTo(0,0)");

    }

}

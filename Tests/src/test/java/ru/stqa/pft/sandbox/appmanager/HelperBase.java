package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  public void type(String locator, String text) {
    click(By.id(locator));
    if (text != null) {
      String existingText = driver.findElement(By.id(locator)).getAttribute("value");
      if (! text.equals(existingText)) {
        driver.findElement(By.id(locator)).sendKeys(text);
      }
    }
  }

  public void click(By locator) {
    driver.findElement(locator).click();
  }

  public boolean isElementPresent(By locator) {
    try {
      driver.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }

}
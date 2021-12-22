package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper {
  WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void openAdministatorsPage() {
    driver.findElement(By.id("organization")).click();
    driver.findElement(By.linkText("Administrators")).click();
  }
}

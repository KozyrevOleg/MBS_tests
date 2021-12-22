package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.sandbox.AdministratorsData;

public class AdministratorHelper {

  WebDriver driver;

  public AdministratorHelper(WebDriver driver) {
    this.driver = driver;
  }

  public void fillAdministratorForm(AdministratorsData administratorsData) {
    driver.findElement(By.cssSelector(".-isBlock > .btn")).click();
    driver.findElement(By.id("firstName")).click();
    driver.findElement(By.id("firstName")).sendKeys(administratorsData.firstName());
    driver.findElement(By.id("lastName")).click();
    driver.findElement(By.id("lastName")).sendKeys(administratorsData.lastName());
    driver.findElement(By.id("myMailField")).click();
    driver.findElement(By.id("myMailField")).sendKeys(administratorsData.email());
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).sendKeys(administratorsData.password());
  }

  public void clickCreateOrSave() {
    driver.findElement(By.cssSelector(".mbs-table-grid_row:nth-child(6) .-isCtrl .col > span")).click();
  }

  public void openExistedAdministrator() {
    driver.findElement(By.cssSelector(".mbs-sidepanel_footer-col .btn-primary")).click();
  }
}

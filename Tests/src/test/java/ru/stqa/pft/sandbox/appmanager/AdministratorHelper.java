package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class AdministratorHelper extends HelperBase {


  public AdministratorHelper(WebDriver driver) {
    super(driver);
  }

  public void fillAdministratorForm(AdministratorsData administratorsData) {
    //driver.findElement(By.linkText("Add Administrator")).click();
    click(By.cssSelector(".col-md-auto > mbs-button:nth-child(1) > button:nth-child(1)"));
    type("firstName", administratorsData.firstName());
    type("lastName", administratorsData.lastName());
    type("myMailField", administratorsData.email());
    type("password", administratorsData.password());
  }

  public void changeAdministratorForm(AdministratorsData administratorsData) {
    type("firstName", administratorsData.firstName());
    type("lastName", administratorsData.lastName());
  }


  public void clickCreateOrSave() {
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/footer/div/div/div[1]/mbs-button/button"));
  }

  public void openExistingAdministrator() {
    click(By.xpath("/html/body/div[1]/app-root/app-app-layout/main/div/div/app-administrators/div/div/mbs-table-grid/mbs-table/div/div/div[2]/div[2]/div[2]/mbs-button/button/mbs-text-ellipsis/span/span"));
  }


  public void enableAdministrator() {
    click(By.cssSelector(".mbs-form-group > .ng-untouched:nth-child(1) .mbs-check_label"));
  }

  public void SelectAllPermissions() {
    click(By.cssSelector(".mb-2 > div:nth-child(1) > label:nth-child(2)"));
  }

  public void SelectSpecificCompanies() {
    //driver.findElement(By.cssSelector("mbs-radio.ng-valid:nth-child(2) > div:nth-child(1) > label:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".mbs-tabset_item:nth-child(3) > .mbs-tabset_link")).click();
    driver.findElement(By.cssSelector(".ng-untouched:nth-child(2) .mbs-radio_label")).click();
    if (!isCompanyWasAdded()) {
      dropDownList();
    }
   /* if (! isCompanyWasAdded()) {
      clickCreateOrSave();
    }*/
    // new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData1.group());
  }

  private void dropDownList() {
    driver.findElement(By.cssSelector(".ng-input")).click();
    driver.findElement(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[3]/div/mbs-sidepanel-administrators-companies-tab/div/div[2]/div[1]/div[1]/mbs-select/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]/span")).click();
    driver.findElement(By.cssSelector(".col-3 .btn")).click();
  }

  public void closeSidePanel() {
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/header/div/div[2]/button/span"));
  }

  public void closeChangeDetector() {
    click(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div[2]/mbs-button[2]/button"));
  }

  public void removeAddedCompany() {
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[3]/div/mbs-sidepanel-administrators-companies-tab/div/div[3]/table/tbody/tr/td[3]/mbs-button/button/span"));
  }

  public boolean isAdministratorExist() {
    return isElementPresent(By.xpath("/html/body/div[1]/app-root/app-app-layout/main/div/div/app-administrators/div/div/mbs-table-grid/mbs-table/div/div/div[2]/div[2]/div[2]/mbs-button/button/mbs-text-ellipsis/span/span"));
  }

  public boolean isCompanyWasAdded() {
    return isElementPresent(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[3]/div/mbs-sidepanel-administrators-companies-tab/div/div[3]/table/tbody/tr/td[2]"));
  }

  public void removeAdmin() {
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/footer/div/div[1]/mbs-button/button"));
  }

  public void confirmDeletionDelete() {
    click(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div[2]/mbs-button[1]/button"));
  }

  public void cancelRemoveAdmin() {
    click(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div[2]/mbs-button[2]/button"));
  }

  public boolean isEmailExist() {
    return isElementPresent(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[1]/div/mbs-sidepanel-administrators-general-tab/div[3]/mbs-input/div/mbs-input-errors/div/div"));
  }

// What the locator should be written?
  /*public boolean isThereNameAndSecondNameExist() {
    return isElementPresent(By.id("value"));
  }*/
}

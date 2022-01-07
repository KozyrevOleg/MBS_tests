package ru.stqa.pft.sandbox.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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


  public void clickCreateOrSave() {
    click(By.cssSelector("div.mbs-sidepanel_footer-col:nth-child(1) > mbs-button:nth-child(1) > button:nth-child(1)"));
  }

  public void openExistedAdministrator() {
    click(By.cssSelector(".mbs-sidepanel_footer-col .btn-primary"));
  }

  public void enableAdministrator() {
    click(By.cssSelector(".mbs-form-group > .ng-untouched:nth-child(1) .mbs-check_label"));
  }

  public void SelectAllPermissions() {
    click(By.cssSelector(".mb-2 > div:nth-child(1) > label:nth-child(2)"));
  }

  public void SelectSpecificCompanies() {
    //driver.findElement(By.cssSelector("mbs-radio.ng-valid:nth-child(2) > div:nth-child(1) > label:nth-child(2)")).click();
    click(By.cssSelector(".ng-untouched:nth-child(2) .mbs-radio_label"));
    dropDownList();
  }

  private void dropDownList() {
    click(By.cssSelector(".ng-input"));
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[3]/div/mbs-sidepanel-administrators-companies-tab/div/div[2]/div[1]/div[1]/mbs-select/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]/span"));
    click(By.cssSelector(".col-3 .btn"));
    click(By.cssSelector(".mbs-sidepanel_footer-col .btn-primary"));
  }

  public void closeSidePanel() {
    click(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/header/div/div[2]/button/span"));
  }

  public void closeChangeDetector() {
    click(By.xpath("/html/body/ngb-modal-window/div/div/app-modal/div[2]/mbs-button[2]/button"));
  }

  public boolean isAdministratorExist() {
    return isElementPresent(By.xpath("/html/body/div[1]/app-root/app-sidepanel-administrators/mbs-sidepanel/aside/div/div/div/div[1]/div/mbs-sidepanel-administrators-general-tab/div[3]/mbs-input/div/mbs-input-errors/div/div"));
  }
}

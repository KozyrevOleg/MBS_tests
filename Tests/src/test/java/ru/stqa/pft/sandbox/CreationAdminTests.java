package ru.stqa.pft.sandbox;
import org.junit.Test;
import org.openqa.selenium.*;
import org.testng.Assert;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class CreationAdminTests extends TestBase {

  WebDriver driver;
  JavascriptExecutor js;

  // Why doesn't the password field display info about an existing email?
  @Test
  public void CreateAdminNoPermissionAllCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 1", "Admin 1",
            "admin1@msp360.com", "123123123"));
    if (app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().closeSidePanel();
      app.getAdministratorHelper().closeChangeDetector();
    } else {
      app.getAdministratorHelper().clickCreateOrSave();
    }
    //app.getAdministratorHelper().openExistedAdministrator();
  }

  @Test
  public void CreateAdminAllPermissionsAllCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 2", "Admin 2", "admin2@msp360.com", "123123123"));
    if (app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().closeSidePanel();
      app.getAdministratorHelper().closeChangeDetector();
    } else {
      app.getNavigationHelper().SelectPermissionTab();
      app.getAdministratorHelper().SelectAllPermissions();
      app.getAdministratorHelper().clickCreateOrSave();
    }
  }


  @Test
  public void CreateAdminDisabledAllPermissionsSelectedCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 3", "Admin 3", "admin3@msp360.com", "123123123"));
    if (app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().closeSidePanel();
      app.getAdministratorHelper().closeSidePanel();
    } else {
      app.getAdministratorHelper().enableAdministrator();
      app.getNavigationHelper().SelectPermissionTab();
      app.getAdministratorHelper().SelectAllPermissions();
      app.getNavigationHelper().SelectCompaniesTab();
      app.getAdministratorHelper().SelectSpecificCompanies();
      app.getAdministratorHelper().clickCreateOrSave();
      //app.getNavigationHelper().LoginSubAdmin();
    }
  }
}

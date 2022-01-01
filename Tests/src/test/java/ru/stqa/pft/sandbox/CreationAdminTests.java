package ru.stqa.pft.sandbox;
import org.junit.Test;
import org.openqa.selenium.*;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class CreationAdminTests extends TestBase {

  WebDriver driver;
  JavascriptExecutor js;

  @Test
  public void CreateAdminNoPermissionAllCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 1", "Admin 1", "admin1@msp360.com", "123123123"));
    app.getAdministratorHelper().clickCreateOrSave();
    app.getAdministratorHelper().openExistedAdministrator();
  }

  @Test
  public void CreateAdminAllPermissionsAllCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 2", "Admin 2", "admin2@msp360.com", "123123123"));
    app.getNavigationHelper().SelectPermissionTab();
    app.getAdministratorHelper().SelectAllPermissions();
    app.getAdministratorHelper().clickCreateOrSave();
  }

  @Test
  public void CreateAdminDisabledAllPermissionsSelectedCompanies() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 3", "Admin 3", "admin3@msp360.com", "123123123"));
    app.getAdministratorHelper().enableAdministrator();
    app.getNavigationHelper().SelectPermissionTab();
    app.getAdministratorHelper().SelectAllPermissions();
    app.getNavigationHelper().SelectCompaniesTab();
    app.getAdministratorHelper().SelectSpecificCompanies();
    app.getAdministratorHelper().clickCreateOrSave();
    app.getNavigationHelper().LoginSubAdmin();
  }
}

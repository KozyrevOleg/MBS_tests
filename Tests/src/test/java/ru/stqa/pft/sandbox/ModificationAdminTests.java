package ru.stqa.pft.sandbox;

import org.junit.Test;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class ModificationAdminTests extends TestBase {

  @Test
// Add All Permissions and manage only one Company
  public void modificationAdminNoPermissionAllCompanies () {
    app.getNavigationHelper().openAdministratorsPage();
    if (! app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("ChangeTest", "ChangeTest",
              "changetest@msp360.com","changetest"));
    }
    app.getAdministratorHelper().openExistingAdministrator();
    app.getNavigationHelper().SelectPermissionTab();
    app.getAdministratorHelper().SelectAllPermissions();
    app.getNavigationHelper().SelectCompaniesTab();
    app.getAdministratorHelper().SelectSpecificCompanies();
    app.getAdministratorHelper().clickCreateOrSave();
  }

  @Test

  public void modificationAddNameAndSecondName () {
    app.getNavigationHelper().openAdministratorsPage();
    if (! app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("ChangeTest", "ChangeTest",
              "changetest@msp360.com","changetest"));
    }
    app.getAdministratorHelper().openExistingAdministrator();
    app.getAdministratorHelper().changeAdministratorForm((new AdministratorsData("Admin Change",
              "Admin Change",null, null)));
    app.getAdministratorHelper().clickCreateOrSave();
  }
}

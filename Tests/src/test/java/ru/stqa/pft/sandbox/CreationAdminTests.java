package ru.stqa.pft.sandbox;
import org.junit.Test;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class CreationAdminTests extends TestBase {

  // Why doesn't the password field display info about an existing email?
  @Test
  public void createAdminNoPermissionAllCompanies() {
    app.getNavigationHelper().openAdministratorsPage();
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
  public void createAdminAllPermissionsAllCompanies() {
    app.getNavigationHelper().openAdministratorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 2", "Admin 2",
            "admin2@msp360.com", "123123123"));
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
  public void createAdminDisabledAllPermissionsSelectedCompanies() {
    app.getNavigationHelper().openAdministratorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 3",
            "Admin 3", "admin3@msp360.com", "123123123"));
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

  @Test
  public void createAdminWithoutNameAndSecondName() {
    app.getNavigationHelper().openAdministratorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData(null, null, "admin4@msp360.com", "123123123"));
    if (app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().closeSidePanel();
      app.getAdministratorHelper().closeSidePanel();
    } else {
      app.getNavigationHelper().SelectPermissionTab();
      app.getAdministratorHelper().SelectAllPermissions();
      app.getAdministratorHelper().clickCreateOrSave();
    }
  }

//draw
 /* @Test
  public void createAdminWithoutNameAndSecondName2() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 0", "Admin 0", "admin0@msp360.com", "123123123"));
    if (app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().closeSidePanel();
      app.getAdministratorHelper().closeSidePanel();
    } else {
      app.getNavigationHelper().SelectPermissionTab();
      app.getAdministratorHelper().SelectAllPermissions();
      app.getAdministratorHelper().clickCreateOrSave();
    }
  }*/
}

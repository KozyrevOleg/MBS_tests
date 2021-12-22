package ru.stqa.pft.sandbox;
import org.junit.Test;
import org.openqa.selenium.By;

public class CreationAdminTests extends TestBase{

  @Test
    public void test1login() {
    app.getNavigationHelper().openAdministatorsPage();
    app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Admin 1", "Admin 1", "admin1@msp360.com", "123123123"));
    app.getAdministratorHelper().clickCreateOrSave();
    app.getAdministratorHelper().openExistedAdministrator();

  }

}
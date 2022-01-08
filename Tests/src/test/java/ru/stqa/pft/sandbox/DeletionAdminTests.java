package ru.stqa.pft.sandbox;

import org.junit.Test;
import ru.stqa.pft.sandbox.model.AdministratorsData;

public class DeletionAdminTests extends TestBase {

  @Test

  public void removeAdmin () {
    app.getNavigationHelper().openAdministratorsPage();
    if (! app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Delete", "Delete",
              "delete@delete.com", "deletedelete"));
      app.getAdministratorHelper().clickCreateOrSave();
    }
    app.getAdministratorHelper().openExistingAdministrator();
    app.getAdministratorHelper().removeAdmin();
    app.getAdministratorHelper().confirmDeletionDelete();
  }

  @ Test

  public void cancelRemoveAdmin () {
    app.getNavigationHelper().openAdministratorsPage();
    if (! app.getAdministratorHelper().isAdministratorExist()) {
      app.getAdministratorHelper().fillAdministratorForm(new AdministratorsData("Delete", "Delete",
              "delete@delete.com", "deletedelete"));
      app.getAdministratorHelper().clickCreateOrSave();
    }
    app.getAdministratorHelper().openExistingAdministrator();
    app.getAdministratorHelper().removeAdmin();
    app.getAdministratorHelper().cancelRemoveAdmin();
  }
}

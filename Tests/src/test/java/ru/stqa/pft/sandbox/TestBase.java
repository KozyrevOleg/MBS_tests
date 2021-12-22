package ru.stqa.pft.sandbox;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import ru.stqa.pft.sandbox.appmanager.ApplicationManager;

//special class that contains fixtures methods

public class TestBase {

  public ApplicationManager app = new ApplicationManager();

  @Before
  public void setUp() {
    app.init();
  }

  @After
  public void tearDown() {
    app.stop();
  }

  public ApplicationManager getApp() {
    return app;
  }

}

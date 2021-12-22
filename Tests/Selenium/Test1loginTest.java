// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1loginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void test1login() {
    driver.get("https://mspbackups.com/Admin/Login.aspx?ref=%2FAdmin%2FDefault.aspx");
    driver.manage().window().setSize(new Dimension(1366, 728));
    driver.findElement(By.id("txtLogin")).click();
    driver.findElement(By.id("txtLogin")).sendKeys("oleg.k@msp360.com");
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).sendKeys("123");
    driver.findElement(By.id("btnLogin")).click();
    driver.switchTo().frame(0);
    js.executeScript("window.scrollTo(0,0)");
  }
}

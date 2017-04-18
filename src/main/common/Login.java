package main.common;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class Login {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://shop.maike51.com/shop/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testLogin() throws Exception {
    driver.get(baseUrl);
    driver.findElement(By.id("account")).clear();
    driver.findElement(By.id("account")).sendKeys("10191");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("miang521");
    //driver.findElement(By.cssSelector("div.btns-box > #login-button")).click();
    driver.findElement(By.xpath("//*[@value='登    录']")).click();
    driver.findElement(By.xpath("//*[text()='商品管理']")).click();
    driver.findElement(By.xpath("//div[@class='richtxt']")).click();
    driver.findElement(By.xpath("//div[@class='title']")).click();
    
    driver.findElement(By.xpath("//*[text()='图片模块']")).click();
    driver.findElement(By.xpath("//div[@class='imglist']")).click();
    
    driver.findElement(By.xpath("//*[text()='交互模块']")).click();
    driver.findElement(By.xpath("//div[@class='bigcarousel']")).click();
    driver.findElement(By.xpath("//div[@class='slideimgs']")).click();
    driver.findElement(By.xpath("//div[@class='timingimgs']")).click();

    driver.findElement(By.xpath("//*[text()='商品模块']")).click();
    driver.findElement(By.xpath("//div[@class='product']")).click();
    driver.findElement(By.xpath("//div[@class='searchprd']")).click();

    driver.findElement(By.xpath("//*[text()='其它模块']")).click();
    driver.findElement(By.xpath("//div[@class='notice']")).click();
    driver.findElement(By.xpath("//div[@class='contact']")).click();
    driver.findElement(By.xpath("//div[@class='auxline']")).click();
    driver.findElement(By.xpath("//div[@class='auxblank']")).click();
    
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

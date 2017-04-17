package main.product.productManage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_toEditDetail {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://shop.51maike.com.cn/shop/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testProductToEditDetail() throws Exception {
    driver.get(baseUrl + "/shop/");
    driver.findElement(By.cssSelector("div.nav-title")).click();
    driver.findElement(By.xpath("//li[2]/a/div")).click();
    driver.findElement(By.linkText("仓库中（2）")).click();
    driver.findElement(By.linkText("编辑详情")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
    driver.findElement(By.cssSelector("li.richtxt")).click();
    driver.findElement(By.cssSelector("li.title")).click();
    driver.findElement(By.cssSelector("div.form-group > input.form-control")).clear();
    driver.findElement(By.cssSelector("div.form-group > input.form-control")).sendKeys("自动回归标题名称");
    driver.findElement(By.linkText("图片模块")).click();
    driver.findElement(By.cssSelector("li.imglist")).click();
    driver.findElement(By.linkText("+ 添加一个图片")).click();
    driver.findElement(By.id("395_catalogName")).click();
    driver.findElement(By.cssSelector("a[title=\"TB2jB6SauTyQeBjSspfXXaI3FXa-394695430.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"TB2b6OqXF_AQeBjSZPhXXXt5pXa-394695430.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"TB2UuHsaxvxQeBjy0FiXXXioXXa-394695430.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"TB2C4WqXF_AQeBjSZFvXXbnKXXa-394695430.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"TB2pUCqXRPzQeBjSZFlXXccIVXa-394695430.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.cssSelector("div.field-box.currenteditor")).click();
    driver.findElement(By.xpath("//div[@id='mdListR']/div[3]")).click();
    driver.findElement(By.cssSelector("#editmodalbox2 > div.iBody > div.form-group > div.iCheckRegion > div.checkbox > label > input[type=\"checkbox\"]")).click();
    driver.findElement(By.xpath("(//input[@type='checkbox'])[5]")).click();
    driver.findElement(By.xpath("//div[@id='editmodalbox2']/div[3]/div[4]/div/div/label")).click();
    driver.findElement(By.linkText("交互模块")).click();
    driver.findElement(By.cssSelector("li.bigcarousel > i.cus-icon.icoPic")).click();
    driver.findElement(By.linkText("+ 添加一个广告")).click();
    driver.findElement(By.id("1077_fileCount")).click();
    driver.findElement(By.linkText("5")).click();
    driver.findElement(By.cssSelector("a[title=\"439cbda99f1b7d74c961fe9bbe55d252.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"90f2aceff1e21dff4c9fd26825c13e23.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.cssSelector("li.slideimgs > i.cus-icon.icoPic")).click();
    driver.findElement(By.cssSelector("#editmodalbox4 > div.iBody > a.add-option")).click();
    driver.findElement(By.cssSelector("a[title=\"86d73810c8e8c70bdbd6725767d63616.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"49b9b70bcf502a8430b7c5d4e790cd9b.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    driver.findElement(By.id("item_0")).click();
    driver.findElement(By.linkText("商品链接")).click();
    driver.findElement(By.linkText("选择")).click();
    driver.findElement(By.linkText("商品模块")).click();
    driver.findElement(By.cssSelector("li.product")).click();
    driver.findElement(By.cssSelector("i.cus-icon.icon-add")).click();
    driver.findElement(By.xpath("(//input[@value='选择'])[2]")).click();
    driver.findElement(By.xpath("(//input[@value='选择'])[2]")).click();
    driver.findElement(By.id("pS-comfirmBtn")).click();
    driver.findElement(By.xpath("(//input[@name='pStyle5'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='editmodalbox5']/div[3]/div[4]/div/label[2]")).click();
    driver.findElement(By.linkText("其它模块")).click();
    driver.findElement(By.cssSelector("li.notice")).click();
    driver.findElement(By.cssSelector("#editmodalbox6 > div.iBody > div.form-group > input.form-control")).clear();
    driver.findElement(By.cssSelector("#editmodalbox6 > div.iBody > div.form-group > input.form-control")).sendKeys("公告");
    driver.findElement(By.cssSelector("#editmodalbox6 > div.iBody > div.form-group > input.form-control")).clear();
    driver.findElement(By.cssSelector("#editmodalbox6 > div.iBody > div.form-group > input.form-control")).sendKeys("公告：有重要信息想要告诉客户？你可以在这发布一条公告哦，如果内容过长，会滚动播放");
    driver.findElement(By.id("btn_save_shelveOn")).click();
    driver.findElement(By.linkText("编辑")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
    driver.findElement(By.linkText("编辑详情")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
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

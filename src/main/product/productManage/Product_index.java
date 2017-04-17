package main.product.productManage;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_index {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://shop.51maike.com.cn/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testProductIndex() throws Exception {
    driver.get(baseUrl + "/logOut?refer=shop");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("miang521");
    driver.findElement(By.id("account")).clear();
    driver.findElement(By.id("account")).sendKeys("57403");
    driver.findElement(By.cssSelector("div.btns-box > #login-button")).click();
    driver.findElement(By.cssSelector("div.nav-title")).click();
    driver.findElement(By.xpath("//li[2]/a/div")).click();
    driver.findElement(By.id("addProduct")).click();
    driver.findElement(By.id("item_2")).click();
    driver.findElement(By.id("next")).click();
    driver.findElement(By.id("productName")).clear();
    driver.findElement(By.id("productName")).sendKeys("回归测试case");
    driver.findElement(By.id("shortDes")).clear();
    driver.findElement(By.id("shortDes")).sendKeys("回归测试case");
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("productCode")).clear();
    driver.findElement(By.id("productCode")).sendKeys("000212");
    driver.findElement(By.id("addSpec")).click();
    driver.findElement(By.xpath("//button[@onclick='openSelSpecWindow(this);']")).click();
    driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.xpath("//button[@onclick='openSelSpecWindow(this);']")).click();
    driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.linkText("+添加")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//button[@onclick='closeSkuValue();']")).click();
    driver.findElement(By.cssSelector("div.delSpec > img")).click();
    driver.findElement(By.id("addSpec")).click();
    driver.findElement(By.xpath("//button[@onclick='openSelSpecWindow(this);']")).click();
    driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.linkText("+添加")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.id("addSpecV_1")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.id("addSpec")).click();
    driver.findElement(By.xpath("(//button[@onclick='openSelSpecWindow(this);'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.cssSelector("#addSpecV_2 > a.link-primary.noEdit")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).sendKeys("红");
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.cssSelector("#addSpecV_2 > a.link-primary.noEdit")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).sendKeys("黄");
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.cssSelector("#addSpecV_2 > a.link-primary.noEdit")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[55]")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[55]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[55]")).sendKeys("红色");
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.xpath("//div[@id='specD_2']/div[2]/div[2]/img")).click();
    driver.findElement(By.cssSelector("#specD_2 > div.specV > div.delspecV > img")).click();
    driver.findElement(By.cssSelector("#addSpecV_2 > a.link-primary.noEdit")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[2]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[39]")).sendKeys("黄色");
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.cssSelector("#addSpecV_2 > a.link-primary.noEdit")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.id("batch_quto")).click();
    driver.findElement(By.id("batch_quto")).clear();
    driver.findElement(By.id("batch_quto")).sendKeys("122");
    driver.findElement(By.id("quto_yes")).click();
    driver.findElement(By.id("batch_sale")).click();
    driver.findElement(By.id("batch_sale")).clear();
    driver.findElement(By.id("batch_sale")).sendKeys("0.12");
    driver.findElement(By.id("sale_yes")).click();
    driver.findElement(By.id("batch_inventory")).clear();
    driver.findElement(By.id("batch_inventory")).sendKeys("021");
    driver.findElement(By.id("inventory_yes")).click();
    driver.findElement(By.id("batch_skuCode")).clear();
    driver.findElement(By.id("batch_skuCode")).sendKeys("21214");
    driver.findElement(By.id("code_yes")).click();
    driver.findElement(By.id("skuCode_1367_1255")).clear();
    driver.findElement(By.id("skuCode_1367_1255")).sendKeys("21214A");
    driver.findElement(By.id("skuCode_1367_1542")).clear();
    driver.findElement(By.id("skuCode_1367_1542")).sendKeys("21214B");
    driver.findElement(By.id("skuCode_1367_1371")).clear();
    driver.findElement(By.id("skuCode_1367_1371")).sendKeys("21214C");
    driver.findElement(By.id("skuCode_1369_1255")).clear();
    driver.findElement(By.id("skuCode_1369_1255")).sendKeys("21214D");
    driver.findElement(By.id("skuCode_1369_1542")).clear();
    driver.findElement(By.id("skuCode_1369_1542")).sendKeys("21214E");
    driver.findElement(By.id("skuCode_1369_1371")).clear();
    driver.findElement(By.id("skuCode_1369_1371")).sendKeys("21214F");
    driver.findElement(By.id("chkSkuImg")).click();
    driver.findElement(By.cssSelector("label.checkbox-inline")).click();
    driver.findElement(By.cssSelector("div.col-sm-2 > button.btn.btn-default")).click();
    driver.findElement(By.id("1075_fileCount")).click();
    driver.findElement(By.cssSelector("a[title=\"238a65cb90feab1a6c5ec426f46d13ef.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.xpath("//button[@onclick=\"openImgSpace('skuImg_1369',1);\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"294bcb65e3577f6cf7dec72d55a26ecd.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.id("displaySoldQty")).click();
    driver.findElement(By.id("displayInventory")).click();
    driver.findElement(By.cssSelector("div.clearfix > button.btn.btn-default")).click();
    driver.findElement(By.cssSelector("a[title=\"294bcb65e3577f6cf7dec72d55a26ecd.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.id("shareTitle")).clear();
    driver.findElement(By.id("shareTitle")).sendKeys("分享");
    driver.findElement(By.id("shareContent")).clear();
    driver.findElement(By.id("shareContent")).sendKeys("这款衣服还可以，分享给你！");
    driver.findElement(By.xpath("//button[@onclick=\"openImgSpace('squareShow',5);\"]")).click();
    driver.findElement(By.cssSelector("a[title=\"238a65cb90feab1a6c5ec426f46d13ef.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"294bcb65e3577f6cf7dec72d55a26ecd.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"295fea6f68f6cf0d0292c12eef613a88.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"171b3cde42eda4f810fbcccac8c0f81c.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.xpath("//button[@onclick=\"openImgSpace('rectangleShow',1);\"]")).click();
    driver.findElement(By.id("1077_fileCount")).click();
    driver.findElement(By.cssSelector("a[title=\"Img01.jpg\"] > img")).click();
    driver.findElement(By.cssSelector("a[title=\"Img02.jpg\"] > img")).click();
    driver.findElement(By.id("saveProductImage")).click();
    driver.findElement(By.cssSelector("span.k-select > span.k-icon.k-i-arrow-s")).click();
    driver.findElement(By.xpath("//ul[@id='selectShippingTemplate_listbox']/li[2]")).click();
    driver.findElement(By.id("logisticsWeight_1367_1255")).click();
    driver.findElement(By.id("logisticsWeight_1367_1255")).clear();
    driver.findElement(By.id("logisticsWeight_1367_1255")).sendKeys("500");
    driver.findElement(By.xpath("(//input[@type='text'])[53]")).click();
    driver.findElement(By.id("logisticsWeight_1367_1542")).clear();
    driver.findElement(By.id("logisticsWeight_1367_1542")).sendKeys("1000");
    driver.findElement(By.id("logisticsWeight_1367_1371")).clear();
    driver.findElement(By.id("logisticsWeight_1367_1371")).sendKeys("1500");
    driver.findElement(By.id("logisticsWeight_1369_1255")).clear();
    driver.findElement(By.id("logisticsWeight_1369_1255")).sendKeys("2000");
    driver.findElement(By.xpath("(//input[@type='text'])[59]")).click();
    driver.findElement(By.id("logisticsWeight_1369_1542")).clear();
    driver.findElement(By.id("logisticsWeight_1369_1542")).sendKeys("2500");
    driver.findElement(By.id("logisticsWeight_1369_1371")).clear();
    driver.findElement(By.id("logisticsWeight_1369_1371")).sendKeys("3500");
    driver.findElement(By.xpath("(//input[@name='stockReduceType'])[2]")).click();
    driver.findElement(By.id("toEidtDetail")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | selenium_blank31537 | 30000]]
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.id("addSpecV_0")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[3]")).click();
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.linkText("+添加")).click();
    driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
    driver.findElement(By.id("addSpec")).click();
    driver.findElement(By.xpath("(//button[@onclick='openSelSpecWindow(this);'])[2]")).click();
    driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
    driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
    driver.findElement(By.id("toAddSku")).click();
    driver.findElement(By.xpath("(//button[@onclick='openSelSpecWindow(this);'])[2]")).click();
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

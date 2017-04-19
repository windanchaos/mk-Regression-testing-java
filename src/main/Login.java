package main;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class Login {
  private static ChromeDriverService service;
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  
  public Login(WebDriver driver){
	  this.driver = driver;
  }
  public void testLogin() throws Exception {
	
	baseUrl = "http://passpt.51maike.com.cn/login?refer=shop";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    driver.get(baseUrl);
    driver.findElement(By.id("account")).clear();
    driver.findElement(By.id("account")).sendKeys("57403");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("miang521");
    driver.findElement(By.cssSelector("div.btns-box > #login-button")).click();

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
}

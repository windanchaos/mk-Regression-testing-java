package com.mk.regression.shop;

import org.openqa.selenium.*;

public class Login {
  private WebDriver driver;
  private String baseUrl;

  public Login(WebDriver driver){
	  this.driver=driver;
  }
  public void testLogin() throws Exception {
    driver.get("https://shop.maike51.com");
    driver.findElement(By.id("account")).clear();
    driver.findElement(By.id("account")).sendKeys("10191");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("miang521");
    driver.findElement(By.xpath("//*[@value='登    录']")).click();
    driver.findElement(By.xpath("//*[text()='商品管理']")).click();
//    driver.findElement(By.xpath("//div[@class='richtxt']")).click();
//    driver.findElement(By.xpath("//div[@class='title']")).click();
//    
//    driver.findElement(By.xpath("//*[text()='图片模块']")).click();
//    driver.findElement(By.xpath("//div[@class='imglist']")).click();
//    
//    driver.findElement(By.xpath("//*[text()='交互模块']")).click();
//    driver.findElement(By.xpath("//div[@class='bigcarousel']")).click();
//    driver.findElement(By.xpath("//div[@class='slideimgs']")).click();
//    driver.findElement(By.xpath("//div[@class='timingimgs']")).click();
//
//    driver.findElement(By.xpath("//*[text()='商品模块']")).click();
//    driver.findElement(By.xpath("//div[@class='product']")).click();
//    driver.findElement(By.xpath("//div[@class='searchprd']")).click();
//
//    driver.findElement(By.xpath("//*[text()='其它模块']")).click();
//    driver.findElement(By.xpath("//div[@class='notice']")).click();
//    driver.findElement(By.xpath("//div[@class='contact']")).click();
//    driver.findElement(By.xpath("//div[@class='auxline']")).click();
//    driver.findElement(By.xpath("//div[@class='auxblank']")).click();
    
  }
}

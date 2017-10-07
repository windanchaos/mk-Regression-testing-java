package com.mk.regression.shop;
import org.openqa.selenium.*;

public class Pages_home {
	  private WebDriver driver;
	  private String baseUrl;

	  public Pages_home(WebDriver driver){
		  this.driver=driver;
	  }
	  public void testPages_home() throws Exception {
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

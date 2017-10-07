package com.mk.regression.shop;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class TestController {
	private static ChromeDriverService service;
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		service = new ChromeDriverService.Builder().usingDriverExecutable(new File("chromedriver")).usingAnyFreePort()
				.build();
		service.start();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Login login=new Login(driver);
		login.testLogin();
	}
	
	@Test
	public void testProduct_index() throws Exception{
		Product_index product_index = new Product_index(driver);
		product_index.testProductIndex();
	}
	
	@Test
	public void Product_toEditDetail() throws Exception{
		
	}
		
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		//driver.quit();
		//service.stop();
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

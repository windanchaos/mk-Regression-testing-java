package main.test;

import java.util.Random;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class Product_index {
	private WebDriver driver;
	private String baseUrl;

	public Product_index(WebDriver driver) {
		this.driver = driver;
	}

	public void testProductIndex() throws Exception {
		driver.get("https://shop.maike51.com/shop/");
		driver.findElement(By.xpath("//*[text()='商品管理']")).click();
		driver.findElement(By.xpath("//*[text()='商品仓库']")).click();
		driver.findElement(By.id("addProduct")).click();

		driver.findElement(By.id("item_2")).click();

		driver.findElement(By.id("next")).click();
		// 商品名及介绍
		driver.findElement(By.id("productName")).clear();
		driver.findElement(By.id("productName")).sendKeys("回归测试case");
		driver.findElement(By.id("shortDes")).clear();
		driver.findElement(By.id("shortDes")).sendKeys("商城测试商品，请勿购买！！");
		// 下拉框选择分组
//		driver.findElement(By.className("k-multiselect-wrap k-floatwrap")).click();
//		Select select = new Select(driver.findElement(By.id("selectGroups")));
//		Random r = new Random();
//		int i = r.nextInt(7) + 1;
//		select.selectByIndex(i);
		// 商品编码

		driver.findElement(By.id("productCode")).clear();
		driver.findElement(By.id("productCode")).sendKeys("000212");
		// 商品规格一
		driver.findElement(By.id("addSpec")).click();

		driver.findElement(By.xpath("//button[@onclick='openSelSpecWindow(this);']")).click();
		driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span")).click();
		driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span"))
				.sendKeys("净重");
		driver.findElement(By.id("toAddSku")).click();

		driver.findElement(By.xpath("//*[@id=‘addSpecV_0’]")).click();
		driver.wait(500);
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input"))
				.sendKeys("500g");
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=‘addSpecV_0’]")).click();
		driver.wait(500);
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input"))
				.sendKeys("1000g");
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[2]/button")).click();
		// 商品规格二
		driver.findElement(By.id("addSpec")).click();
		driver.findElements(By.xpath("//button[@onclick='openSelSpecWindow(this);']")).get(1).click();
		driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
		driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span"))
				.sendKeys("颜色");
		driver.findElement(By.id("toAddSku")).click();

		driver.findElement(By.xpath("//*[@id=‘addSpecV_１’]")).click();
		driver.wait(500);
		
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input"))
				.sendKeys("红色");
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=‘addSpecV_１’]")).click();
		driver.wait(500);
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input")).click();
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[1]/span/span/input"))
				.sendKeys("橙色");
		driver.findElement(By.xpath("//*[@id='skuValueWindow']/div/div/fieldset/div/div[2]/button")).click();

		//设置sku
		//滚屏
		((JavascriptExecutor) driver).executeAsyncScript("$('.mk-product-body').scrollTop(1000)");
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_quto').style='display: inline-block; visibility: visible;'");
		driver.findElement(By.id("batch_quto")).sendKeys("122");
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_quto').style='display: none; visibility: visible;'");
		driver.wait(500);
		driver.findElement(By.xpath("//*[@id='quto_yes')")).click();
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_sale').style='display: inline-block; visibility: visible;'");
		driver.findElement(By.id("batch_sale")).sendKeys("0.12");
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_sale').style='display: none; visibility: visible;'");
		driver.findElement(By.id("sale_yes")).click();
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_inventory').style='display: inline-block; visibility: visible;'");
		driver.findElement(By.id("batch_inventory")).sendKeys("021");
		((JavascriptExecutor) driver).executeAsyncScript("document.getElementById('batch_inventory').style='display: none; visibility: visible;'");
		driver.findElement(By.id("inventory_yes")).click();
		driver.findElement(By.id("batch_skuCode")).sendKeys("21214");
		driver.findElement(By.id("code_yes")).click();
		driver.wait(500);
		//sku 图片设置
		((JavascriptExecutor) driver).executeAsyncScript("$('#chkSkuImg').click()");
		driver.findElement(By.xpath("//*[@id='skuImgTable']/tbody/tr/td/div[1]/button")).click();
		
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
		// ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp |
		// selenium_blank31537 | 30000]]
		driver.findElement(By.id("toAddSku")).click();
		driver.findElement(By.id("addSpecV_0")).click();
		driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span/span"))
				.click();
		driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
		driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
		driver.findElement(By.linkText("+添加")).click();
		driver.findElement(By.xpath("//div[@id='skuValueWindow']/div/div/fieldset/div/div/span/span/span/span"))
				.click();
		driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
		driver.findElement(By.xpath("//button[@onclick='addSkuValue();']")).click();
		driver.findElement(By.id("addSpec")).click();
		driver.findElement(By.xpath("(//button[@onclick='openSelSpecWindow(this);'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='addSkuWindow']/div/div/fieldset/div/div/span/span/span/span")).click();
		driver.findElement(By.cssSelector("li.k-item.k-state-hover")).click();
		driver.findElement(By.id("toAddSku")).click();
		driver.findElement(By.xpath("(//button[@onclick='openSelSpecWindow(this);'])[2]")).click();
	}
}

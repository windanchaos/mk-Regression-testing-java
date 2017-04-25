package main.common;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Driver_mothds {

	//执行脚本，忽略报错
	public static void runscript(WebDriver driver,String script){
		try{
			((JavascriptExecutor) driver).executeAsyncScript(script);
		}catch(Exception e){
			System.out.print(e.toString());
		}
	}
	//选择图片
	public static void choose_piture(int i,WebDriver driver){
		String[] pic_group={"长图","方图","方图一"};
		
	}
	
	//随机整数
	public static int random_int(int max){
		Random rand = new Random();
		int i = rand.nextInt(); //int范围类的随机数
		i = rand.nextInt(max); //生成0-100以内的随机数
		i = (int)(Math.random() * max); //0-100以内的随机数，用Matn.random()方式
		return i;
	}

}

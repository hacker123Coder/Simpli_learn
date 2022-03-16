package com.akshay.training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.flipkart.com/";
		
		driver.get(url);
		WebElement upload = driver.findElement(By.xpath("//*[@type='text']"));
	       upload.click();
	       TakesScreenshot ts = (TakesScreenshot)driver;
	       File scr = ts.getScreenshotAs(OutputType.FILE);
	       FileUtils.copyFile(scr, new File("D://test.png"));
	       
	       
	    }
}


	



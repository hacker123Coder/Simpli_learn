package com.akshay.training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		
		WebDriver driver = new ChromeDriver();
		String url ="https://www.shine.com/registration/";
		driver.get(url);

        WebElement  name = driver.findElement(By.id("id_name"));
        name.sendKeys("akshay");
		
		WebElement file = driver.findElement(By.id("id_file"));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", file);
		 
	     Thread.sleep(5000);
	     Runtime.getRuntime().exec("D:\\upload1.exe");
		
		
	}

}



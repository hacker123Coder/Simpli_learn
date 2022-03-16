package com.akshay.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {

	public static void main(String[] args) {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
        String url="https://www.facebook.com/";
		
		driver.get(url);
		
		// timeouts
		
		driver.manage().timeouts().pageLoadTimeout(9000, TimeUnit.MINUTES);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("akshay.kd@gmail.com");
		
		driver.close();
		
	}

}

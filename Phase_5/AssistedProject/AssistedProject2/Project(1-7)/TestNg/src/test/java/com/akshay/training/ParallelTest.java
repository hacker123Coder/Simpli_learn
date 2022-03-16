package com.akshay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	
	@Test(groups = "Chrome")
	
	public void LaunchFacebook() {
		
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		 driver= new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
	}
	@Ignore
	@Test(groups = "Chrome" ,dependsOnMethods = "LaunchFacebook")
	public void SignIn() {
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		
		email.sendKeys("akshay.kd@gmail.com");
	    password.sendKeys("marstoearth8889");
		
	}

	}



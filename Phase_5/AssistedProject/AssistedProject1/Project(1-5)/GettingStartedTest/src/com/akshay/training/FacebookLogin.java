package com.akshay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		WebElement email = driver.findElement(By.id("email"));
		//System.out.println(email.getAttribute("placeholder"));
		WebElement password = driver.findElement(By.name("pass"));
		email.sendKeys("akshay.kd@gmail.com");
	    password.sendKeys("marstoearth8889");
		email.submit();
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		//driver.close();
	}

}

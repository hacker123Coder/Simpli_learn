package com.akshay.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notes {
	public static void main(String[] args) {
		
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
        String url="https://www.facebook.com/";
		
		driver.get(url);
		
		WebElement email=driver.findElement(By.id("email")) ;
		
		
		
		WebElement xpathemail=driver.findElement(By.xpath("//*[@id=\"email\"]"));
		System.out.println(email.equals(xpathemail));
		
		
		List<WebElement> list=driver.findElements(By.cssSelector("input.inputtext"));
		// If we write #email only we get placeholder for email field only
		
		for(WebElement e: list) {
			System.out.println(e.getAttribute("placeholder"));
		}
	}
}

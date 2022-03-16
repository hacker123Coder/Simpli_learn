package com.akshay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		WebElement email1 = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		
		Action seriesofaction =  builder
				.moveToElement(email1)
				.click()
				.keyDown(email1,Keys.SHIFT)
				.sendKeys(email1,"hello")
				.keyUp(email1,Keys.SHIFT)
				.doubleClick(email1)
				.contextClick()
				
				.build();
		seriesofaction.perform();
		
		//builder.moveToElement(email).click();
		//builder.click().sendKeys(email1,"helli");
		
		
	}

}

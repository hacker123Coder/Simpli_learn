package com.akshay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndPopup {

	
	public static void main(String[] args) {
	
		
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://nxtgenaiacademy.com/alertandpopup/";
		
		driver.get(url);
		
//		WebElement alertbox = driver.findElement(By.name("alertbox"));
//		alertbox.click();
//		driver.switchTo().alert().accept();
		
		WebElement confirm = driver.findElement(By.name("confirmalertbox"));
		confirm.click();
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
		
//		WebElement prompt = driver.findElement(By.name("promptalertbox1234"));
//		prompt.click();
//		driver.switchTo().alert().sendKeys("no");
//		driver.switchTo().alert().accept();
//		
}
}

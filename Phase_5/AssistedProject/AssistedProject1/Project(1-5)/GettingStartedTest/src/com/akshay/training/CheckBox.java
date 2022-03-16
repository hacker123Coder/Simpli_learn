package com.akshay.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.shine.com/registration/parser/";
		
		driver.get(url);
		
		WebElement checkbox = driver.findElement(By.id("id_privacy"));
		
		checkbox.click();
		
		if(checkbox.isSelected()) {
			System.out.println("checkbox was selected already");
			}
		else {
			System.out.println("not selected");

		}
	}

}

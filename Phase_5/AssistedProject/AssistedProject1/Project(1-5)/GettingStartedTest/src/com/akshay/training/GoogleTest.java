package com.akshay.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static  void main(String[] args) {
		
		//Step 1--> Declare path
		
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//Instantiate Driver
		
		WebDriver driver= new ChromeDriver();
		
		// Step2--> Base url
		
		String url="https://www.google.co.in/";
		
		// Step 3--> Launch Chrome
		
		driver.get(url);
		
		
	}

}

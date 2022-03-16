package com.akshay.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTitleCheck {

	public static void main(String[] args) {
		
		String driverPath="D:\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver= new ChromeDriver();
		
		String url="https://www.google.co.in/";
		
		String Expectedtitle = "Google";
		
		String Actulatitle = "";
		
		driver.get(url);
		
	    Actulatitle =driver.getTitle();
		
		if(Expectedtitle.contentEquals(Actulatitle)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");

		}
		


	}

}

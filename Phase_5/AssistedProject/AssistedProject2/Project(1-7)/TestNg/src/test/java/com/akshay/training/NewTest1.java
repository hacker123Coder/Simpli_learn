package com.akshay.training;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
	@Test 
  public void hello() {
	  System.out.println("hello aram adari");
  }

  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforem");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterm");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforec");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterc");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforesuite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("aftersuite");

  }

}

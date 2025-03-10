package com.selenium.basicTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	
	@BeforeMethod
	public void doBeforeTest() {
		System.out.println("**************************************************");
		System.out.println("-------------Test Execution Started---------------");
		System.out.println("--------------------------------------------------");
	}

	@AfterMethod
	public void doAfterTest() {
		System.out.println("--------------------------------------------------");
		System.out.println("-----------Test Execution Completed---------------");
		System.out.println("**************************************************");
	}

}

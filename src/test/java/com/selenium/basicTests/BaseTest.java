package com.selenium.basicTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.utility.BrowserUtils;

public class BaseTest {
	
	protected WebDriver driverObj;
	
	BrowserUtils browserUtilsObj;
	
	private String browser = "chrome";
    private String website = "https://demoqa.com"; 
    private boolean isHeadless = false;
	
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	public void setUrl(String website) {
		this.website = website;
	}
	
	public void setIsHeadless(boolean isHeadless) {
		this.isHeadless = isHeadless;
	}
	
	@BeforeMethod
	public void doBeforeTest() {
		System.out.println("**************************************************");
		System.out.println("-------------Test Execution Started---------------");
		System.out.println("--------------------------------------------------");
		browserUtilsObj = new BrowserUtils(driverObj);
		driverObj = browserUtilsObj.lauchWebsiteByBrowser(browser, website, isHeadless);
	}
	
	@AfterMethod
	public void doAfterTest() {
		browserUtilsObj.quitBrowser();
		System.out.println("--------------------------------------------------");
		System.out.println("-----------Test Execution Completed---------------");
		System.out.println("**************************************************");
	}

}

package com.selenium.basicTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.utility.BrowserManager;

public class BrowserCLATest extends BaseTest {
		
		BrowserManager browserManagerObj = new BrowserManager(driver);
		
		String defaultBrowserInput = "firefox";
		boolean defaultIsHeadlessInput = false;
		
		boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", Boolean.toString(defaultIsHeadlessInput)));
		String browser = System.getProperty("browser", defaultBrowserInput);

//		@BeforeMethod
//		public void doBeforeTest() {
//			System.out.println("**************************************************");
//			System.out.println("-------------Test Execution Started---------------");
//			System.out.println("--------------------------------------------------");
//		}
//
//		@AfterMethod
//		public void doAfterTest() {
//			System.out.println("--------------------------------------------------");
//			System.out.println("-----------Test Execution Completed---------------");
//			System.out.println("**************************************************");
//		}
		
		@Test
		public void testingWebsiteOnInputBrowser() {
			System.out.printf("Default Browser: %s\n", defaultBrowserInput);
			System.out.printf("Default Mode: %s\n", defaultIsHeadlessInput? "ON" : "OFF");
			System.out.println("Command Line Argument Browser: " + browser);
			System.out.printf("Command Line Argument Headless Mode: %s\n", isHeadless? "ON" : "OFF");

			browserManagerObj.lauchWebsiteByBrowser(browser, "https://demoqa.com/", isHeadless);
			System.out.println("On demo page");
			browserManagerObj.quitBrowser();
		}


}

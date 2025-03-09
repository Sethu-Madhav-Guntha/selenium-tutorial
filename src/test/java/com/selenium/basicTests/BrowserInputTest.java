package com.selenium.basicTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.utility.BrowserManager;

public class BrowserInputTest {
		
		BrowserManager browserManagerObj = new BrowserManager();
		
		String browser = "safari";
		boolean isHeadless = true;

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
		
		@Test
		public void testingWebsiteOnInputBrowser() {
			browserManagerObj.lauchWebsiteByBrowser(browser, "https://demoqa.com/", isHeadless);
			System.out.println("On demo page");
			browserManagerObj.quitBrowser();
		}


}

package com.selenium.basicTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.utility.BrowserManager;

public class WebsiteGUITest extends BaseTest {
	BrowserManager browserManagerObj = new BrowserManager(driver);

//	@BeforeMethod
//	public void doBeforeTest() {
//		System.out.println("**************************************************");
//		System.out.println("-------------Test Execution Started---------------");
//		System.out.println("--------------------------------------------------");
//	}
//
//	@AfterMethod
//	public void doAfterTest() {
//		System.out.println("--------------------------------------------------");
//		System.out.println("-----------Test Execution Completed---------------");
//		System.out.println("**************************************************");
//	}

	@Test
	public void testingWebsiteOnSafari() {
		browserManagerObj.lauchWebsiteByBrowser("safari", "https://demoqa.com/", true);
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}
	@Test
	public void testingWebsiteOnChrome() {
		browserManagerObj.lauchWebsiteByBrowser("chrome", "https://demoqa.com/", true);
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}
	@Test
	public void testingWebsiteOnFirefox() {
		browserManagerObj.lauchWebsiteByBrowser("firefox", "https://demoqa.com/", true);
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}
	@Test
	public void testingWebsiteOnEdge() {
		browserManagerObj.lauchWebsiteByBrowser("edge", "https://demoqa.com/", true);
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}

}

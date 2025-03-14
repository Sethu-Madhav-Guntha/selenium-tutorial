package com.selenium.basicTests;

import org.testng.annotations.Test;

public class BrowserCLATest extends BaseTest {
		
		String defaultBrowserInput = "firefox";
		boolean defaultIsHeadlessInput = false;
		
		boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless", Boolean.toString(defaultIsHeadlessInput)));
		String browser = System.getProperty("browser", defaultBrowserInput);
		
		@Test
		public void testingWebsiteOnInputBrowser() {
			setBrowser(browser);
			setIsHeadless(isHeadless);
			System.out.printf("Default Browser: %s\n", defaultBrowserInput);
			System.out.printf("Default Mode: %s\n", defaultIsHeadlessInput? "ON" : "OFF");
			System.out.println("Command Line Argument Browser: " + browser);
			System.out.printf("Command Line Argument Headless Mode: %s\n", isHeadless? "ON" : "OFF");
		}


}

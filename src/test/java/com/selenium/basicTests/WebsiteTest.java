package com.selenium.basicTests;

import org.testng.annotations.Test;
import com.selenium.utility.BrowserManager;

public class WebsiteTest {
	BrowserManager browserManagerObj = new BrowserManager();
	@Test
	public void testingYoutube() {
		browserManagerObj.lauchWebsiteByBrowser("chrome", "https://demoqa.com/");
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}

}

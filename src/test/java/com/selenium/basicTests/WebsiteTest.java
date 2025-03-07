package com.selenium.basicTests;

import org.testng.annotations.Test;
<<<<<<< HEAD
=======
import org.testng.annotations.Test;
>>>>>>> 9b54c65 (Website Sample Test)

import com.selenium.utility.BrowserManager;

public class WebsiteTest {
	BrowserManager browserManagerObj = new BrowserManager();
	@Test
	public void testingYoutube() {
<<<<<<< HEAD
		browserManagerObj.lauchWebsiteByBrowser("chrome", "https://demoqa.com/");
=======
		browserManagerObj.lauchWebsiteByBrowser("safari", "https://demoqa.com/");
>>>>>>> 9b54c65 (Website Sample Test)
		System.out.println("On demo page");
		browserManagerObj.quitBrowser();
	}

}

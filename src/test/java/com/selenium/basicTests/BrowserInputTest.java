package com.selenium.basicTests;

import org.testng.annotations.Test;

public class BrowserInputTest extends BaseTest {
				
		String browser = "safari";
		boolean isHeadless = true;
		
		@Test
		public void testingWebsiteOnInputBrowser() {
			setBrowser(browser);
			setIsHeadless(isHeadless);
		}


}

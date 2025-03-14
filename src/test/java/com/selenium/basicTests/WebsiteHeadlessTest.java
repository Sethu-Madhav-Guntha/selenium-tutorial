package com.selenium.basicTests;

import org.testng.annotations.Test;

public class WebsiteHeadlessTest extends BaseTest {

	@Test
	public void testingWebsiteOnSafari() {
		setBrowser("safari");
		setIsHeadless(false);
	}

	@Test
	public void testingWebsiteOnChrome() {
		setBrowser("chrome");
		setIsHeadless(false);
	}
	
	@Test
	public void testingWebsiteOnFirefox() {
		setBrowser("firefox");
		setIsHeadless(false);
	}

	@Test
	public void testingWebsiteOnEdge() {
		setBrowser("edge");
		setIsHeadless(false);
	}

}

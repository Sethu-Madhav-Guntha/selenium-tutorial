package com.selenium.basicTests;

import org.testng.annotations.Test;

public class WebsiteGUITest extends BaseTest {

	@Test
	public void testingWebsiteOnSafari() {
		setBrowser("safari");
		setIsHeadless(true);
	}
	
	@Test
	public void testingWebsiteOnChrome() {
		setBrowser("chrome");
		setIsHeadless(true);
	}

	@Test
	public void testingWebsiteOnFirefox() {
		setBrowser("firefox");
		setIsHeadless(true);
	}

	@Test
	public void testingWebsiteOnEdge() {
		setBrowser("edge");
		setIsHeadless(true);
	}

}

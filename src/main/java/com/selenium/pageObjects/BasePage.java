package com.selenium.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	protected static WebDriver driverObj;
	
	public BasePage(WebDriver driverObj) {
		this.driverObj = driverObj;
		PageFactory.initElements(driverObj, this);
	}

	public void getUrlDetails() {
		System.out.println("Current Webpage Details:");
		System.out.println("--------------------------------------------------");
		System.out.println("Title: " + driverObj.getTitle());
		System.out.println("URL: " + driverObj.getCurrentUrl());
		System.out.println("Window Handle: " + driverObj.getWindowHandle());
		System.out.println("Window Dimensions: " + driverObj.manage().window().getSize());
		System.out.println("Cookies List: \n" + driverObj.manage().getCookies());
		System.out.println("--------------------------------------------------");
	}

}

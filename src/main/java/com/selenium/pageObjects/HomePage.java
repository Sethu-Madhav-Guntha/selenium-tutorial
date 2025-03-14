package com.selenium.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.utility.BasePage;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h5[text()=\"Elements\"]")
	private WebElement elementsOption;
	
	public void selectElementsOption() {
		JavascriptExecutor js = (JavascriptExecutor) driverObj;
	    js.executeScript("arguments[0].scrollIntoView(true);", elementsOption);
	    clickElement(elementsOption);
	}	
}

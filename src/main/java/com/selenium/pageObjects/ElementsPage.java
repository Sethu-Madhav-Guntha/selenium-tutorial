package com.selenium.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.selenium.utility.BasePage;

public class ElementsPage extends BasePage {

	public ElementsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//li[@id=\"item-0\"]//span[text()=\"Text Box\"]")
	private WebElement textBoxOption;
	
	@FindBy(id="userName")
	private WebElement userNameTextBox;
	
	public String getUsername() {
		return getElementText(userNameTextBox);
	}
	
	public void setUsername(String username) {
		sendDataToElement(userNameTextBox, username);
	}
	
	public void selectTextBoxOption() {
		JavascriptExecutor js = (JavascriptExecutor) driverObj;
	    js.executeScript("arguments[0].scrollIntoView(true);", textBoxOption);
	    clickElement(textBoxOption);
	}

}

package com.selenium.elementTests;

import org.testng.annotations.Test;

import com.selenium.basicTests.BaseTest;
import com.selenium.pageObjects.ElementsPage;
import com.selenium.pageObjects.HomePage;

public class TextBoxTests extends BaseTest {
	HomePage homePageObj;
	ElementsPage elementsPageObj;

	@Test
	public void testTextBox() {
		homePageObj = new HomePage(driverObj);
		elementsPageObj = new ElementsPage(driverObj);
		homePageObj.selectElementsOption();
		elementsPageObj.selectTextBoxOption();
		elementsPageObj.setUsername("Sethu Madhav");
		System.out.println(elementsPageObj.getUsername());
	}

}

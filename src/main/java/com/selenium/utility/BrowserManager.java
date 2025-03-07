package com.selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
/**
 * Used for browser manager
 */
public class BrowserManager extends BaseClass {

	public WebDriver lauchWebsiteByBrowser(String browser, String website) {
		driverObj = lauchBrowser(browser);
		navigateToWebsite(website);
		getUrlDetails();
		return driverObj;
	}

	public WebDriver lauchWebsiteByBrowser(String browser) {
		driverObj = lauchBrowser(browser);
		navigateToWebsite("https://google.com");
		getUrlDetails();
		return driverObj;
	}
	
	public void navigateToWebsite(String website) {
		System.out.printf("Navigating to website: %s\n", website);
		driverObj.navigate().to(website);		
	}

	private WebDriver lauchBrowser(String browserName) {
		System.out.printf("Launching %s browser\n", browserName);
		browserName = browserName.toLowerCase();
		switch (browserName) {
		case "chrome":
			DriverManagerType chromedriver = DriverManagerType.CHROME;
			WebDriverManager.getInstance(chromedriver).setup();
			driverObj = new ChromeDriver();
			break;

		case "firefox":
			DriverManagerType firefoxdriver = DriverManagerType.FIREFOX;
			WebDriverManager.getInstance(firefoxdriver).setup();
			driverObj = new FirefoxDriver();
			break;

		case "edge":
			DriverManagerType edgedriver = DriverManagerType.EDGE;
			WebDriverManager.getInstance(edgedriver).setup();
			driverObj = new EdgeDriver();
			break;

		case "opera":
			DriverManagerType operadriver = DriverManagerType.OPERA;
			WebDriverManager.getInstance(operadriver).setup();
			driverObj = new OperaDriver();
			break;

		case "ieexplorer":
			DriverManagerType ieExplorerdriver = DriverManagerType.IEXPLORER;
			WebDriverManager.getInstance(ieExplorerdriver).setup();
			driverObj = new InternetExplorerDriver();
			break;

		case "safari":
			DriverManagerType safaridriver = DriverManagerType.SAFARI;
			WebDriverManager.getInstance(safaridriver).setup();
			driverObj = new SafariDriver();
			break;

		default:
			System.out.printf("%s is an invalid browser.", browserName);
			System.out.println("Couldn't able to launch the browser");
			throw new IllegalArgumentException("Invalid browser name: " + browserName
					+ ". Supported browsers are Chrome, Firefox, Opera, IE Explorer, Edge, Safari.");
		}
		System.out.printf("%s browser launched successfully\n", browserName);
		maximizeBrowser();
		return driverObj;
	}
	
	public void maximizeBrowser() {
		System.out.println("Maximizing the browser");
		driverObj.manage().window().maximize();
	}
	
	public void closeBrowser() {
		System.out.println("Closing the browser");
		driverObj.close();
	}
	
	public void quitBrowser() {
		System.out.println("Quiting the browser");
		driverObj.quit();
	}
	
	public void getUrlDetails() {
		System.out.println("Webpage Details:");
		System.out.println("Title: " + driverObj.getTitle());
		System.out.println("URL: " + driverObj.getCurrentUrl());
		System.out.println("Window Handle: " + driverObj.getWindowHandle());
		System.out.println("Window Dimensions: " + driverObj.manage().window().getSize());
		System.out.println("Cookies List: \n" + driverObj.manage().getCookies());
	}
}

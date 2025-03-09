package com.selenium.utility;

import java.util.Collections;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

/**
 * Used for browser manager
 */
public class BrowserManager extends BaseClass {

	public WebDriver lauchWebsiteByBrowser(String browser, String website, boolean isHeadless) {
		driverObj = lauchBrowser(browser, isHeadless);
		navigateToWebsite(website);
		getUrlDetails();
		return driverObj;
	}

	public WebDriver lauchWebsiteByBrowser(String browser, boolean isHeadless) {
		driverObj = lauchBrowser(browser, isHeadless);
		navigateToWebsite("https://google.com");
		getUrlDetails();
		return driverObj;
	}

	public void navigateToWebsite(String website) {
		System.out.printf("Navigating to website: %s\n", website);
		driverObj.navigate().to(website);
	}

	private WebDriver lauchBrowser(String browserName, boolean isHeadless) {
		System.out.printf("Launching %s browser with headless mode %s\n", browserName, isHeadless ? "ON" : "OFF");
		browserName = browserName.toLowerCase();
		switch (browserName) {
		case "chrome":
			DriverManagerType chromedriver = DriverManagerType.CHROME;
			WebDriverManager.getInstance(chromedriver).setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			if (isHeadless) {
				chromeOptions.addArguments("--headless=new");
			}
			driverObj = new ChromeDriver(chromeOptions);
			break;

		case "firefox":
			DriverManagerType firefoxdriver = DriverManagerType.FIREFOX;
			WebDriverManager.getInstance(firefoxdriver).setup();
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			if (isHeadless) {
				firefoxOptions.addArguments("--headless");
			}
			driverObj = new FirefoxDriver(firefoxOptions);
			break;

		case "edge":
			DriverManagerType edgedriver = DriverManagerType.EDGE;
			WebDriverManager.getInstance(edgedriver).setup();
			EdgeOptions edgeOptions = new EdgeOptions();
			if (isHeadless) {
				edgeOptions.setCapability("ms:edgeOptions", new HashMap<String, Object>() {
					{
						put("args", Collections.singletonList("--headless=new"));
					}
				});
			}
			driverObj = new EdgeDriver(edgeOptions);
			break;

		case "safari":
			DriverManagerType safaridriver = DriverManagerType.SAFARI;
			WebDriverManager.getInstance(safaridriver).setup();
			if (isHeadless) {
				System.out.println("Safari doesn't support headless mode. So executing normally\n");
			}
			driverObj = new SafariDriver();
			break;

		default:
			System.out.printf("%s is an invalid browser.", browserName);
			System.out.println("Couldn't able to launch the browser");
			throw new IllegalArgumentException(
					"Invalid browser name: " + browserName + ". Supported browsers are Chrome, Firefox, Edge, Safari.");
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
		System.out.println("--------------------------------------------------");
		System.out.println("Title: " + driverObj.getTitle());
		System.out.println("URL: " + driverObj.getCurrentUrl());
		System.out.println("Window Handle: " + driverObj.getWindowHandle());
		System.out.println("Window Dimensions: " + driverObj.manage().window().getSize());
		System.out.println("Cookies List: \n" + driverObj.manage().getCookies());
		System.out.println("--------------------------------------------------");
	}
}

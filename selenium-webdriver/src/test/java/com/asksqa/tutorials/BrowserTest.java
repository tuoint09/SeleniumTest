package com.asksqa.tutorials;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public final static String baseUrl = "http://maven.apache.org";
	
	WebDriver browser = null;

	@Test
	public void openAppOnFirefox() {
		
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		browser = new FirefoxDriver();
		browser.get(baseUrl);
		browser.quit();
	}
	
	@Test
	public void openAppOnChrome() {
		
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		browser = new ChromeDriver();
		browser.get(baseUrl);
		browser.quit();
	}

}

package web.driver.action;

import java.util.concurrent.TimeUnit;

import org.joda.time.Seconds;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAction {
	
	protected WebDriver driver;

	public WebDriverAction(WebDriver driver) {
		this.driver = driver;
	}
	
	//Open browser & get url
	public void getUrl(String url) {
		driver.get(url);
	}
	
	//Get Element
	public By getElement(String locator) {
		By by = null;
		if (locator.startsWith("id=")) {
			locator = locator.substring(3);
			by = By.id(locator);
		} else if (locator.startsWith("name=")) {
			locator = locator.substring(5);
			by = By.name(locator);
		} else if (locator.startsWith("className=")) {
			locator = locator.substring(10);
			by = By.className(locator);
		} else if (locator.startsWith("cssSelector=")) {
			locator = locator.substring(12);
			by = By.cssSelector(locator);
		} else if (locator.startsWith("linkText=")) {
			locator = locator.substring(9);
			by = By.linkText(locator);
		} else if (locator.startsWith("partialLinkText=")) {
			locator = locator.substring(16);
			by = By.partialLinkText(locator);
		} else if (locator.startsWith("tagName=")) {
			locator = locator.substring(8);
			by = By.tagName(locator);
		} else if (locator.startsWith("xPath=")) {
			locator = locator.substring(6);
			by = By.xpath(locator);
		}
		return by;
	}
	
	//Get WebElement
	public WebElement getWebElement(String locator) {
		return driver.findElement(getElement(locator));
	}
	
	//Click on an object
	public void clickObj(String locator) {
		getWebElement(locator).click();
	}
	
	//Send key
	public void sendKey(String locator,String value) {
		getWebElement(locator).sendKeys(value);
	}
	
	//Get content 
	public String getContent(String locator) {
		return getWebElement(locator).getText();
	}
	
	//Implicit wait
	public void waitImplicit(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	
	//Explicit wait
	public void waitExplicit(int time, String locator) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(getWebElement(locator)));
	}
	
	//Close browser
	public void closeBrowser() {
		driver.close();
	}
	
}

package seleniumeasy.page;

import org.openqa.selenium.WebDriver;

import web.driver.action.WebDriverAction;

public class HomePage extends WebDriverAction {


	public HomePage(WebDriver driver) {
		super(driver);
	}

	public HomePage navigateToHomePage() {
		getUrl("https://www.seleniumeasy.com");
		return new HomePage(driver);
	}
	
	//Go to Demo page
	public DemoPage navigateToDemoPage() {
		waitExplicit(60, "cssSelector=#block-block-57 > div > div > a");
		//clickObj("xpath=//*[@id='block-block-57']/div/div/a");
		clickObj("cssSelector=#block-block-57 > div > div > a");
		return new DemoPage(driver);
	}

}

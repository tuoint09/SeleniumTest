package seleniumeasy.test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumeasy.page.BasicFirstFormDemo;
import seleniumeasy.page.DemoPage;
import seleniumeasy.page.HomePage;
import web.driver.action.WebDriverAction;

public class TestBasicFirstForm {
	
	WebDriver driver;
	HomePage homePage;
	DemoPage demoPage;
	BasicFirstFormDemo basicFirstFormDemo;
	WebDriverAction webDriverAction;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver   			= new ChromeDriver();
		homePage 			= new HomePage(driver);
		demoPage 			= new DemoPage(driver);
		basicFirstFormDemo  = new BasicFirstFormDemo(driver);
		webDriverAction 	= new WebDriverAction(driver);
		webDriverAction.waitImplicit(60);
		homePage.navigateToHomePage();
		homePage.navigateToDemoPage();
		demoPage.navigateToFirstForm();
	}
	
	@Test
	public void test01() {
		basicFirstFormDemo.enterMessage("test");
		basicFirstFormDemo.clickShowMessageButton();
		assertEquals(basicFirstFormDemo.getMessage(), "test");
	}
	
	@Test
	public void test02() {
		basicFirstFormDemo.enterA("67");
		basicFirstFormDemo.enterB("7");
		basicFirstFormDemo.clickGetTotalButton();
		assertEquals(basicFirstFormDemo.getTotal(),basicFirstFormDemo.total("67", "7"));
	}

}

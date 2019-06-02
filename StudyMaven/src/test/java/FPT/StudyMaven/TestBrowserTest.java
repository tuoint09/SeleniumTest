package FPT.StudyMaven;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowserTest {
	
	public final static String baseUrl = "http://todomvc.com/examples/angularjs/#/";
	WebDriver browser1 = null;

	@Test
	public void OpenChrome() {
			
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		browser1 = new ChromeDriver();
		browser1.get(baseUrl);
		browser1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		browser1.findElement(By.cssSelector(".new-todo")).sendKeys("Test01");
		//browser1.findElement(By.xpath("//input[@ng-model='newTodo']")).sendKeys("Test01");
		//browser1.quit();
		
	/*
	@Ignore
	public void OpenFirefox() {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		browser1 = new FirefoxDriver();
*/
		
		//browser1.quit();
	}
	// Bài 1. Cách điền text và input field

	
	

}

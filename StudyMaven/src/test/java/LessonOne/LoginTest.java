package LessonOne;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class LoginTest {

	@SuppressWarnings("deprecation")
	@Test
	public void Gmailtest() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		//Open Chrome and get URL
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.codecademy.com/");
		driver.get("https://accounts.google.com");
		
		//Test Login
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.className("email")).sendKeys("Test01");
		
		By LoginBy = By.id("identifierNext");
		WebElement LoginBn = driver.findElement(LoginBy);
		LoginBn.click();
		
		By ErrMsgBy = By.className("GQ8Pzc");
		WebElement ErrMsg = driver.findElement(ErrMsgBy);
		String content = ErrMsg.getText();
		
		assertEquals(content, "Hãy nhập email hoặc số điện thoại");
	}

}

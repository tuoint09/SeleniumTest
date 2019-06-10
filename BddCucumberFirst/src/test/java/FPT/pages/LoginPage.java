package FPT.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://automationpractice.com/index.php?controller=authentication")
public class LoginPage extends PageObject {
	
	@FindBy(xpath = "//*[@id='email']")
	WebElement emailField;
	public void enter_email(String email) {
		emailField.sendKeys(email);		
	}

	@FindBy(xpath = "//*[@id='passwd']")
	WebElement passwordField;
	public void enter_password(String password) {
		passwordField.sendKeys(password);	
	}
	
	@FindBy(id="SubmitLogin")
	WebElement submitBtn;
	public void click_submit() {
		passwordField.click();		
	}
	
	
	@FindBy(xpath = "//*[@id='center_column']/div[1]/ol/li")
	WebElement errMsg;
	public String getErrMsg() {
		return errMsg.getText();
	}

}

////*[@id="email"]
////*[@id="passwd"]
//#SubmitLogin > span
////*[@id="SubmitLogin"]/span
////*[@id="center_column"]/div[1]/ol/li

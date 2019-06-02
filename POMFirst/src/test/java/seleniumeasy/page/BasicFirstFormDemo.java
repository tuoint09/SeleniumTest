package seleniumeasy.page;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import freemarker.template.utility.StringUtil;

public class BasicFirstFormDemo extends DemoPage {

	public BasicFirstFormDemo(WebDriver driver) {
		super(driver);
	}
	
	public void enterMessage(String value) {
		sendKey("cssSelector=#user-message", value);
	}
	
	public void clickShowMessageButton() {
		clickObj("cssSelector=#get-input > button");
	}
	
	public String getMessage() {
		return getContent("id=display");
	}
	
	public void enterA(String value) {
		sendKey("id=sum1", value);
	}
	
	public String getEnterA() {
		return getContent("id=sum1");
	}
	
	public void enterB(String value) {
		sendKey("id=sum2", value);
	}
	
	public String getEnterB() {
		return getContent("id=sum2");
	}
	
	public void clickGetTotalButton() {
		clickObj("cssSelector=#gettotal > button");
	}
	
	public int convertStringToInt(String s) {
		return Integer.parseInt(s);
	}
	
	public String total(String numberA, String numberB) {
		int i =  convertStringToInt(numberA) + convertStringToInt(numberB);
		return String.valueOf(i);
	}
/*
	public String calculatorTotal(String numberA, String numberB) {
		if (StringUtils.isNumeric(numberA) == true && StringUtils.isNumeric(numberB) == true) {
			return total(numberA, numberB);
		} else return "NaN";
	}
*/	
	public String getTotal() {
		return getContent("id=displayvalue");
	}
	
}

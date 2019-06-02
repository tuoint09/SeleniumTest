package seleniumeasy.page;

import org.openqa.selenium.WebDriver;

public class DemoPage extends HomePage {

		
	public DemoPage(WebDriver driver) {
		super(driver);
	}
	
	//Go to basic first form demo
	public BasicFirstFormDemo navigateToFirstForm() {
		waitExplicit(60, "id=btn_basic_example");
		clickObj("id=btn_basic_example");
		waitExplicit(60, "partialLinkText=Simple Form Demo");
		clickObj("partialLinkText=Simple Form Demo");
		return new BasicFirstFormDemo(driver);
		
	}
}

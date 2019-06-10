package FPT.steps.serenity;

import FPT.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginSteps extends ScenarioSteps {

	private static final long serialVersionUID = 1L;

	public static final Object getAlertMessage = null;

	LoginPage loginPage;

	@Step
	public void open_home_page() {
		loginPage.open();
	}

	@Step
	public void input_email(String email) {
		loginPage.enter_email(email);
	}

	@Step
	public void input_password(String password) {
		loginPage.enter_password(password);
	}

	@Step
	public void click_submit() {
		loginPage.click_submit();
	}

	@Step
	public String getAlertMessage() {
		return loginPage.getErrMsg();
	}

}

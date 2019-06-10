package FPT;

import static org.junit.Assert.assertEquals;

import FPT.steps.serenity.LoginSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginScenarioSteps {
	
	@Steps
	LoginSteps loginStep;
	
	
	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Exception {
		loginStep.open_home_page();
	}


	@When("^I input my account is \"([^\"]*)\"$")
	public void i_input_my_account_is(String email) throws Exception {
		loginStep.input_email(email);
	}

	@And("^I input my password is \"([^\"]*)\"$")
	public void i_input_my_password_is(String password) throws Exception {
		loginStep.input_password(password);
	}
	
	@And("^I click submit button$")
	public void i_click_submit_button() throws Exception {
		loginStep.click_submit();
	}

	@Then("^I should see a alert message is \"([^\"]*)\"$")
	public void i_should_see_a_alert_message_is(String msgMsg) throws Exception {
		assertEquals(loginStep.getAlertMessage(),msgMsg);
	}


}

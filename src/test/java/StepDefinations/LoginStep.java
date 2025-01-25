package StepDefinations;

import org.testng.Assert;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.LoginClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {
	private static LoginClass login;
	
//	@Given("user should be on login page")
//	public void user_should_be_on_login_page() {
//		BaseClass.intialization();
//		
//	    }

	@When("user enter valid username as {string}")
	public void user_enter_valid_username_as(String string) {
		login = new LoginClass();
		login.loginFunctionalityUname("Admin");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		login.clicOnkLogin();

	}

	@Then("capture warning message")
	public void capture_warning_message() {
		String warnMessage = login.captureWarningMessage();
		Assert.assertEquals(warnMessage, "Required");
	}

}

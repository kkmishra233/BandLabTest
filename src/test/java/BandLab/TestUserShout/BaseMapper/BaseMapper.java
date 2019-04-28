package BandLab.TestUserShout.BaseMapper;

import BandLab.TestUserShout.BusinessAction.ActionMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaseMapper {

	ActionMethods actions = new ActionMethods();
	
	@Given("^I navigate to bandlab homepage$")
	public void i_navigate_to_bandlab_homepage() throws Throwable {
		actions.navigateHomePage();
	}

	@When("^i click on Signup button$")
	public void i_click_on_Signup_button() throws Throwable {
		actions.clickOnsignup();
	}

	@When("^fill create user details with \"([^\"]*)\" , \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_create_user_details_with_and(String arg1, String arg2, String arg3) throws Throwable {
		actions.fillSignUpDetails(arg1, arg2, arg3);
	}

	@Then("^create Shout for followers$")
	public void create_Shout_for_followers() throws Throwable {
		actions.createShout();
	}
	@Then("^follow user \"([^\"]*)\"$")
	public void follow_user(String arg1) throws Throwable {
		actions.followUser(arg1);
	}
	
	@Then("^navigate to feed page and verify the \"([^\"]*)\" users' shout is available in my feed$")
	public void navigate_to_feed_page_and_verify_the_users_shout_is_available_in_my_feed(String arg1) throws Throwable {
	    actions.verifyUserShoutAvailableInFeed(arg1);
	}
	
	@Given("^submit Signup form$")
	public void submit_Signup_form() throws Throwable {
		actions.SignUp();
	}

	@When("^now navigate to login page and perform login operation with user credentials i\\.e\\. \"([^\"]*)\" and \"([^\"]*)\"$")
	public void now_navigate_to_login_page_and_perform_login_operation_with_user_credentials_i_e_and(String arg1, String arg2) throws Throwable {
		actions.navigateToLogIn();
		actions.enterLoginDetails(arg1, arg2);
		actions.sugmitSignIn();
	}
	
	@When("^I login with my credentials i\\.e\\. \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_login_with_my_credentials_i_e_and(String arg1, String arg2) throws Throwable {
		actions.navigateToLogIn();
		actions.enterLoginDetails(arg1, arg2);
		actions.sugmitSignIn();
	}

	@Then("^logout$")
	public void logout() throws Throwable {
		actions.userLogOut();
		actions.closeBrowser();
	}

}

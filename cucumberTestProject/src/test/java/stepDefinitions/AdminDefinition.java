package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.AdminPageActions;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class AdminDefinition {
	private WebDriver driver = GlobalVariables.driver;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	AdminPageActions adminPage=new AdminPageActions(driver);
	BaseClass bc;

	@Given("user is clicking users from User Management and Clicking on Add button")
	public void user_is_clicking_users_from_user_management_and_clicking_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.click_Admin();
		adminPage.click_Add();
	}

	@When("user is selecting User Role {string}")
	public void user_is_selecting_user_role(String string) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.select_UserRole(); 
	}

	@When("user is typing the Employee Name {string}")
	public void user_is_typing_the_employee_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.enter_EmployeeName("HRM Employee");
	}

	@When("user is selecting Status {string}")
	public void user_is_selecting_status(String string) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.select_Status();
	}

	@When("user is typing the Username {string}")
	public void user_is_typing_the_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.enter_UserName("Username123");
	}
	
	@When("user is typing the Password {string}")
	public void user_is_typing_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.enter_Password(password);
	    
	}

	@When("user is typing the confirm password {string}")
	public void user_is_typing_the_confirm_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		adminPage.enter_ConfirmPassword("P@ssword123");
	}

	@When("enters the save button")
	public void enters_the_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // adminPage.click_Save();
	}

	@Then("the user navigates to the user Page")
	public void the_user_navigates_to_the_user_page() {
	    // Write code here that turns the phrase above into concrete actions
		
	}


}

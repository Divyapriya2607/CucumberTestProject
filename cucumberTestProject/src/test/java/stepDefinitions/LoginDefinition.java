package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class LoginDefinition {

	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	BaseClass bc;
	@Given("User is entering OrangeHRM URL")
	public void user_is_entering_orange_hrm_url() {
	    // Write code here that turns the phrase above into concrete actions
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		bc = new BaseClass(driver);
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}
	@When("user is typing the username {string}")
	public void user_is_typing_the_username(String username) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enter_Username(username);
	}
	@When("user is typing the password {string}")
	public void user_is_typing_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enter_Password(password);
	    
	}
	@When("enters the return key")
	public void enters_the_return_key() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.click_Login();
		Thread.sleep(6000);
	    
	}
	@Then("the user navigates to the Home Page")
	public void the_user_navigates_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		String text=loginPage.text_Displayed();
		if(text.contains("OrangeHRM")){
			System.out.println("Results Displayed");
		}
	    
	}



}

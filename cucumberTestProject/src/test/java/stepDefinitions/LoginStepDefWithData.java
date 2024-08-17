package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class LoginStepDefWithData {

	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	BaseClass bc;
	@Given("^User is entering the OrangeHRM URL$")
	public void user_is_entering_the_orange_hrm_url() {
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		bc = new BaseClass(driver);
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}
	@When("^user is typing username \"(.*?)\"$")
	public void user_is_typing_username(String username) {
		loginPage.enter_Username(username);
	}
	@When("^user is typing password \"(.*?)\"$")
	public void user_is_typing_password(String password) {
		loginPage.enter_Password(password);  
	}
	@When("^enters return key$")
	public void enters_return_key() throws InterruptedException {
		loginPage.click_Login();
		Thread.sleep(6000);  
	}

}

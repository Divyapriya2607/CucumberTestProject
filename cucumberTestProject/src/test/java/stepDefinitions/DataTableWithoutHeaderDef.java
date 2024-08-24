package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v112.webauthn.model.Credential;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class DataTableWithoutHeaderDef {

	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	BaseClass bc;
	@Given("^You are on entering the OrangeHRM URL$")
	public void you_are_on_entering_the_orange_hrm_url() {
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		bc = new BaseClass(driver);
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}
	@When("^You typing the below credentials$")
	public void you_typing_the_below_credentials(DataTable dataTable) {
		List<String> credentials=dataTable.asList(String.class);
		String userName=credentials.get(0);
		String passWord=credentials.get(1);
		loginPage.enter_Username(userName);
		loginPage.enter_Password(passWord);
	}
	@When("^click the login button$")
	public void click_the_login_button() throws InterruptedException {
		loginPage.click_Login();
		Thread.sleep(6000);
	}
	

}

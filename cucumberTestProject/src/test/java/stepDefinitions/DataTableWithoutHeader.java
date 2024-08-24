package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class DataTableWithoutHeader {
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
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> credentials=dataTable.asLists(String.class);
		String userName=credentials.get(0).toString();
//		String passWord=credentials.get(1).toString();
		loginPage.enter_Username(userName);
//		loginPage.enter_Password(passWord); 
	}
	@When("^click the login button$")
	public void click_the_login_button() throws InterruptedException {
		loginPage.click_Login();
		Thread.sleep(6000);
	}

}

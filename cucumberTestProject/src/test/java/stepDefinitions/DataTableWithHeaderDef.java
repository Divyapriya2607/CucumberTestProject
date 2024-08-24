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

public class DataTableWithHeaderDef {
	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	BaseClass bc;
	@Given("^Go to login page$")
	public void go_to_login_page() {
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		bc = new BaseClass(driver);
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}
	@When("^enter the below credentials$")
	public void enter_the_below_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String,String>> keyValuePair=dataTable.asMaps(String.class,String.class);
		String userName=keyValuePair.get(0).get("UserName");
		String passWord=keyValuePair.get(0).get("Password");
		loginPage.enter_Username(userName);
		loginPage.enter_Password(passWord); 
	    
	}
	@When("^click login button$")
	public void click_login_button() throws InterruptedException {
		loginPage.click_Login();
		Thread.sleep(6000); 
	}

}

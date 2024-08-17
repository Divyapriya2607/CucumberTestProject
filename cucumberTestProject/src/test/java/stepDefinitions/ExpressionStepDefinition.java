package stepDefinitions;

import io.cucumber.java.en.Given;

public class ExpressionStepDefinition {

	//For integer RegularExpression \\d+
	@Given("I have (\\d+) laptop$")
	public void I_have_1_laptop(int count) {
		System.out.println("Laptop count "+count);
	}
	//For decimal RegularExpression \\d+\\.\\d+
	@Given("I have a (\\d+\\.\\d+) CGPA$")
	public void I_have_a__CGPA(float num) {
		System.out.println("CGPA is "+num);
	}
	//For string RegularExpression \"(.*?)\"
	@Given("\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name,String name2, String name3) {
		System.out.println(name+" is elder to "+name2+" and "+name3);
	}
}

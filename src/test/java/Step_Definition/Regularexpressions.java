package Step_Definition;

import io.cucumber.java.en.Given;

public class Regularexpressions {

	@Given("I have {int} laptop")
	public void i_have_laptop(Integer int1) {

	System.out.println(int1);
	}
	
	@Given("My Age is {double} years old")
	public void my_age_is_years_old(Double double1) {    
	System.out.println(double1);
	}
	
	@Given("^\"([^\"]*)\" is elder to \"([^\"]*)\" and \"([^\"]*)\"$")
	public void is_elder_to_and(String string1, String string2, String string3) {

	System.out.println(string1 + string2 +  string3);
	}
}

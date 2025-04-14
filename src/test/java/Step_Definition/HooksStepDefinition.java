package Step_Definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinition {

	@Given("Thanos has the infinity stones")
	public void thanos_has_the_infinity_stones() {
		System.out.println("Thanos has all the infinity stones ");
	}

	@When("Thanos snaps his finger")
	public void thanos_snaps_his_finger() {
		System.out.println("Thanos snaps his finger in a shot ");
	}

	@Then("Half of the world will be destroyed")
	public void half_of_the_world_will_be_destroyed() {
		System.out.println("Half of the world was be destroyed");

	}
}

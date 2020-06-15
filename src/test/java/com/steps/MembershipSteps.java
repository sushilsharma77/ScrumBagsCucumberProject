package com.steps;

import com.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MembershipSteps extends CommonMethods {
	@Given("I navigate to Qualification under Admin")
	public void i_navigate_to_Qualification_under_Admin() {
		click(dashboard.admin);
		click(dashboard.qualific);
	}

	@When("I go to qulification")
	public void i_go_to_qulification() {
		click(addMemShip.membBtn);

	}

	@Then("I able to add different {string}")
	public void i_able_to_add_different(String name) {
		click(addMemShip.AddBtn);
		sendText(addMemShip.memShipName, name);
		click(addMemShip.saveBtn);
		System.out.println("succssesfully added memberships");

	}
}

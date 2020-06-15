package com.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingDependentSteps extends CommonMethods {

	@Given("I login with {string} and {string}")
	public void i_login_with_and(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginBtn);
	}

	@Given("I navigate to Employee List")
	public void i_navigate_to_Employee_List() {
		click(dashboard.PIM);
		click(dashboard.empListPage);
		wait(4);
	}

	@Given("I search employee with name {string}")
	public void i_search_employee_with_name(String name) {
		sendText(viewEmp.empName, name);
		jsClick(viewEmp.searchBtn);
		wait(4);
		jsClick(viewEmp.addedEmpName);
	}

	@When("I navigate to Dependents")
	public void i_navigate_to_Dependents() {
		click(viewEmp.dependent);
	}

	@When("I add multiple dependents")
	public void i_add_multiple_dependents(DataTable dataTable) {
		List<Map<String, String>> addDependents = dataTable.asMaps();
		for (Map<String, String> map : addDependents) {

			String name = map.get("Name");
			String DOB = map.get("Date of Birth");

			click(viewDepnd.addDepenBtn);
			sendText(viewDepnd.addName, name);
			click(viewDepnd.selectRelation);
			click(viewDepnd.childRelation);
			sendText(viewDepnd.dateOfBirth, DOB);
			jsClick(viewDepnd.sveBtn);
		}
	}

	@Then("I verify {string} and {string} added as dependent")
	public void i_verify_and_added_as_dependent(String firstPerson, String secondPerson) {
		String expected = firstPerson + " " + secondPerson;
		System.out.println(expected);
		String actual = viewDepnd.depnTwo.getText() + " " + viewDepnd.depnOne.getText();
		Assert.assertEquals("dependents couldn't get added", expected, actual);

	}
}

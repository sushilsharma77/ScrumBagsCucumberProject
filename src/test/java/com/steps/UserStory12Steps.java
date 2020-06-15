package com.steps;

import org.junit.Assert;

import com.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UserStory12Steps extends CommonMethods {
	@When("I click on Memberships")
	public void i_click_on_Memberships() {
		click(viewMemShip.memberShipBtn);
		click(viewMemShip.addBtn);

	}

	@Then("I able to add different membership informations")
	public void i_able_to_add_different_membership_informations() {
		click(viewMemShip.selectMembership);
		click(viewMemShip.optionJavaUserss);
		click(viewMemShip.paidBy);
		click(viewMemShip.paidByOption);
		sendText(viewMemShip.amount, "1000");
		click(viewMemShip.currency);
		click(viewMemShip.currencyOption);
		sendText(viewMemShip.commenceDate, "2019-Jun-19");
		sendText(viewMemShip.renewalDate, "2021-Jun-18");
		click(viewMemShip.BtnSave);

	}

	@Then("I verify successfully added informations")
	public void i_verify_successfully_added_informations() {
		String expected="Java Userss";
		String actual=viewMemShip.addedMembership.getText();
		
		Assert.assertEquals(expected, actual);
	   
	}

}

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testbase.BaseClass;

public class ViewMembershipsPageElements {
	@FindBy(linkText = "Memberships")
	public WebElement memberShipBtn;
	
	@FindBy(id="btnAddMembershipDetail")
	public WebElement addBtn;
	
	@FindBy(id="membership_membership")
	public WebElement selectMembership;
	
	@FindBy(xpath="//*[@id='membership_membership']/option[14]")
	public WebElement optionJavaUserss;
	
	@FindBy(id="membership_subscriptionPaidBy")
	public WebElement paidBy;
	
	@FindBy(xpath="//select[@id='membership_subscriptionPaidBy']/option[2]")
	public WebElement paidByOption;
	
	@FindBy(id="membership_subscriptionAmount")
	public WebElement amount;
	
	@FindBy(id="membership_currency")
	public WebElement currency;
	
	@FindBy(xpath="//select[@id='membership_currency']/option[150]")
	public WebElement currencyOption;
	
	@FindBy(id="membership_subscriptionCommenceDate")
	public WebElement commenceDate;
	
	@FindBy(id="membership_subscriptionRenewalDate")
	public WebElement renewalDate;
	
	@FindBy(id="btnSaveMembership")
	public WebElement BtnSave;
	
	@FindBy(linkText="Java Userss")
	public WebElement addedMembership;

	public ViewMembershipsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);

	}
}

package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class ViewDependentsPageElements {
	@FindBy(id="btnAddDependent")
	public WebElement addDepenBtn;
	
	@FindBy(id="dependent_name")
	public WebElement addName;
	
	@FindBy(xpath="//select[@id='dependent_relationshipType']/option[2]")
	public WebElement childRelation;
	
	@FindBy (id="dependent_dateOfBirth")
	public WebElement dateOfBirth;
	
	@FindBy(id="dependent_relationshipType")
	public WebElement selectRelation;
	
	@FindBy(id="btnSaveDependent")
	public WebElement sveBtn;
	
	@FindBy(xpath="//table[@id='dependent_list']/tbody/tr[1]/td[2]")
	public WebElement depnOne;
	
	@FindBy(xpath="//table[@id='dependent_list']/tbody/tr[2]/td[2]")
	public WebElement depnTwo;
	
	
	public ViewDependentsPageElements(){
		PageFactory.initElements(BaseClass.driver, this);
	}

}



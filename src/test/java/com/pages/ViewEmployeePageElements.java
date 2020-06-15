package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class ViewEmployeePageElements {

	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td[3]/a")
	public WebElement addedEmpName;
	
	@FindBy(xpath="//*[@id=\"sidenav\"]/li[4]")
	public WebElement dependent;

	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
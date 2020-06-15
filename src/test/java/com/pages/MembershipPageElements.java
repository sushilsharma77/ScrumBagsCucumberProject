package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testbase.BaseClass;

public class MembershipPageElements {
	@FindBy(id="menu_admin_membership")
	public WebElement membBtn;
	
	@FindBy(id="btnAdd")
	public WebElement AddBtn;
	
	@FindBy(id="membership_name")
	public WebElement memShipName;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(id="resultTable")
	public List<WebElement> memTable;
	
	
	public MembershipPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	

}

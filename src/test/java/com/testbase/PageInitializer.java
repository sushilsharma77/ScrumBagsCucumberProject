package com.testbase;

import com.pages.AddEmployeePageElements;
import com.pages.DashboardPageElements;
import com.pages.LoginPageElements;
import com.pages.MembershipPageElements;
import com.pages.PersonalDetailsPageElements;
import com.pages.ViewDependentsPageElements;
import com.pages.ViewEmployeePageElements;
import com.pages.ViewMembershipsPageElements;

//initializes all pages class and stores references in static varibales
//that will called/used in test classes
public class PageInitializer extends BaseClass {

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashboardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	public static ViewEmployeePageElements viewEmp;
	public static ViewDependentsPageElements viewDepnd;
	public static MembershipPageElements addMemShip;
	public static ViewMembershipsPageElements viewMemShip;

	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		pdetails = new PersonalDetailsPageElements();
		viewEmp = new ViewEmployeePageElements();
		viewDepnd = new ViewDependentsPageElements();
		addMemShip = new MembershipPageElements();
		viewMemShip = new ViewMembershipsPageElements();

	}
}

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userStory12.feature");
formatter.feature({
  "name": "As an admin user should be able to add memberships to any employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@UserStory12"
    }
  ]
});
formatter.scenario({
  "name": "adding multiple dependents",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@UserStory12"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login with \"Admin\" and \"Hum@nhrm123\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.steps.AddingDependentSteps.i_login_with_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to Employee List",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.AddingDependentSteps.i_navigate_to_Employee_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search employee with name \"Salman Khan\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.AddingDependentSteps.i_search_employee_with_name(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Memberships",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.UserStory12Steps.i_click_on_Memberships()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I able to add different membership informations",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.UserStory12Steps.i_able_to_add_different_membership_informations()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify successfully added informations",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.UserStory12Steps.i_verify_successfully_added_informations()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "adding multiple dependents");
formatter.after({
  "status": "passed"
});
});
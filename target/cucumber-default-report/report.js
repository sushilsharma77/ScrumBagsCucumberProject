$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/membership.feature");
formatter.feature({
  "name": "As an admin user should be able to add different",
  "description": "  memberships under qualifications",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Membership"
    }
  ]
});
formatter.scenarioOutline({
  "name": "adding different membership",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I login with \"Admin\" and \"Hum@nhrm123\"",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to Qualification under Admin",
  "keyword": "And "
});
formatter.step({
  "name": "I go to qulification",
  "keyword": "When "
});
formatter.step({
  "name": "I able to add different \"\u003cmembership\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "membership"
      ]
    },
    {
      "cells": [
        "Quality Assurance"
      ]
    },
    {
      "cells": [
        "Retro Fitness"
      ]
    },
    {
      "cells": [
        "Capital Zoo"
      ]
    }
  ]
});
formatter.scenario({
  "name": "adding different membership",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Membership"
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
  "name": "I navigate to Qualification under Admin",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_navigate_to_Qualification_under_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to qulification",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_go_to_qulification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I able to add different \"Quality Assurance\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_able_to_add_different(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "adding different membership");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "adding different membership",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Membership"
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
  "name": "I navigate to Qualification under Admin",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_navigate_to_Qualification_under_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to qulification",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_go_to_qulification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I able to add different \"Retro Fitness\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_able_to_add_different(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "adding different membership");
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "adding different membership",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Membership"
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
  "name": "I navigate to Qualification under Admin",
  "keyword": "And "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_navigate_to_Qualification_under_Admin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I go to qulification",
  "keyword": "When "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_go_to_qulification()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I able to add different \"Capital Zoo\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.steps.MembershipSteps.i_able_to_add_different(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "adding different membership");
formatter.after({
  "status": "passed"
});
});
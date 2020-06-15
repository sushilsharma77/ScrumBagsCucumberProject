#Author: susarma.syntax@email.com
@Dependents
Feature: As an admin I should be able to add multiple depentents of employee

  Scenario: adding multiple dependents
    Given I login with "Admin" and "Hum@nhrm123"
    And I navigate to Employee List
    And I search employee with name "Salman Khan"
    When I navigate to Dependents
    And I add multiple dependents
      | Name        | Date of Birth |
      | Sohil Khan  | 1999-Jun-20     |
      | Fakir  Khan | 2005-Dec-10     |
    Then I verify "Sohil Khan" and "Fakir Khan" added as dependent

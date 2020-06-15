#Author: susarma.syntax@email.com
@UserStory12
Feature: As an admin user should be able to add memberships to any employee 
  Scenario: adding multiple dependents
    Given I login with "Admin" and "Hum@nhrm123"
    And I navigate to Employee List
    And I search employee with name "Salman Khan"
    When I click on Memberships
    Then I able to add different membership informations
    And I verify successfully added informations
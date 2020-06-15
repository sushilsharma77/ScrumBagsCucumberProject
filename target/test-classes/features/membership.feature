#Author: susarma.syntax@email.com
@Membership
Feature: As an admin user should be able to add different
  memberships under qualifications

  Scenario Outline: adding different membership
    Given I login with "Admin" and "Hum@nhrm123"
    And I navigate to Qualification under Admin
    When I go to qulification
    Then I able to add different "<membership>"

    Examples: 
      | membership        |
      | Quality Assurance |
      | Retro Fitness     |
      | Capital Zoo       |

Feature: Login
@login
Scenario: Login with valid credintials
Given user navigate to url
When user login with "Admin" and "Hum@nhrm123"
Then user see Synatax logo

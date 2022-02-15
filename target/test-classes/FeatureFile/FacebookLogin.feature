Feature: To validate facebook login functionality

Scenario: To validate facebook login invalid username and valid password

Given User is in Facebook login page
When User enter invalid username and valid password
And User clicks on login buttion
Then User should be in invalid login page
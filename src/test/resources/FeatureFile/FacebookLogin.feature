@Login

Feature: To check facebook login function using one scenario

Scenario: To check login using invalid email and valid password

Given User is currently in facebook login page
When User enters invalid email and valid password
And User clicks login button
Then User should be landed in invalid login page
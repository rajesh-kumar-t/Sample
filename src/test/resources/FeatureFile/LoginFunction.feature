Feature: To check login functionality of facebook web application

Background: 
Given User is currently in facebook login page

Scenario: To check login using valid email and invalid password

When User enters valid email and invalid password
And User clicks login button
Then User should be landed in invalid login page

Scenario: To check login using invalid email and invalid password

When User enters invalid email and invalid password
And User clicks login button
Then User should be landed in invalid login page
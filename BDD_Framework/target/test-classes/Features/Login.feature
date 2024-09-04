Feature: Login page automation for amazon.com
Scenario: Check login funcationality with valid credentials.

Given user is on login page of amazon.
When user enters valid credentails.
And user is clicking on login button.
Then user is navigated to home page. 
And close the browser
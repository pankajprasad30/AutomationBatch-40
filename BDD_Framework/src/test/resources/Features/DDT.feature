Feature: Saucedemo page automation
Scenario Outline: Login into sauce demo page with DDT concept.
Given User is on sauce demo webpage.
When user is login into sauce demo webpage with valid "<user name>" and "<password>".
And user clicks on login Button.
Then user navigated to home page of saucedemo webpage.
And Quit the browser.

Examples:
| user name | password |
|standard_user| secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
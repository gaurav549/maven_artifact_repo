Feature: Create Account on Instagram 
As a user you need to open Instagram Page 

Background: Common steps for Login Page
Given User needs to be on Instagram Login Page

@SmokeTest
Scenario: Validate username field
When User enters "Gaurav" username
Then User checks username is present

@RegressionTest
Scenario Outline: Validate password field
When User enters <username> username 
And User enters <password> password
Then User checks username is present 
And User checks password is present
#Then close browser
Examples:
| username		| password 		|
| "Rana"			|  "abcd"  		|
| "Gaurav"		|  "efg"  		|


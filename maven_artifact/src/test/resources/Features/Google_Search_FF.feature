Feature: Search in Google search engine
As a user you need to navigate it to Google search page

@RegressionTest
Scenario: Validate user search in Google search engine 
Given User needs to be on Google Search Page
When User search string in google page
Then User checks search result

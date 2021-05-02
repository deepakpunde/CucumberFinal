Feature: Twitter Log in functionality

	@Sanity 
  Scenario: Log in button should be disabled when user name and password is blank
  	Given User is on the Twitter Login page
  	Then Log in button should be disabled
  	
  Scenario: Error message when incorrect user name and password entered
  	Given User is on the Twitter Login page
  	When User enters incorrect user name
  	And User enters incorrect Password
  	And User clicks on login button
  	Then Invalid username or password message should be displayed
  	
  Scenario: User can login successfully after entering valid user name and password
    Given User is on the Twitter Login page
  	When User enters valid user name
  	And User enters valid Password
  	And User clicks on login button
  	Then User is redirected to Home page
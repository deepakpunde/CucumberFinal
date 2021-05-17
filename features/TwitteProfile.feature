Feature: Twitter Profile functionality
	
	@Sanity
  Scenario: User can upload profile picture
    Given User is on the Twitter Home page
  	When User selects to edit profile
  	And User should update profile picture
  	And User should update Bio
  	And user should update Location
  	And User should update Website
  	And User saves updated profile 	
    Then User should confirm the updated profile
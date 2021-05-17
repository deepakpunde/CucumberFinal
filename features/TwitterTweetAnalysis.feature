Feature: Twitter feed analysis
	
  Scenario: User can find tweets from past time
    Given User is on the Twitter Home page1
  	When User searches twitter account 	
    Then User can search tweets for account since last 2 hours
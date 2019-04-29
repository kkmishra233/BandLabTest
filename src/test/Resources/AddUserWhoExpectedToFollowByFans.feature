#Author: kkbit233@gmail.com
@test
Feature: I want to add user in domain who expected to be followed by his/her fans
  Scenario: verify user able to signup 
    Given I navigate to bandlab homepage
    When i click on Signup button 
    And fill create user details with "test" , "master23@rediffmail.com" and "Password" 
    And submit Signup form 
    And update username of created user as "kkbit233master23"
    Then logout
    
    
   Scenario:  verify user able to create a shout
	   Given I navigate to bandlab homepage
	   When now navigate to login page and perform login operation with user credentials i.e. "master23@rediffmail.com" and "Password"
	   And create Shout for followers
	   Then logout
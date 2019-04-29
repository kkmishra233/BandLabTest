#Author: kkbit233@gmail.com
@test
Feature: I want to add user in domain who expected to be follow another user and verify he/she see the shout in his/her feed
	Scenario: i want to signup a fan user to follow another user 
	  Given I navigate to bandlab homepage
		When i click on Signup button 
    And fill create user details with "test" , "fan20@rediffmail.com" and "Password" 
    And submit Signup form 
    Then logout

  Scenario: verify user able to follow a user and see the shout in his/her feed 
    Given I navigate to bandlab homepage
    When I login with my credentials i.e. "fan20@rediffmail.com" and "Password"
    And follow user "kkbit233master17"
    Then navigate to feed page and verify the "kkbit233master17" users' shout is available in my feed
    And logout
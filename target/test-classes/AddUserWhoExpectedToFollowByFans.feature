#Author: kkbit233@gmail.com
@test
Feature: I want to add user in domain who expected to be followed by his/her fans
  Scenario: verify user able to signup and able to create a shout
    Given I navigate to bandlab homepage
    When i click on Signup button 
    And fill create user details with "test" , "test1799@rediffmail.com" and "Password" 
    And submit Signup form 
    When now navigate to login page and perform login operation with user credentials i.e. "test1799@rediffmail.com" and "Password"
    And create Shout for followers
    Then logout
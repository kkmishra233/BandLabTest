#Author: kkbit233@gmail.com
@test
Feature: I want to add user in domain who expected to be follow another user and verify he/she see the shout in his/her feed
  Scenario: verify user able to follow a user and he/she see the shout in his/her feed of following user
    Given I navigate to bandlab homepage
    When I login with my credentials i.e. "test1688@rediffmail.com" and "Password"
    And follow user "kkbit233"
    Then navigate to feed page and verify the "kkbit233" users' shout is available in my feed
    And logout
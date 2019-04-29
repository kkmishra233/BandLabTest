$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddUserWhoExpectedToFollowByFans.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: kkbit233@gmail.com"
    }
  ],
  "line": 3,
  "name": "I want to add user in domain who expected to be followed by his/her fans",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-followed-by-his/her-fans",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "verify user able to signup",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-followed-by-his/her-fans;verify-user-able-to-signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to bandlab homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click on Signup button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "fill create user details with \"test\" , \"master12@rediffmail.com\" and \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "submit Signup form",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "update username of created user as \"kkbit233master12\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseMapper.i_navigate_to_bandlab_homepage()"
});
formatter.result({
  "duration": 8341715000,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.i_click_on_Signup_button()"
});
formatter.result({
  "duration": 173830600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 31
    },
    {
      "val": "master12@rediffmail.com",
      "offset": 40
    },
    {
      "val": "Password",
      "offset": 70
    }
  ],
  "location": "BaseMapper.fill_create_user_details_with_and(String,String,String)"
});
formatter.result({
  "duration": 793186600,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.submit_Signup_form()"
});
formatter.result({
  "duration": 6723564400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kkbit233master12",
      "offset": 36
    }
  ],
  "location": "BaseMapper.update_username_of_created_user_as(String)"
});
formatter.result({
  "duration": 25358287900,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.logout()"
});
formatter.result({
  "duration": 5754000,
  "error_message": "java.lang.NullPointerException\r\n\tat BandLab.TestUserShout.BaseFramework.BaseMethods.tearDown(BaseMethods.java:47)\r\n\tat BandLab.TestUserShout.BusinessAction.ActionMethods.userLogOut(ActionMethods.java:204)\r\n\tat BandLab.TestUserShout.BaseMapper.BaseMapper.logout(BaseMapper.java:67)\r\n\tat ✽.Then logout(AddUserWhoExpectedToFollowByFans.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 13,
  "name": "verify user able to create a shout",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-followed-by-his/her-fans;verify-user-able-to-create-a-shout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I navigate to bandlab homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "now navigate to login page and perform login operation with user credentials i.e. \"master12@rediffmail.com\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "create Shout for followers",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseMapper.i_navigate_to_bandlab_homepage()"
});
formatter.result({
  "duration": 5697200700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "master12@rediffmail.com",
      "offset": 83
    },
    {
      "val": "Password",
      "offset": 113
    }
  ],
  "location": "BaseMapper.now_navigate_to_login_page_and_perform_login_operation_with_user_credentials_i_e_and(String,String)"
});
formatter.result({
  "duration": 720179800,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.create_Shout_for_followers()"
});
formatter.result({
  "duration": 20762633500,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.logout()"
});
formatter.result({
  "duration": 3663600,
  "error_message": "java.lang.NullPointerException\r\n\tat BandLab.TestUserShout.BaseFramework.BaseMethods.tearDown(BaseMethods.java:47)\r\n\tat BandLab.TestUserShout.BusinessAction.ActionMethods.userLogOut(ActionMethods.java:204)\r\n\tat BandLab.TestUserShout.BaseMapper.BaseMapper.logout(BaseMapper.java:67)\r\n\tat ✽.Then logout(AddUserWhoExpectedToFollowByFans.feature:17)\r\n",
  "status": "failed"
});
formatter.uri("LogInWithUserAndvalidateShoutInFeedSection.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: kkbit233@gmail.com"
    }
  ],
  "line": 3,
  "name": "I want to add user in domain who expected to be follow another user and verify he/she see the shout in his/her feed",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-follow-another-user-and-verify-he/she-see-the-shout-in-his/her-feed",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "i want to signup a fan user to follow another user",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-follow-another-user-and-verify-he/she-see-the-shout-in-his/her-feed;i-want-to-signup-a-fan-user-to-follow-another-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to bandlab homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "i click on Signup button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "fill create user details with \"test\" , \"fan12@rediffmail.com\" and \"Password\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "submit Signup form",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "BaseMapper.i_navigate_to_bandlab_homepage()"
});
formatter.result({
  "duration": 8826738000,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.i_click_on_Signup_button()"
});
formatter.result({
  "duration": 240569300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 31
    },
    {
      "val": "fan12@rediffmail.com",
      "offset": 40
    },
    {
      "val": "Password",
      "offset": 67
    }
  ],
  "location": "BaseMapper.fill_create_user_details_with_and(String,String,String)"
});
formatter.result({
  "duration": 733892600,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.submit_Signup_form()"
});
formatter.result({
  "duration": 7521063100,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.logout()"
});
formatter.result({
  "duration": 3656618300,
  "error_message": "java.lang.NullPointerException\r\n\tat BandLab.TestUserShout.BaseFramework.BaseMethods.tearDown(BaseMethods.java:47)\r\n\tat BandLab.TestUserShout.BusinessAction.ActionMethods.closeBrowser(ActionMethods.java:190)\r\n\tat BandLab.TestUserShout.BaseMapper.BaseMapper.logout(BaseMapper.java:68)\r\n\tat ✽.Then logout(LogInWithUserAndvalidateShoutInFeedSection.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 11,
  "name": "verify user able to follow a user and see the shout in his/her feed",
  "description": "",
  "id": "i-want-to-add-user-in-domain-who-expected-to-be-follow-another-user-and-verify-he/she-see-the-shout-in-his/her-feed;verify-user-able-to-follow-a-user-and-see-the-shout-in-his/her-feed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I navigate to bandlab homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I login with my credentials i.e. \"fan12@rediffmail.com\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "follow user \"kkbit233master12\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "navigate to feed page and verify the \"kkbit233master12\" users\u0027 shout is available in my feed",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "logout",
  "keyword": "And "
});
formatter.match({
  "location": "BaseMapper.i_navigate_to_bandlab_homepage()"
});
formatter.result({
  "duration": 6612202000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fan12@rediffmail.com",
      "offset": 34
    },
    {
      "val": "Password",
      "offset": 61
    }
  ],
  "location": "BaseMapper.i_login_with_my_credentials_i_e_and(String,String)"
});
formatter.result({
  "duration": 664190000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kkbit233master12",
      "offset": 13
    }
  ],
  "location": "BaseMapper.follow_user(String)"
});
formatter.result({
  "duration": 25900229000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kkbit233master12",
      "offset": 38
    }
  ],
  "location": "BaseMapper.navigate_to_feed_page_and_verify_the_users_shout_is_available_in_my_feed(String)"
});
formatter.result({
  "duration": 61040542400,
  "status": "passed"
});
formatter.match({
  "location": "BaseMapper.logout()"
});
formatter.result({
  "duration": 4529500,
  "error_message": "java.lang.NullPointerException\r\n\tat BandLab.TestUserShout.BaseFramework.BaseMethods.tearDown(BaseMethods.java:47)\r\n\tat BandLab.TestUserShout.BusinessAction.ActionMethods.userLogOut(ActionMethods.java:204)\r\n\tat BandLab.TestUserShout.BaseMapper.BaseMapper.logout(BaseMapper.java:67)\r\n\tat ✽.And logout(LogInWithUserAndvalidateShoutInFeedSection.feature:16)\r\n",
  "status": "failed"
});
});
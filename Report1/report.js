$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/TwitteLogin.feature");
formatter.feature({
  "name": "Twitter Log in functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Log in button should be disabled when user name and password is blank",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Twitter Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Twitter_Steps.User_is_on_the_Twitter_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Log in button should be disabled",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Twitter_Steps.Log_in_button_should_be_disabled()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Error message when incorrect user name and password entered",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Twitter Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Twitter_Steps.User_is_on_the_Twitter_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters incorrect user name",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_enters_incorrect_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters incorrect Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_enters_incorrect_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Invalid username or password message should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Twitter_Steps.invalid_username_or_password_message_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can login successfully after entering valid user name and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Twitter Login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.Twitter_Steps.User_is_on_the_Twitter_Login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid user name",
  "keyword": "When "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_enters_valid_user_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_enters_valid_Password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is redirected to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_is_redirected_to_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:features/TwitteProfile.feature");
formatter.feature({
  "name": "Twitter Log in functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User can upload profile picture",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the Twitter Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_is_on_the_Twitter_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects to edit profile",
  "keyword": "When "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_selects_to_edit_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should update profile picture",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.User_should_update_profile_picture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should update Bio",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_should_update_Bio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should update Location",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_should_update_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should update Website",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_should_update_Website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User saves updated profile",
  "keyword": "And "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_saves_updated_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should confirm the updated profile",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.TwitterProfileSteps.user_should_confirm_the_updated_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\"session[username_or_email]\"]\"}\n  (Session info: chrome\u003d90.0.4430.93)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DPUNDE-WIN3\u0027, ip: \u0027192.168.0.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027x86\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.93, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\dpunde\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:55383}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ecc1cb78dbdeaf36b3b3e449f7f10ad3\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\"session[username_or_email]\"]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat steps.Twitter_Steps.user_enters_valid_user_name(Twitter_Steps.java:80)\r\n\tat ✽.User enters valid user name(file:///D:/Deutsche%20Workspace/cucumber/features/TwitteLogin.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters valid Password",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_enters_valid_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User is redirected to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.Twitter_Steps.user_is_redirected_to_Home_page()"
});
formatter.result({
  "status": "skipped"
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
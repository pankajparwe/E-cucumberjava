$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/BackgroundDemo.feature");
formatter.feature({
  "name": "Check Homepage functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "user is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check logout link",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on welcome link",
  "keyword": "When "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_clicks_on_welcome_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout link is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.logout_link_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "user is logged in",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify quick launch toolbar is present",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks on dashboard link",
  "keyword": "When "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.user_clicks_on_dashboard_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "quick launch toolbar is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepsforbackground.backgrounddemosteps.quick_launch_toolbar_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});
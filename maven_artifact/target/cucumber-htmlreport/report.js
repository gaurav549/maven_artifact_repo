$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Instagram_Login_FF.feature");
formatter.feature({
  "line": 1,
  "name": "Create Account on Instagram",
  "description": "As a user you need to open Instagram Page",
  "id": "create-account-on-instagram",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "Validate password field",
  "description": "",
  "id": "create-account-on-instagram;validate-password-field",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User enters \u003cusername\u003e username",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters \u003cpassword\u003e password",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User checks username is present",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User checks password is present",
  "keyword": "And "
});
formatter.examples({
  "comments": [
    {
      "line": 18,
      "value": "#Then close browser"
    }
  ],
  "line": 19,
  "name": "",
  "description": "",
  "id": "create-account-on-instagram;validate-password-field;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 20,
      "id": "create-account-on-instagram;validate-password-field;;1"
    },
    {
      "cells": [
        "\"Rana\"",
        "\"abcd\""
      ],
      "line": 21,
      "id": "create-account-on-instagram;validate-password-field;;2"
    },
    {
      "cells": [
        "\"Gaurav\"",
        "\"efg\""
      ],
      "line": 22,
      "id": "create-account-on-instagram;validate-password-field;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2660306100,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Common steps for Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User needs to be on Instagram Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Instagram_Login_SD.User_Needs_to_be_on_Instagram_Login_Page()"
});
formatter.result({
  "duration": 2650417900,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Validate password field",
  "description": "",
  "id": "create-account-on-instagram;validate-password-field;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User enters \"Rana\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters \"abcd\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User checks username is present",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User checks password is present",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Rana",
      "offset": 13
    }
  ],
  "location": "Instagram_Login_SD.user_enters_username(String)"
});
formatter.result({
  "duration": 1637336100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd",
      "offset": 13
    }
  ],
  "location": "Instagram_Login_SD.user_enters_password(String)"
});
formatter.result({
  "duration": 1230881500,
  "status": "passed"
});
formatter.match({
  "location": "Instagram_Login_SD.user_checks_username_present()"
});
formatter.result({
  "duration": 1090648700,
  "status": "passed"
});
formatter.match({
  "location": "Instagram_Login_SD.user_checks_input_password()"
});
formatter.result({
  "duration": 1065655100,
  "status": "passed"
});
formatter.after({
  "duration": 664505200,
  "status": "passed"
});
formatter.before({
  "duration": 1634816900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "Common steps for Login Page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User needs to be on Instagram Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Instagram_Login_SD.User_Needs_to_be_on_Instagram_Login_Page()"
});
formatter.result({
  "duration": 1808113600,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Validate password field",
  "description": "",
  "id": "create-account-on-instagram;validate-password-field;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 12,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User enters \"Gaurav\" username",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User enters \"efg\" password",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User checks username is present",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User checks password is present",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Gaurav",
      "offset": 13
    }
  ],
  "location": "Instagram_Login_SD.user_enters_username(String)"
});
formatter.result({
  "duration": 1495372200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "efg",
      "offset": 13
    }
  ],
  "location": "Instagram_Login_SD.user_enters_password(String)"
});
formatter.result({
  "duration": 1193124000,
  "status": "passed"
});
formatter.match({
  "location": "Instagram_Login_SD.user_checks_username_present()"
});
formatter.result({
  "duration": 1070699000,
  "status": "passed"
});
formatter.match({
  "location": "Instagram_Login_SD.user_checks_input_password()"
});
formatter.result({
  "duration": 1040539300,
  "status": "passed"
});
formatter.after({
  "duration": 666667800,
  "status": "passed"
});
});
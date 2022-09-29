$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium_WorkSpace/ParaBankBDDFramework/src/test/java/features/UpdateContact.feature");
formatter.feature({
  "line": 1,
  "name": "ParaBank Update Contact Test",
  "description": "",
  "id": "parabank-update-contact-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "ParaBank Update Contact Test",
  "description": "",
  "id": "parabank-update-contact-test;parabank-update-contact-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "shivam",
        "shivam"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on SignIn",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user goes in UpdateContact Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user update profile details",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "address",
        "city",
        "state",
        "zip",
        "phone"
      ],
      "line": 14
    },
    {
      "cells": [
        "Steve",
        "Maven",
        "Murry St",
        "Niagara",
        "ON",
        "L2g2g5",
        "9824455334"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "logout and close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateContactStepDefination.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 12098086163,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.title_of_login_page_is()"
});
formatter.result({
  "duration": 14951002,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 1211850662,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.user_click_on_SignIn()"
});
formatter.result({
  "duration": 2632493120,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.user_is_on_HomePage()"
});
formatter.result({
  "duration": 12110335,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.user_goes_in_UpdateContact_Page()"
});
formatter.result({
  "duration": 3358674969,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.user_update_profile_details(DataTable)"
});
formatter.result({
  "duration": 3338015074,
  "status": "passed"
});
formatter.match({
  "location": "UpdateContactStepDefination.logout_and_close_browser()"
});
formatter.result({
  "duration": 4168708472,
  "status": "passed"
});
});
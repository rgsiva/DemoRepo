$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TC0001_RG_AS_Telehealth Filter validation based on Telehealth Provider Name Search.feature");
formatter.feature({
  "line": 2,
  "name": "Telehealth Filter Result Validation based on Telehealth Provider Name Search",
  "description": "\nVerify that the Telehealth providers are displayed when the user selects Telehealth \nfilter check box based on Telehealth Provider Name Search",
  "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TeleHealth_Features1"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Verify Telehealth Provider Name Search",
  "description": "",
  "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Completed"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am in the \"\u003cbrand\u003e\" brand login page of \"\u003cuser_Experience\u003e\" user experience in \"\u003cenvironment\u003e\" environment",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with valid username as \"\u003cUserName\u003e\" and valid Password as \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Find a Doctor link and select \"\u003cprovider_Search_Option\u003e\" Icon",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be landed on the HSQ Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the title of the HSQ Home page as \"\u003cHSQ_HomePage_Title\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Verify the location is defaulted to \"\u003cdefault_Address\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I Update the address in choose your search location as \"\u003cvalid_Address\u003e\" if it is found as invalid",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \"\u003csearch_By\u003e\" option",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the Telehealth provider name as \"\u003ctelehealth_Provider_Name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the Telehealth filter",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the searched provider should be displayed with the Telehealth text \"\u003ctelehealth_Text\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I close the HSQ tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Navigate back to Regence Member Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#   And I Close the Medical Provider popup Window"
    }
  ],
  "line": 23,
  "name": "I Click on SignOut hyperlink",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#   And I Click on the Close option in the You have successfully signed out pop up window"
    }
  ],
  "line": 25,
  "name": "I Closed the browser window",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;",
  "rows": [
    {
      "cells": [
        "brand",
        "user_Experience",
        "environment",
        "UserName",
        "password",
        "provider_Search_Option",
        "HSQ_HomePage_Title",
        "default_Address",
        "valid_Address",
        "search_By",
        "telehealth_Provider_Name",
        "telehealth_Text"
      ],
      "line": 28,
      "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;;1"
    },
    {
      "cells": [
        "Regence",
        "authenticated",
        "QA1",
        "TESTBLUWANWFFT",
        "password$1",
        "medicalProvider",
        "Search homepage",
        "1 TEST DEMO ST, SEATTL...",
        "Salt Lake City, UT",
        "search_All",
        "Scott, David W, LMFT",
        "Telehealth"
      ],
      "line": 29,
      "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;;2"
    },
    {
      "cells": [
        "Asuris",
        "authenticated",
        "QA1",
        "TestASURASTest3",
        "password$1",
        "medicalProvider",
        "Search homepage",
        "10 BROWN ST, SPOKANE, ...",
        "SPOKANE, WA 99201",
        "search_All",
        "Fury, Beth A, LMHC",
        "Telehealth"
      ],
      "line": 30,
      "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13244628013,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify Telehealth Provider Name Search",
  "description": "",
  "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Completed"
    },
    {
      "line": 1,
      "name": "@TeleHealth_Features1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am in the \"Regence\" brand login page of \"authenticated\" user experience in \"QA1\" environment",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with valid username as \"TESTBLUWANWFFT\" and valid Password as \"password$1\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Find a Doctor link and select \"medicalProvider\" Icon",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be landed on the HSQ Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the title of the HSQ Home page as \"Search homepage\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Verify the location is defaulted to \"1 TEST DEMO ST, SEATTL...\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I Update the address in choose your search location as \"Salt Lake City, UT\" if it is found as invalid",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \"search_All\" option",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the Telehealth provider name as \"Scott, David W, LMFT\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the Telehealth filter",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the searched provider should be displayed with the Telehealth text \"Telehealth\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I close the HSQ tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Navigate back to Regence Member Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#   And I Close the Medical Provider popup Window"
    }
  ],
  "line": 23,
  "name": "I Click on SignOut hyperlink",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#   And I Click on the Close option in the You have successfully signed out pop up window"
    }
  ],
  "line": 25,
  "name": "I Closed the browser window",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Regence",
      "offset": 13
    },
    {
      "val": "authenticated",
      "offset": 43
    },
    {
      "val": "QA1",
      "offset": 78
    }
  ],
  "location": "GeneralStepDefs.i_am_in_the_something_brand_login_page_of_something_user_experience_in_something_environment(String,String,String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 30551596972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TESTBLUWANWFFT",
      "offset": 32
    },
    {
      "val": "password$1",
      "offset": 71
    }
  ],
  "location": "GeneralStepDefs.i_login_with_valid_username_as_something_and_valid_password_as_something(String,String)"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 1823337523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "medicalProvider",
      "offset": 42
    }
  ],
  "location": "GeneralStepDefs.i_click_on_find_a_doctor_link_and_select_something_icon(String)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 17161668969,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page()"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 5084763582,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search homepage",
      "offset": 42
    }
  ],
  "location": "GeneralStepDefs.verify_the_title_of_the_hsq_home_page_as_something(String)"
});
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 3745642780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 TEST DEMO ST, SEATTL...",
      "offset": 39
    }
  ],
  "location": "GeneralStepDefs.i_verify_the_location_is_defaulted_to_something(String)"
});
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 412731574,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salt Lake City, UT",
      "offset": 56
    }
  ],
  "location": "GeneralStepDefs.i_update_the_address_in_choose_your_search_location_as_something_if_it_is_found_as_invalid(String)"
});
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 7389936163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search_All",
      "offset": 12
    }
  ],
  "location": "GeneralStepDefs.i_click_on_something_option(String)"
});
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "duration": 4078872786,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Scott, David W, LMFT",
      "offset": 41
    }
  ],
  "location": "GeneralStepDefs.i_enter_the_Telehealth_provider_name_as(String)"
});
formatter.embedding("image/png", "embedded8.png");
formatter.result({
  "duration": 1678873432,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_select_the_Telehealth_filter()"
});
formatter.embedding("image/png", "embedded9.png");
formatter.result({
  "duration": 4243661093,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Telehealth",
      "offset": 68
    }
  ],
  "location": "GeneralStepDefs.the_searched_provider_should_be_displayed_with_the_telehealth_text_something(String)"
});
formatter.embedding("image/png", "embedded10.png");
formatter.result({
  "duration": 3559750569,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_close_the_hsq_tab()"
});
formatter.result({
  "duration": 431358626,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_navigate_back_to_regence_member_dashboard_page()"
});
formatter.embedding("image/png", "embedded11.png");
formatter.result({
  "duration": 569543469,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_click_on_signout_hyperlink()"
});
formatter.embedding("image/png", "embedded12.png");
formatter.result({
  "duration": 9377634173,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_Closed_the_browser_window()"
});
formatter.result({
  "duration": 3905925097,
  "status": "passed"
});
formatter.after({
  "duration": 1429084,
  "status": "passed"
});
formatter.before({
  "duration": 14503151969,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Verify Telehealth Provider Name Search",
  "description": "",
  "id": "telehealth-filter-result-validation-based-on-telehealth-provider-name-search;verify-telehealth-provider-name-search;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@Completed"
    },
    {
      "line": 1,
      "name": "@TeleHealth_Features1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am in the \"Asuris\" brand login page of \"authenticated\" user experience in \"QA1\" environment",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I login with valid username as \"TestASURASTest3\" and valid Password as \"password$1\"",
  "matchedColumns": [
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I click on Find a Doctor link and select \"medicalProvider\" Icon",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I should be landed on the HSQ Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verify the title of the HSQ Home page as \"Search homepage\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I Verify the location is defaulted to \"10 BROWN ST, SPOKANE, ...\"",
  "matchedColumns": [
    7
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I Update the address in choose your search location as \"SPOKANE, WA 99201\" if it is found as invalid",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on \"search_All\" option",
  "matchedColumns": [
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter the Telehealth provider name as \"Fury, Beth A, LMHC\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select the Telehealth filter",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the searched provider should be displayed with the Telehealth text \"Telehealth\"",
  "matchedColumns": [
    11
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I close the HSQ tab",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I Navigate back to Regence Member Dashboard Page",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 22,
      "value": "#   And I Close the Medical Provider popup Window"
    }
  ],
  "line": 23,
  "name": "I Click on SignOut hyperlink",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 24,
      "value": "#   And I Click on the Close option in the You have successfully signed out pop up window"
    }
  ],
  "line": 25,
  "name": "I Closed the browser window",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Asuris",
      "offset": 13
    },
    {
      "val": "authenticated",
      "offset": 42
    },
    {
      "val": "QA1",
      "offset": 77
    }
  ],
  "location": "GeneralStepDefs.i_am_in_the_something_brand_login_page_of_something_user_experience_in_something_environment(String,String,String)"
});
formatter.embedding("image/png", "embedded13.png");
formatter.result({
  "duration": 9536665800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestASURASTest3",
      "offset": 32
    },
    {
      "val": "password$1",
      "offset": 72
    }
  ],
  "location": "GeneralStepDefs.i_login_with_valid_username_as_something_and_valid_password_as_something(String,String)"
});
formatter.embedding("image/png", "embedded14.png");
formatter.result({
  "duration": 2163193353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "medicalProvider",
      "offset": 42
    }
  ],
  "location": "GeneralStepDefs.i_click_on_find_a_doctor_link_and_select_something_icon(String)"
});
formatter.embedding("image/png", "embedded15.png");
formatter.result({
  "duration": 14473188653,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page()"
});
formatter.embedding("image/png", "embedded16.png");
formatter.result({
  "duration": 8631341853,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search homepage",
      "offset": 42
    }
  ],
  "location": "GeneralStepDefs.verify_the_title_of_the_hsq_home_page_as_something(String)"
});
formatter.embedding("image/png", "embedded17.png");
formatter.result({
  "duration": 4012154774,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 BROWN ST, SPOKANE, ...",
      "offset": 39
    }
  ],
  "location": "GeneralStepDefs.i_verify_the_location_is_defaulted_to_something(String)"
});
formatter.embedding("image/png", "embedded18.png");
formatter.result({
  "duration": 675431858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SPOKANE, WA 99201",
      "offset": 56
    }
  ],
  "location": "GeneralStepDefs.i_update_the_address_in_choose_your_search_location_as_something_if_it_is_found_as_invalid(String)"
});
formatter.embedding("image/png", "embedded19.png");
formatter.result({
  "duration": 8559583752,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "search_All",
      "offset": 12
    }
  ],
  "location": "GeneralStepDefs.i_click_on_something_option(String)"
});
formatter.embedding("image/png", "embedded20.png");
formatter.result({
  "duration": 3881179261,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fury, Beth A, LMHC",
      "offset": 41
    }
  ],
  "location": "GeneralStepDefs.i_enter_the_Telehealth_provider_name_as(String)"
});
formatter.embedding("image/png", "embedded21.png");
formatter.result({
  "duration": 959844092,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_select_the_Telehealth_filter()"
});
formatter.embedding("image/png", "embedded22.png");
formatter.result({
  "duration": 11358408961,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Telehealth",
      "offset": 68
    }
  ],
  "location": "GeneralStepDefs.the_searched_provider_should_be_displayed_with_the_telehealth_text_something(String)"
});
formatter.embedding("image/png", "embedded23.png");
formatter.result({
  "duration": 3655068883,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_close_the_hsq_tab()"
});
formatter.result({
  "duration": 485934380,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_navigate_back_to_regence_member_dashboard_page()"
});
formatter.embedding("image/png", "embedded24.png");
formatter.result({
  "duration": 580867095,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_click_on_signout_hyperlink()"
});
formatter.embedding("image/png", "embedded25.png");
formatter.result({
  "duration": 13868967229,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_Closed_the_browser_window()"
});
formatter.result({
  "duration": 1567674555,
  "status": "passed"
});
formatter.after({
  "duration": 1363054,
  "status": "passed"
});
});
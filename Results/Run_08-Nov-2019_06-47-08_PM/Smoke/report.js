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
        "QA3",
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
        "QA3",
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
  "duration": 6196478851,
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
  "name": "I am in the \"Regence\" brand login page of \"authenticated\" user experience in \"QA3\" environment",
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
      "val": "QA3",
      "offset": 78
    }
  ],
  "location": "GeneralStepDefs.i_am_in_the_something_brand_login_page_of_something_user_experience_in_something_environment(String,String,String)"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 9366079394,
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
  "duration": 1436810391,
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
  "duration": 18438733119,
  "status": "passed"
});
formatter.match({
  "location": "GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page()"
});
formatter.result({
  "duration": 23078511607,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Proxy element for: DefaultElementLocator \u0027By.xpath: //h2[contains(text(),\u0027Doctors by name\u0027)]\u0027 (tried for 5 second(s) with 500 milliseconds interval)\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\n\tat com.cucumbercraft.pages.HSQSearchHomePage.locateDoctorsByNameElement(HSQSearchHomePage.java:135)\n\tat com.cucumbercraft.stepdefinitions.GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page(GeneralStepDefs.java:432)\n\tat ✽.Then I should be landed on the HSQ Home page(TC0001_RG_AS_Telehealth Filter validation based on Telehealth Provider Name Search.feature:12)\nCaused by: org.openqa.selenium.NoSuchElementException: Unable to locate element: //h2[contains(text(),\u0027Doctors by name\u0027)]\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027TRG525170.hsd1.or.comcast.net\u0027, ip: \u0027fe80:0:0:0:87f:749c:cd7c:3a9a%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 70.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191030021342, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 47921, moz:profile: /var/folders/_0/k1nlbhv51fj..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 17.7.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3b1fa721-1f5d-cb48-b776-c3e34996fc1f\n*** Element info: {Using\u003dxpath, value\u003d//h2[contains(text(),\u0027Doctors by name\u0027)]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:419)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy28.isDisplayed(Unknown Source)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:315)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$100(ExpectedConditions.java:44)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:301)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:298)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:248)\n\tat com.cucumbercraft.pages.HSQSearchHomePage.locateDoctorsByNameElement(HSQSearchHomePage.java:135)\n\tat com.cucumbercraft.stepdefinitions.GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page(GeneralStepDefs.java:432)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:108)\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:661)\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:869)\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1193)\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:126)\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\n\tat org.testng.TestRunner.privateRun(TestRunner.java:744)\n\tat org.testng.TestRunner.run(TestRunner.java:602)\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:380)\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:39)\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:414)\n\tat org.testng.internal.thread.ThreadUtil$1.call(ThreadUtil.java:52)\n\tat java.util.concurrent.FutureTask.run(FutureTask.java:266)\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\n\tat java.lang.Thread.run(Thread.java:748)\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_select_the_Telehealth_filter()"
});
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_close_the_hsq_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_navigate_back_to_regence_member_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_click_on_signout_hyperlink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_Closed_the_browser_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 2771479787,
  "status": "passed"
});
formatter.before({
  "duration": 3627461459,
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
  "name": "I am in the \"Asuris\" brand login page of \"authenticated\" user experience in \"QA3\" environment",
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
      "val": "QA3",
      "offset": 77
    }
  ],
  "location": "GeneralStepDefs.i_am_in_the_something_brand_login_page_of_something_user_experience_in_something_environment(String,String,String)"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 8232476280,
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
formatter.result({
  "duration": 10675729807,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[FirefoxDriver: firefox on MAC (1956a3d7-7118-0c44-b10e-a19d006aea3f)] -\u003e xpath: //input[@placeholder\u003d\u0027User name\u0027]] (tried for 10 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027TRG525170.hsd1.or.comcast.net\u0027, ip: \u0027fe80:0:0:0:87f:749c:cd7c:3a9a%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_161\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 70.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20191030021342, moz:geckodriverVersion: 0.24.0, moz:headless: false, moz:processID: 47979, moz:profile: /var/folders/_0/k1nlbhv51fj..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: MAC, platformName: MAC, platformVersion: 17.7.0, rotatable: false, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 1956a3d7-7118-0c44-b10e-a19d006aea3f\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:81)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:271)\n\tat com.cucumbercraft.pages.RegenceAsurisBSHHomePage.clearUserName(RegenceAsurisBSHHomePage.java:191)\n\tat com.cucumbercraft.stepdefinitions.GeneralStepDefs.login(GeneralStepDefs.java:369)\n\tat com.cucumbercraft.stepdefinitions.GeneralStepDefs.i_login_with_valid_username_as_something_and_valid_password_as_something(GeneralStepDefs.java:350)\n\tat ✽.When I login with valid username as \"TestASURASTest3\" and valid Password as \"password$1\"(TC0001_RG_AS_Telehealth Filter validation based on Telehealth Provider Name Search.feature:10)\n",
  "status": "failed"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_should_be_landed_on_the_HSQ_Home_page()"
});
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_select_the_Telehealth_filter()"
});
formatter.result({
  "status": "skipped"
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
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_close_the_hsq_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_navigate_back_to_regence_member_dashboard_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_click_on_signout_hyperlink()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "GeneralStepDefs.i_Closed_the_browser_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1671225960,
  "status": "passed"
});
});
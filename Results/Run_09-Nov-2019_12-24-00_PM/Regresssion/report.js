$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookFlightTickets.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@Feature1"
    }
  ],
  "line": 2,
  "name": "Book flight tickets",
  "description": "As a user with valid credentials,\r\nI want to be able to search for flight tickets between a given source and destination,\r\nselect from the available options presented, and book the tickets accordingly",
  "id": "book-flight-tickets",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4489911722,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I login using the valid username mercury and the valid password mercury",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 33
    },
    {
      "val": "mercury",
      "offset": 64
    }
  ],
  "location": "LoginStepDefs.i_login_using_valid_username_valid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 12,
  "name": "Find and book flight tickets",
  "description": "",
  "id": "book-flight-tickets;find-and-book-flight-tickets",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@completed"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I search for flights using the following criteria:",
  "rows": [
    {
      "cells": [
        "FromPort",
        "FromMonth",
        "FromDate",
        "ToPort",
        "ToMonth",
        "ToDate",
        "Airline",
        "PassengerCount"
      ],
      "line": 14
    },
    {
      "cells": [
        "London",
        "July",
        "23",
        "Paris",
        "July",
        "29",
        "Unified Airlines",
        "2"
      ],
      "line": 15
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I select the first available flight",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I book the tickets using the following passenger details:",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName"
      ],
      "line": 18
    },
    {
      "cells": [
        "Cts",
        "CoE"
      ],
      "line": 19
    },
    {
      "cells": [
        "QA",
        "Automation"
      ],
      "line": 20
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I use the following credit card details:",
  "rows": [
    {
      "cells": [
        "CreditCardType",
        "CreditCardNumber"
      ],
      "line": 22
    },
    {
      "cells": [
        "MasterCard",
        "1234567890"
      ],
      "line": 23
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I should get a booking confirmation with a confirmation number",
  "keyword": "Then "
});
formatter.match({
  "location": "BookFlightTicketsStepDefs.i_search_for_flights(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookFlightTicketsStepDefs.i_select_first_available_flight()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookFlightTicketsStepDefs.i_book_tickets(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookFlightTicketsStepDefs.i_use_credit_card(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BookFlightTicketsStepDefs.i_should_get_booking_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 163557436,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "As a user, I want to be able to login to the application\r\nwhen I present valid credentials",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1925646601,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 9,
  "name": "Login with invalid username and invalid password",
  "description": "",
  "id": "login;login-with-invalid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@completed"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I login using the invalid username abc and the invalid password xyz",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "The application should stay on the login page, and not log me in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 35
    },
    {
      "val": "xyz",
      "offset": 64
    }
  ],
  "location": "LoginStepDefs.i_login_using_invalid_username_invalid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.application_should_stay_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 248650278,
  "status": "passed"
});
formatter.before({
  "duration": 1967938048,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "Login with valid username and invalid password",
  "description": "",
  "id": "login;login-with-valid-username-and-invalid-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@completed1"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I login using the valid username mercury and the invalid password xyz",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "The application should stay on the login page, and not log me in",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 33
    },
    {
      "val": "xyz",
      "offset": 66
    }
  ],
  "location": "LoginStepDefs.i_login_using_valid_username_invalid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.application_should_stay_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 141841322,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "Login with valid username and valid password",
  "description": "",
  "id": "login;login-with-valid-username-and-valid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@completed1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I login using the valid username \u003cUsername\u003e and the valid password \u003cPassword\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The application should log me in and navigate to the Flight Finder page",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "login;login-with-valid-username-and-valid-password;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 24,
      "id": "login;login-with-valid-username-and-valid-password;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 25,
      "id": "login;login-with-valid-username-and-valid-password;;2"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 26,
      "id": "login;login-with-valid-username-and-valid-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1800848748,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 25,
  "name": "Login with valid username and valid password",
  "description": "",
  "id": "login;login-with-valid-username-and-valid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@completed1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I login using the valid username mercury and the valid password mercury",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The application should log me in and navigate to the Flight Finder page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 33
    },
    {
      "val": "mercury",
      "offset": 64
    }
  ],
  "location": "LoginStepDefs.i_login_using_valid_username_valid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.application_should_login_navigate_to_FlightFinder_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 153357323,
  "status": "passed"
});
formatter.before({
  "duration": 1951492996,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 26,
  "name": "Login with valid username and valid password",
  "description": "",
  "id": "login;login-with-valid-username-and-valid-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@completed1"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I login using the valid username mercury and the valid password mercury",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "The application should log me in and navigate to the Flight Finder page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 33
    },
    {
      "val": "mercury",
      "offset": 64
    }
  ],
  "location": "LoginStepDefs.i_login_using_valid_username_valid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.application_should_login_navigate_to_FlightFinder_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 146750255,
  "status": "passed"
});
formatter.uri("RegisterNewUser.feature");
formatter.feature({
  "line": 1,
  "name": "Register new user",
  "description": "As a new user to the application, I want to be able to register myself\r\nso that I can login and use the application further",
  "id": "register-new-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1956137894,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Register new user and login using the newly registered credentials",
  "description": "",
  "id": "register-new-user;register-new-user-and-login-using-the-newly-registered-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@completed"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in the login page of the application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I register a new user with the following details:",
  "rows": [
    {
      "cells": [
        "Username",
        "cts"
      ],
      "line": 9
    },
    {
      "cells": [
        "Password",
        "password-1"
      ],
      "line": 10
    },
    {
      "cells": [
        "FirstName",
        "Cognizant"
      ],
      "line": 11
    },
    {
      "cells": [
        "LastName",
        "John"
      ],
      "line": 12
    },
    {
      "cells": [
        "Phone",
        "1234567890"
      ],
      "line": 13
    },
    {
      "cells": [
        "Email",
        "Cognizant@cts.com"
      ],
      "line": 14
    },
    {
      "cells": [
        "Address",
        "90 Matawan Road"
      ],
      "line": 15
    },
    {
      "cells": [
        "City",
        "Matawan"
      ],
      "line": 16
    },
    {
      "cells": [
        "State",
        "New Jersey"
      ],
      "line": 17
    },
    {
      "cells": [
        "PostalCode",
        "07747"
      ],
      "line": 18
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I should get a confirmation on successful registration",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I click on the sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I login using the valid username icims and the valid password password-1",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "The application should log me in and navigate to the Flight Finder page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "RegisterUserStepDefs.registerUser(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegisterUserStepDefs.i_should_get_registration_confirmation()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.i_click_on_signin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "icims",
      "offset": 33
    },
    {
      "val": "password-1",
      "offset": 62
    }
  ],
  "location": "LoginStepDefs.i_login_using_valid_username_valid_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefs.application_should_login_navigate_to_FlightFinder_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 126364769,
  "status": "passed"
});
});
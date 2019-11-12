@TeleHealth_Features1
Feature: Telehealth Filter Result Validation based on Telehealth Provider Name Search
  
  Verify that the Telehealth providers are displayed when the user selects Telehealth 
  filter check box based on Telehealth Provider Name Search

  @Completed
  Scenario Outline: Verify Telehealth Provider Name Search
    Given I am in the "<brand>" brand login page of "<user_Experience>" user experience in "<environment>" environment
    When I login with valid username as "<UserName>" and valid Password as "<password>"
    And I click on Find a Doctor link and select "<provider_Search_Option>" Icon
    Then I should be landed on the HSQ Home page
    And verify the title of the HSQ Home page as "<HSQ_HomePage_Title>"
    Then I Verify the location is defaulted to "<default_Address>"
    And I Update the address in choose your search location as "<valid_Address>" if it is found as invalid
    And I click on "<search_By>" option
    And I enter the Telehealth provider name as "<telehealth_Provider_Name>"
    And I select the Telehealth filter
    Then the searched provider should be displayed with the Telehealth text "<telehealth_Text>"
    And I close the HSQ tab
    And I Navigate back to Regence Member Dashboard Page
    #   And I Close the Medical Provider popup Window
    And I Click on SignOut hyperlink
    #   And I Click on the Close option in the You have successfully signed out pop up window
    And I Closed the browser window

    Examples: 
      | brand   | user_Experience | environment | UserName        | password   | provider_Search_Option | HSQ_HomePage_Title | default_Address           | valid_Address      | search_By  | telehealth_Provider_Name | telehealth_Text |
      | Regence | authenticated   | QA1         | TESTBLUWANWFFT  | password$1 | medicalProvider        | Search homepage    | 1 TEST DEMO ST, SEATTL... | Salt Lake City, UT | search_All | Scott, David W, LMFT     | Telehealth      |
      | Asuris  | authenticated   | QA1         | TestASURASTest3 | password$1 | medicalProvider        | Search homepage    | 10 BROWN ST, SPOKANE, ... | SPOKANE, WA 99201  | search_All | Fury, Beth A, LMHC       | Telehealth      |
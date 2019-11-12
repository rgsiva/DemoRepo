@TeleHealth_Features
Feature: Telehealth Filter Result Validation based on Telehealth Service Search
  
  Verify that the Telehealth providers are displayed when the user select Telehealth 
  filter check box based on Telehealth Service Search

  @Completed
  Scenario Outline: Verify Telehealth Service Search
    Given I am in the "<brand>" brand login page of "<user_Experience>" user experience in "<environment>" environment
    When I login with valid username as "<UserName>" and valid Password as "<password>"
    And I click on Find a Doctor link and select "<provider_Search_Option>" Icon
    Then I should be landed on the HSQ Home page
    And verify the title of the HSQ Home page as "<HSQ_HomePage_Title>"
    Then I Verify the location is defaulted to "<default_Address>"
    And I Update the address in choose your search location as "<valid_Address>" if it is found as invalid
    And I click on "<search_By>" option
    And I enter the Telehealth service name as "<telehealth_Service_Name>"
    And I select the Telehealth filter
    Then the list of providers should be displayed with the text "<telehealth_Text>"
    And I close the HSQ tab
    And I Navigate back to Regence Member Dashboard Page
#   And I Close the Medical Provider popup Window
    And I Click on SignOut hyperlink
    And I Closed the browser window

    Examples: 
      | brand | user_Experience | environment | UserName     | password   | provider_Search_Option | HSQ_HomePage_Title | default_Address           | valid_Address                  | search_By  | telehealth_Service_Name | telehealth_Text |
      | BSH   | authenticated   | QA3         | TESTBSHWAHSA | password$1 | medicalProvider        | Search homepage    | 10 BROWN ST, SEATTLE, ... | 10 BROWN ST, SEATTLE, WA 98133 | search_All | Acupuncture             | Telehealth      |

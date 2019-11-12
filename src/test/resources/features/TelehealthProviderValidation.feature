@Feature1
Feature: Telehealth Filter Result Validation based on Telehealth Service Search

Verify that the Telehealth providers are displayed when the user selects Telehealth 
filter check box based on Telehealth Service search

  Background: 
    Given I am in the "<brand>" brand login page of "<user_Experience>" user experience in "<environment>" environment
     When I login with valid the username as "<UserName>" and Password as "<password>"
      And I click on Find a Doctor link and select "<providerOption>" Icon
     Then I should be landed on the HSQ Home page
     Then I Verify location is defaulted to "<default_Address>"
      And I Update the address in choose your search location to "<valid_Address>" if it is found invalid
      And I click on "<search_By>" button
  
  @Completed
  Scenario Outline: Verify Telehealth Provider Search based on Telehealth Service Search
      And I click on "<search_By>" button
      And I enter the "<telehealth_Service_Name>"
      And I select the Telehealth filter
     Then the provider should be displayed with the text "<telehealth_Text>"
    Examples: 
  
      | Brand   | user_Experience | environment | UserName       | password   | providerOption  | default_Address           | valid_Address      | search_By  | telehealth_Service_Name | telehealth_Text                                                               | 
      | Regence | authenticated   | QA1         | TESTBLUWANWFFT | password$1 | medicalProvider | 1 TEST DEMO ST, SEATTL... | Salt Lake City, UT | search_All | headache                | Talk to a doctor. Telehealth offers confidential phone or video appointments. | 
      | Asuris  | authenticated   | QA1         | TESTSBASHSQ50  | password$1 | medicalProvider | TEST, QUINCY, WA 98848    | QUINCY, WA         | search_All | headache                | Talk to a doctor. Telehealth offers confidential phone or video appointments. | 
  
  

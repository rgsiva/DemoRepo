@Feature1
Feature: Telehealth Provider Validation
  
  Verify that the Telehealth providers are displayed when the user selects Telehealth 
  filter check box for a telehealth provider name, Service having telehealth 
  providers and Specialty having telehealth providers in Psearch results page

  Background: 
    Given I am in the Regence brand QA1 login page of the application

  #@Completed
  Scenario: Verify Telehealth Provider Search
    When I login with valid the username as "TESTBLUWANWFFT" and Password as "password$1"
    And I click on Find a Doctor link and select Medical Provider Icon
    Then I should be landed on the HSQ Home page
    Then I Verify location is defaulted to member's address
    And I Update the address in choose your search location to valid address if it is found invalid
    And I click on Search All button
    And I enter the Telehealth provider name as "Scott, David W, LMFT"
    And I select the Telehealth filter
    Then the provider should be displayed with the text "Talk to a doctor. Telehealth offers confidential phone or video appointments."

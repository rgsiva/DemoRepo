@HSQ_Public_Generic_Public_User_Search_For_Survey_Question
Feature: HSQ Generic Public User submitting feedback for Did you find what you are looking for question and submitting yes for the survey
  
  Verify that Thanks for your feedback text is displayed when the public user clicks on Yes for Did you find what you are looking for survey question 
  in the HSQ Provider Search Result page while searching with the Keyword ear nose throat

  @Completed
  Scenario Outline: Verify Thanks for your feedback text
    Given I live in the "<city>" and when I access the "<brand>" brand of "<user_Experience>" user experience in "<environment>" environment
    When I click on change hyperlink
    Then I should be able to select "<Change_Site>" and enter the zip code as "<zip_Code>" and hit the Update button
    Then I should be landed on "<site_Name>" Site
    And when I click on Find a doctor hyperlink
    Then I should be landed on the Finding doctors page
    And when I scroll down and click the Search now hyperlink under the For guests section
    Then I should be taken to the HSQ landing page that has the title as "<HSQ_HomePage_Title>"
    And when I click on Choose a network button
    Then I should be taken to the Find your network by name section
    And when I click on Browse a list of networks hyperlink
    Then I should be taken to the Browse all networks section
    And when I scroll down to the bottom of the page
    Then I should find the "<Network_Name>" option
    And when I select the "<Network_Name>" then I should be taken to the Confirm selection section
    And when I hit the Confirm selection button
    Then I should be taken to the HSQ Search homepage with the option If you use All Networks the providers you find may not be in your network presented with Ok I understand option
    And I should be able to select Ok I understand link
    And when I click on All categories option
    Then I should be presented with an option to search for doctors, hospitals and clinic by name, condition or specialty
    And when I enter the "<search_Text>" and hit enter
    Then I should be able to see the text "<survey_Text>" with yes and no options
    And When I hit the "<selection_Survey>" option
    Then I should be able to see the survey confirmation "<feedback_Confirmation>"
    And I should be able to close the HSQ tab
    And also I should be able to go back to the "<brand>" public home page
    And I should be able to close the "<brand>" browser window

    Examples: 
      | city       | brand   | user_Experience | environment | Change_Site            | zip_Code | site_Name                      | HSQ_HomePage_Title | Network_Name | search_Text     | survey_Text                             | selection_Survey | feedback_Confirmation    | 
      | Oregon     | Regence | public          | QA1         | Individuals & families |    97006 | BlueCross BlueShield of Oregon | Search for care    | All Networks | ear nose throat | Did you find what you were looking for? | Yes              | Thanks for your feedback!|
    # | Washington | Asuris  | public          | QA1         | Individuals & families |    99201 | Asuris Northwest Health        | Search for care    | All Networks | ear nose throat | Did you find what you were looking for? | Yes              | Thanks for your feedback!|
    # | Oregon     | BSH     | public          | QA1         | Individuals & families |    83617 | Bridespan                      | Search for care    | All Networks | ear nose throat | Did you find what you were looking for? | Yes              | Thanks for your feedback!|

package com.cucumbercraft.stepdefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumbercraft.framework.DriverFactory;
import com.cucumbercraft.framework.DriverManager;
import com.cucumbercraft.framework.Util;
import com.cucumbercraft.framework.WebDriverUtil;
import com.cucumbercraft.pages.HSQSearchHomePage;
import com.cucumbercraft.pages.HSQSearchResultPage;
import com.cucumbercraft.pages.RegenceAsurisBSHFindingDoctorsPage;
import com.cucumbercraft.pages.RegenceAsurisBSHHomePage;
import com.cucumbercraft.stepdefinitions.MasterStepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class HSQ_Public_Generic_Public_Search_Survery_Selection_Yes extends MasterStepDefs {

	static Logger log = Logger.getLogger(HSQ_Public_Generic_Public_Search_Survery_Selection_Yes.class);

	WebDriver driver = DriverManager.getWebDriver();
	WebDriver regenceWindowDriver = null;
	WebDriver hsqWindowDriver = null;
	WebDriver asurisWindowDriver = null;
	WebDriver bshWindowDriver = null;
	WebDriver surveyWindowDriver = null;
	WebDriverWait Wait = null;
	WebDriverUtil webDriverUtil = null;
	String hsqWindowTitle = "Search homepage";
	private static final String regenceFindingDoctorsWindowTitle = "Finding doctors - Regence.com";
	private static final String asurisFindingDoctorsWindowTitle = "Help in finding doctors in network - Asuris.com";
	private static final String bshFindingDoctorsWindowTitle = "Finding doctors | BridgeSpan Health - BridgeSpanHealth.com";

//	TiesPages tiespage = null;

	private static final String expectedRegenceHomePageTitle1 = "Regence health insurance - Regence.com";
	private static final String expectedRegenceHomePageTitle2 = "Regence health insurance";

	private static final String expectedAsurisHomePageTitle1 = "Asuris Northwest Health - Asuris.com";
	private static final String expectedAsurisHomePageTitle2 = "Asuris Northwest Health";

	private static final String expectedBridgeSpanHealthHomePageTitle1 = "BridgeSpan Health - Bridgespanhealth.com";
	private static final String expectedBridgeSpanHealthHomePageTitle2 = "BridgeSpan Health";

	@Given("^I live in the \"([^\"]*)\" and when I access the \"([^\"]*)\" brand of \"([^\"]*)\" user experience in \"([^\"]*)\" environment$")
	public void i_live_in_the_something_and_when_i_access_the_something_brand_of_something_user_experience_in_something_environment(
			String city, String brand, String userexperience, String environment) throws Throwable {

		if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("Regence")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("RegenceQA1ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedRegenceHomePageTitle1)
					|| driver.getTitle().contains(expectedRegenceHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("Regence")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("RegenceQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedRegenceHomePageTitle1)
					|| driver.getTitle().contains(expectedRegenceHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("Regence")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("RegenceQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedRegenceHomePageTitle1)
					|| driver.getTitle().contains(expectedRegenceHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Washington") && brand.equalsIgnoreCase("Asuris")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("AsurisQA1ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedAsurisHomePageTitle1)
					|| driver.getTitle().contains(expectedAsurisHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Washington") && brand.equalsIgnoreCase("Asuris")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("AsurisQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedAsurisHomePageTitle1)
					|| driver.getTitle().contains(expectedAsurisHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Washington") && brand.equalsIgnoreCase("Asuris")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("AsurisQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedAsurisHomePageTitle1)
					|| driver.getTitle().contains(expectedAsurisHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("BSH")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA1")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("BSHQA1ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle1)
					|| driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("BSH")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA2")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("BSHQA2ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle1)
					|| driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		} else if (city.equalsIgnoreCase("Oregon") && brand.equalsIgnoreCase("BSH")
				&& userexperience.equalsIgnoreCase("public") && environment.equalsIgnoreCase("QA3")) {

			log.info("Launching " + brand + " " + city + " " + userexperience + " " + environment + " URL...");

			driver.get(properties.getProperty("BSHQA3ApplicationURL"));

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			assertTrue(driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle1)
					|| driver.getTitle().contains(expectedBridgeSpanHealthHomePageTitle2));

			log.info("Launched " + brand + " " + city + " " + userexperience + " " + environment
					+ " URL Successfully...");

		}

	}

	@When("^I click on change hyperlink$")
	public void i_click_on_change_hyperlink() throws Throwable {

		RegenceAsurisBSHHomePage regenceAsurisBSHHomePage = new RegenceAsurisBSHHomePage(driver);

		regenceAsurisBSHHomePage.clickOnChangeLink();
		PauseScript(1);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be able to select \"([^\"]*)\" and enter the zip code as \"([^\"]*)\" and hit the Update button$")
	public void i_should_be_able_to_select_something_and_enter_the_zip_code_as_something_and_hit_the_update_button(
			String changesite, String zipcode) throws Throwable {

		RegenceAsurisBSHHomePage regenceAsurisBSHHomePage = new RegenceAsurisBSHHomePage(driver);

		regenceAsurisBSHHomePage.changeSite(changesite);
		regenceAsurisBSHHomePage.changeYourLocation(zipcode);
		regenceAsurisBSHHomePage.clickOnUpdateButton();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be landed on \"([^\"]*)\" Site$")
	public void i_should_be_landed_on_something_site(String sitename) throws Throwable {

		RegenceAsurisBSHHomePage regenceAsurisBSHHomePage = new RegenceAsurisBSHHomePage(driver);
		regenceAsurisBSHHomePage.verifyLandingOnHomePage(sitename);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I click on Find a doctor hyperlink$")
	public void when_i_click_on_find_a_doctor_hyperlink() throws Throwable {

		RegenceAsurisBSHHomePage regenceAsurisBSHHomePage = new RegenceAsurisBSHHomePage(driver);
		regenceAsurisBSHHomePage.clickOnFindADoctor();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be landed on the Finding doctors page$")
	public void i_should_be_landed_on_the_finding_doctors_page() throws Throwable {

		RegenceAsurisBSHFindingDoctorsPage regenceAsurisBSHFindingDoctorsPage = new RegenceAsurisBSHFindingDoctorsPage(
				driver);
		regenceAsurisBSHFindingDoctorsPage.verifyLandingOnFindingDoctorsPage();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I scroll down and click the Search now hyperlink under the For guests section$")
	public void when_i_scroll_down_and_click_the_search_now_hyperlink_under_the_for_guests_section() throws Throwable {

		RegenceAsurisBSHFindingDoctorsPage regenceAsurisBSHFindingDoctorsPage = new RegenceAsurisBSHFindingDoctorsPage(
				driver);
		regenceAsurisBSHFindingDoctorsPage.clickOnSearchNowLink();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be taken to the HSQ landing page that has the title as \"([^\"]*)\"$")
	public void i_should_be_taken_to_the_HSQ_landing_page_that_has_the_title_as(String hsqhomepagetitle)
			throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.naviagteToHsqWindow(driver);
		hsqSearchHomePage.validateHsqHomePageTitle(driver, hsqhomepagetitle);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I click on Choose a network button$")
	public void when_i_click_on_choose_a_network_button() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.clickOnChooseANetworkButton();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be taken to the Find your network by name section$")
	public void i_should_be_taken_to_the_find_your_network_by_name_section() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.navigateToFindYourNetworkByNameSection();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I click on Browse a list of networks hyperlink$")
	public void when_i_click_on_browse_a_list_of_networks_hyperlink() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.clickOnBrowseAListOfNetworksLink();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be taken to the Browse all networks section$")
	public void i_should_be_taken_to_the_browse_all_networks_section() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.navigateToBrowseAllNetworksSection();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I scroll down to the bottom of the page$")
	public void when_i_scroll_down_to_the_bottom_of_the_page() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.scrollDownTillFindingAllNetworksLink();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should find the \"([^\"]*)\" option$")
	public void i_should_find_the_something_option(String networkname) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.FindingAllNetworksLink(networkname);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I select the \"([^\"]*)\" then I should be taken to the Confirm selection section$")
	public void when_i_select_the_something_then_i_should_be_taken_to_the_confirm_selection_section(String networkname)
			throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.clickOnNetworkName(networkname);
		hsqSearchHomePage.locateConfirmSelectionButton();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I hit the Confirm selection button$")
	public void when_i_hit_the_confirm_selection_button() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.hitConfirmSelectionButton();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
	}

	@Then("^I should be taken to the HSQ Search homepage with the option If you use All Networks the providers you find may not be in your network presented with Ok I understand option$")
	public void i_should_be_taken_to_the_hsq_search_homepage_with_the_option_if_you_use_all_networks_the_providers_you_find_may_not_be_in_your_network_presented_with_ok_i_understand_option()
			throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.locateOkIUnderstandLink();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^I should be able to select Ok I understand link$")
	public void i_should_be_able_to_select_ok_i_understand_link() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.clickOnOkIUnderstandLink();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^when I click on All categories option$")
	public void when_i_click_on_all_categories_option() throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.clickOnAllCategories();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
	}

	@Then("^I should be presented with an option to search for doctors, hospitals and clinic by name, condition or specialty$")
	public void i_should_be_presented_with_an_option_to_search_for_doctors_hospitals_and_clinic_by_name_condition_or_specialty()
			throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.locateSearchForDoctors_HospitalsAndClinicByName_Condition_Or_Specialty();

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");
	}

	@And("^when I enter the \"([^\"]*)\" and hit enter$")
	public void when_i_enter_the_something_and_hit_enter(String searchtext) throws Throwable {

		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);
		hsqSearchHomePage.enterSearchText(searchtext);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be able to see the text \"([^\"]*)\" with yes and no options$")
	public void i_should_be_able_to_see_the_text_something_with_yes_and_no_options(String surveytext) throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);
		hsqSearchResultPage.locateSurveyTextWithYesAndNoOption(surveytext);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^When I hit the \"([^\"]*)\" option$")
	public void when_i_hit_the_something_option(String selectionsurvey) throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);
		hsqSearchResultPage.selectSurvey(selectionsurvey);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@Then("^I should be able to see the survey confirmation \"([^\"]*)\"$")
	public void i_should_be_able_to_see_the_survey_confirmation_something(String feedback_Confirmaiton)
			throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);
		hsqSearchResultPage.surveyConfirmation(feedback_Confirmaiton);

		currentScenario.embed(Util.takeScreenshot(driver), "image/png");

	}

	@And("^I should be able to close the HSQ tab$")
	public void i_should_be_able_to_close_the_hsq_tab() throws Throwable {

		HSQSearchResultPage hsqSearchResultPage = new HSQSearchResultPage(driver);

		log.info("Current driver window Title is: " + driver.getTitle());
		hsqSearchResultPage.closeHSQSearchResultsWindow();

	}

	@And("^also I should be able to go back to the \"([^\"]*)\" public home page$")
	public void also_i_should_be_able_to_go_back_to_the_something_public_home_page(String brand) throws Throwable {
		
		HSQSearchHomePage hsqSearchHomePage = new HSQSearchHomePage(driver);

		if (brand.equalsIgnoreCase("Regence")) {

			regenceWindowDriver = DriverFactory.getHandleToWindow(driver, regenceFindingDoctorsWindowTitle);

			log.info("Navigating back to the " + regenceFindingDoctorsWindowTitle + " window...");

			String actualRegenceWindowTitle = regenceWindowDriver.getTitle();
			String expectedRegenceWindowTitle = regenceFindingDoctorsWindowTitle;

			assertEquals(actualRegenceWindowTitle, expectedRegenceWindowTitle,
					regenceFindingDoctorsWindowTitle + " title mismatch...");

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			log.info("Navigated back to the " + regenceFindingDoctorsWindowTitle + " window Successfully...");

		} else if (brand.equalsIgnoreCase("Asuris")) {

			asurisWindowDriver = DriverFactory.getHandleToWindow(driver, asurisFindingDoctorsWindowTitle);

			log.info("Navigating back to the " + asurisFindingDoctorsWindowTitle + " window...");

			String actualRegenceWindowTitle = asurisWindowDriver.getTitle();
			String expectedAsurisWindowTitle = asurisFindingDoctorsWindowTitle;

			assertEquals(actualRegenceWindowTitle, expectedAsurisWindowTitle,
					asurisFindingDoctorsWindowTitle + " title mismatch...");

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			log.info("Navigated back to the " + asurisFindingDoctorsWindowTitle + " window Successfully...");

		} else if (brand.equalsIgnoreCase("BSH")) {

			bshWindowDriver = DriverFactory.getHandleToWindow(driver, bshFindingDoctorsWindowTitle);

			log.info("Navigating back to the " + bshFindingDoctorsWindowTitle + " window...");

			String actualBshWindowTitle = bshWindowDriver.getTitle();
			String expectedBshWindowTitle = bshFindingDoctorsWindowTitle;

			assertEquals(actualBshWindowTitle, expectedBshWindowTitle,
					bshFindingDoctorsWindowTitle + " title mismatch...");

			currentScenario.embed(Util.takeScreenshot(driver), "image/png");
			log.info(
					"Navigated back to the " + bshFindingDoctorsWindowTitle + " window Successfully...");

		}

	}

	@And("^I should be able to close the \"([^\"]*)\" browser window$")
	public void i_should_be_able_to_close_the_something_browser_window(String brand) throws Throwable {

		if (brand.equalsIgnoreCase("Regence")) {

			regenceWindowDriver = DriverFactory.getHandleToWindow(driver, regenceFindingDoctorsWindowTitle);

			log.info("Closing the " + regenceFindingDoctorsWindowTitle + " window...");

			regenceWindowDriver.close();
			log.info("Closed the " + regenceFindingDoctorsWindowTitle + " window Successfully...");

		} else if (brand.equalsIgnoreCase("Asuris")) {

			asurisWindowDriver = DriverFactory.getHandleToWindow(driver, asurisFindingDoctorsWindowTitle);

			log.info("Closing the " + asurisFindingDoctorsWindowTitle + " window...");

			asurisWindowDriver.close();
			log.info("Closed the " + asurisFindingDoctorsWindowTitle + " window Successfully...");

		} else if (brand.equalsIgnoreCase("BSH")) {

			bshWindowDriver = DriverFactory.getHandleToWindow(driver, bshFindingDoctorsWindowTitle);

			log.info("Closing the " + bshFindingDoctorsWindowTitle + " window...");

			bshWindowDriver.close();
			log.info("Closed the " + bshFindingDoctorsWindowTitle + " window Successfully...");

		}

	}

}

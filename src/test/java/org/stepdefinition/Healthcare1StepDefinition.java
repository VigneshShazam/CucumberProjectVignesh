package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.superclass.SuperClass;

import AllPojo.HealthcarePojoClass1;
import AllPojo.HealthcarePojoClass2;
import io.cucumber.java.en.*;

public class Healthcare1StepDefinition extends SuperClass {

	@Given("User should launch the browser and load the url")
	public void user_should_launch_the_browser_and_load_the_browser() throws InterruptedException {
		getDateAndTime();
		toImplicitWait(20);

	}

	@When("User should enter any wanted search option")
	public void user_should_enter_any_wanted_search_option() {
		toImplicitWait(10);
		HealthcarePojoClass1 v = new HealthcarePojoClass1();

		WebElement popUp = v.getPopUp();
		toClick(popUp);

		WebElement searchfield = v.getSearchfield();
		fillTextBox(searchfield, "Generic Drugs");

	}

	@When("User should click the search button")
	public void user_should_click_the_login_search_button() {
		
		toImplicitWait(10);
		
		HealthcarePojoClass1 v = new HealthcarePojoClass1();
		WebElement searchBtn = v.getSearchBtn();
		toClick(searchBtn);

	}

	@When("User should select necessary options for given below")
	public void user_should_select_necessary_options_for_given_below() {

		toImplicitWait(15);

		HealthcarePojoClass1 v = new HealthcarePojoClass1();

		WebElement linkSearch = v.getFirstLink();
		toClick(linkSearch);

	}

	@Then("User should navigate to valid credential page")
	public void user_should_navigate_to_valid_credential_page() {

		toImplicitWait(10);

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Generic-Drugs page need to Verify", currentUrl.contains("Generic"));
		System.out.println(driver.getTitle());

	}

	@When("User should enter another wanted search option")
	public void user_should_enter_another_wanted_search_option() {
		HealthcarePojoClass1 v = new HealthcarePojoClass1();
		
		WebElement popUp = v.getPopUp();
		toClick(popUp);

		
		WebElement searchfield = v.getSearchfield();
		fillTextBox(searchfield, "Vaccines");

		
	}

	@Given("User should select firstlink options for given below")
	public void user_should_select_firstlink_options_for_given_below() {
		HealthcarePojoClass2 k = new HealthcarePojoClass2();

		WebElement secLink = k.getSecLink();
		toClick(secLink);

	}

	@Then("User should navigate to valid credential pages")
	public void user_should_navigate_to_valid_credential_pages() {
		

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Vaccines page need to Verify", currentUrl.contains("Improving-Care"));
		System.out.println(driver.getTitle());

	}
	
	@Then("User should take a screenshot on last navigate page")
	public void user_should_take_a_screenshot_on_last_navigate_page() throws IOException {
	 takescreenshot("Generics");
	 
	}

	@Then("User should takes a screenshot on last navigate page")
	public void user_should_takes_a_screenshot_on_last_navigate_page() throws IOException {
		takescreenshot("Vaccines");
	}




}

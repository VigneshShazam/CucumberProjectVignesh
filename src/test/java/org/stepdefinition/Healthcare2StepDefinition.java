package org.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.superclass.SuperClass;
import AllPojo.HealthcarePojoClass1;
import AllPojo.HealthcarePojoClass3;
import io.cucumber.java.en.*;

public class Healthcare2StepDefinition extends SuperClass {

	@When("User should enter wanted search {string} option")
	public void user_should_enter_wanted_search_option(String s1) {
		HealthcarePojoClass1 v = new HealthcarePojoClass1();

		WebElement popUp = v.getPopUp();
		toClick(popUp);

		toImplicitWait(10);

		WebElement searchBox = v.getSearchfield();
		fillTextBox(searchBox, s1);

	}

	@When("User should select optIons from given below")
	public void user_should_select_optIons_from_given_below() {
		toImplicitWait(10);
		HealthcarePojoClass3 v = new HealthcarePojoClass3();

		WebElement thirdLink = v.getThirdLink();
		toClick(thirdLink);

	}

	@Then("User should navigate to valid Credential page")
	public void user_should_navigate_to_valid_Credential_page() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Drug Ordering for Pharmacies", currentUrl.contains("Drug-Ordering"));
		System.out.println(driver.getTitle());

	}

	@Then("User should take a screenshot on last navigatE page")
	public void user_should_take_a_screenshot_on_last_navigatE_page() throws IOException {

		takescreenshot("Pharamacies");

	}

}

package org.stepdefinition;

import java.io.IOException;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.superclass.SuperClass;

import AllPojo.HealthcarePojoClass1;
import AllPojo.HealthcarePojoClass4;
import AllPojo.HealthcarePojoClass5;
import io.cucumber.java.en.*;

public class DataTableStepDefinition extends SuperClass {

	// 1 Dimension LIST

	@When("User should enter any wanted search optioN")
	public void user_should_enter_any_wanted_search_optioN(io.cucumber.datatable.DataTable d1) {

		toImplicitWait(10);

		HealthcarePojoClass4 v = new HealthcarePojoClass4();

		WebElement popUp = v.getPopUp();
		toClick(popUp);

		WebElement searchfield = v.getSearchfield();
		String text = d1.asList().get(0);
		fillTextBox(searchfield, text);

	}

	@When("User should select necessary options for given beloW")
	public void user_should_select_necessary_options_for_given_beloW() {

		toImplicitWait(10);

		HealthcarePojoClass5 v = new HealthcarePojoClass5();
		WebElement fourthLink = v.getFourthLink();
		toClick(fourthLink);
	}

	@Then("User should navigate to valid credential pagE")
	public void user_should_navigate_to_valid_credential_pagE() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Plasma & Biologics for Non-Physicians page need to Verify",
				currentUrl.contains("Plasma-Biologics"));
		System.out.println(driver.getTitle());

	}

	@Then("User should take a screenshot on last navigate pagE")
	public void user_should_take_a_screenshot_on_last_navigate_pagE() throws IOException {
		takescreenshot("Plasma");
	}

	// 2 Dimension LIST

	@When("User should enter any wanted search optiON")
	public void user_should_enter_any_wanted_search_optiON(io.cucumber.datatable.DataTable d2) {

		HealthcarePojoClass1 v = new HealthcarePojoClass1();

		WebElement popUp = v.getPopUp();
		toClick(popUp);

		WebElement searchfield = v.getSearchfield();
		String s2 = d2.asLists().get(0).get(0);
		fillTextBox(searchfield, s2);

	}

	@When("User should select necessary options for given belOW")
	public void user_should_select_necessary_options_for_given_belOW() {

		HealthcarePojoClass5 v = new HealthcarePojoClass5();

		WebElement fifthLink = v.getFifthLink();
		toClick(fifthLink);

	}

	@Then("User should navigate to valid credential paGE")
	public void user_should_navigate_to_valid_credential_paGE() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("OTC Pharmacy Products page need to Verify", currentUrl.contains("Pharmacy-Management"));
		System.out.println(driver.getTitle());

	}

	@Then("User should take a screenshot on last navigate paGE")
	public void user_should_take_a_screenshot_on_last_navigate_paGE() throws IOException {
		takescreenshot("OTC Pharmacy");

	}

	// 1 Dimension MAP

	@When("User should enter any wanted search optION")
	public void user_should_enter_any_wanted_search_optION(io.cucumber.datatable.DataTable d3) {

		HealthcarePojoClass1 v = new HealthcarePojoClass1();

		WebElement popUp = v.getPopUp();
		toClick(popUp);

		WebElement searchfield = v.getSearchfield();
		Map<String, String> dm = d3.asMap(String.class, String.class);
		String s1 = dm.get("Title 1");
		fillTextBox(searchfield, s1);

	}

	@When("User should select necessary options for given bElOW")
	public void user_should_select_necessary_options_for_given_bElOW() {

		HealthcarePojoClass5 vk = new HealthcarePojoClass5();

		WebElement sixthLink = vk.getSixthLink();
		toClick(sixthLink);

	}

	@Then("User should navigate to valid credential pAGE")
	public void user_should_navigate_to_valid_credential_pAGE() {

		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Drug Packaging Services page need to Verify", currentUrl.contains("Drug-Packaging"));
		System.out.println(driver.getTitle());

	}

	@Then("User should take a screenshot on last navigate pAGE")
	public void user_should_take_a_screenshot_on_last_navigate_pAGE() throws IOException {
		takescreenshot("Drug Packing");
	}

	// 2 Dimension MAP

	@When("User should enter any wanted search opTION")
	public void user_should_enter_any_wanted_search_opTION(io.cucumber.datatable.DataTable d4) {

		HealthcarePojoClass1 vky = new HealthcarePojoClass1();
		WebElement popUp = vky.getPopUp();
		toClick(popUp);

		WebElement searchfield = vky.getSearchfield();
		String st = d4.asMaps().get(1).get("Title 3");
		fillTextBox(searchfield, st);

	}

	@When("User should select necessary options for given BElOW")
	public void user_should_select_necessary_options_for_given_BElOW() {
		HealthcarePojoClass5 vg = new HealthcarePojoClass5();
		WebElement seventhLink = vg.getSeventhLink();
		toClick(seventhLink);

	}

	@Then("User should navigate to valid credential PAGE")
	public void user_should_navigate_to_valid_credential_PAGE() {
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue("Home Medical Equipment page need to Verify", currentUrl.contains("Home-Medical"));
		System.out.println(driver.getTitle());
	}

	@Then("User should take a screenshot on last navigate PAGE")
	public void user_should_take_a_screenshot_on_last_navigate_PAGE() throws IOException {

		takescreenshot("HomeMedical");
	}

}

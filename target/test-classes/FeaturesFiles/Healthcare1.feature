@All @Trinity
Feature: Validate the valid functionality of Healthcare

  Background: 
    Given User should launch the browser and load the url

  Scenario: Validate any Search Suggestions in SearchBox
    When User should enter any wanted search option
    And User should click the search button
    And User should select necessary options for given below
    Then User should navigate to valid credential page
    Then User should take a screenshot on last navigate page

  Scenario: Validate another Search Suggestions in SearchBox
    When User should enter another wanted search option
    And User should click the search button
    And User should select firstlink options for given below
    Then User should navigate to valid credential pages
    Then User should takes a screenshot on last navigate page

    
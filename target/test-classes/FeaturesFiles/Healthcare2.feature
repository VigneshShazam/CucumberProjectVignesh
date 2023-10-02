@All @Sanity
Feature: Validate the valid functionality of Healthcare in Scenario Outline

  Background: 
    Given User should launch the browser and load the url

  Scenario Outline: Validate any Search Suggestions in SearchBox
    When User should enter wanted search "<Header>" option
    And User should click the search button
    And User should select optIons from given below
    Then User should navigate to valid Credential page
    Then User should take a screenshot on last navigatE page

    Examples: 
      | Header                       |
      | Drug Ordering for Pharmacies |

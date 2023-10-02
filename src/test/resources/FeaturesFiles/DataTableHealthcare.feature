@All @Trim
Feature: Validate the valid functionality of Healthcare using Datatable

  Background: 
    Given User should launch the browser and load the url

  Scenario: Validate any Search Suggestions in SearchBoX
    When User should enter any wanted search optioN
      #1 Dimention List
      | Plasma & Biologics for Non-Physicians | Plasma & Biologics for Non-Physicians |
    And User should click the search button
    And User should select necessary options for given beloW
    Then User should navigate to valid credential pagE
    Then User should take a screenshot on last navigate pagE

  Scenario: Validate dimention list in Search Suggestions in SearchBoX
    When User should enter any wanted search optiON
      #2 Dimention List
      | OTC Pharmacy Products | Controlled Substance Ordering (CSOS) |
      | Packaging Solutions   | Drug Packaging Services              |
    And User should click the search button
    And User should select necessary options for given belOW
    Then User should navigate to valid credential paGE
    Then User should take a screenshot on last navigate paGE

  Scenario: Validate dimention list in Search SuggestionS in Searchbox
    When User should enter any wanted search optION
      #1 Dimention Map
      | Title 1 | Drug Packaging Services              |
      | Title 2 | Controlled Substance Ordering (CSOS) |
      | Title 3 | Packaging Solutions                  |
    And User should click the search button
    And User should select necessary options for given bElOW
    Then User should navigate to valid credential pAGE
    Then User should take a screenshot on last navigate pAGE

  Scenario: Validate dimention list in Search SuggestioNS in Searchbox
    When User should enter any wanted search opTION
      #2 Dimention Map
      | Title 1                              | Title 2             | Title 3                  |
      | Controlled Substance Ordering (CSOS) | Packaging Solutions | Post Acute Care Supplies |
      | Surgery Center Supplies & Equipment  | Non-Acute Supplies  | Home Medical Equipment   |
    And User should click the search button
    And User should select necessary options for given BElOW
    Then User should navigate to valid credential PAGE
    Then User should take a screenshot on last navigate PAGE

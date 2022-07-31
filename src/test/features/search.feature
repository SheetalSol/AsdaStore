Feature: Search Feature
  As a user
  I should be able to search product with relevant data

  Background: Pre-condition
    Given that i am on home page "https://www.asda.com/"

    @search
  Scenario Outline: Verify search with product name
      When I click on I Accept cookie button
      When I enter search term "<searchTerm>" in search text box
      And click on the search button
      Then I should be redirected to the search result page with relevant result title "<searchResultTitle>"
      And I should see relevant products for "<searchTerm>"

    Examples:
      | searchTerm | searchResultTitle|
      |  dresses      |  Dresses          |

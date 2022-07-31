Feature: Nearest Store Locator
  As a user
  I should be able to search nearest store with valid town name or postcode
  @locator
  Scenario: Verify Store Locator with valid town or postcode
    Given I am on the homepage "https://www.asda.com/"
    When I Click on I Accept button on cookie PopUp Window
    When I click on Find a Store link
    Then I should be navigated to store locator page
    When I enter "rui" as search term
    Then I should be able to see relevant list of towns in dropdown
    When I select "Ruislip" from dropdown
    Then I should be able to see relevant list of stores for town




Feature:Verify Add to Basket Feature
  As a user
  I should be able to add items to the basket
  Scenario:
    Given that i am on home page "https://www.asda.com/"
    When I Click on "I Accept" button on cookie PopUp Window
    When I enter search term "milk" in search text box
    And click on the search button
    Then I should be redirected to the search result page with relevant result title "Milk"
    And I should see relevant products for "Milk"
    When I click on the Item "'Cadbury Dairy Milk Freddo Chocolate Bar 6 Pack"
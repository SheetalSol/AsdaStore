Feature: Verify Sign In function
  As a user
  I should be able to sign in with valid data
  @login
  Scenario:
    Given I am on the homepage "https://www.asda.com/"
    When I Click on I Accept button on cookie PopUp Window
    When I click on Sign in button
    Then I should be redirected to the Sign In page and see page header "Sign in"
    When I enter valid Email "smsolanki@gmail.com"
    When I enter valid password "Passw0rd123!!"
    And I click on SignIn button
    Then I should be redirected to the homepage with title "Asda.com - Online Food Shopping, George, & more"
  And I should see Your Account link on homepage


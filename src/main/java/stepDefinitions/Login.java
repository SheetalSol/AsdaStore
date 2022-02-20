package stepDefinitions;

import Base.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class Login extends BaseClass {

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("I am on the homepage {string}")
    public void i_am_on_the_homepage(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @When("I Click on I Accept button on cookie PopUp Window")
    public void i_click_on_button_on_cookie_pop_up_window() {
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @When("I click on Sign in button")
    public void i_click_on_button() {
        homePage.SignInButton.click();

    }

    @Then("I should be redirected to the Sign In page and see page header {string}")
    public void i_should_be_redirected_to_the_sign_in_page_and_see_page_header(String expectedPageHeader) {

       String actualPageHeader = loginPage.getPageHeader();
      // System.out.println("Actual Page Header:" +actualPageHeader);
       // System.out.println("Expected Page Header:" +expectedPageHeader);
        Assert.assertEquals(expectedPageHeader,actualPageHeader);
    }

    @When("I enter valid Email {string}")
    public void i_enter_valid_email_email(String email) {
        loginPage.enterEmail(email);

    }

    @When("I enter valid password {string}")
    public void i_enter_valid_password_password(String password) {
        loginPage.enterPassword(password);

    }

    @When("I click on SignIn button")
    public void i_click_on_sign_in_button() {
        loginPage.btnSignIn.click();
    }

    @Then("I should be redirected to the homepage with title {string}")
    public void i_should_be_redirected_to_the_homepage(String expectedPageTitle) {
     // Assert.assertEquals(getPageTitle(),expectedPageTitle);
    }

    @And("I should see Your Account link on homepage")
    public void i_should_see_link_on_homepage() {

        Assert.assertTrue(homePage.checkMyAccountButton());
    }
}

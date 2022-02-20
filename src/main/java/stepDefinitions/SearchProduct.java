package stepDefinitions;

import Base.BaseClass;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class SearchProduct extends BaseClass {


    HomePage homepage = new HomePage(driver);

    @Given("that i am on home page {string}")
    public void that_i_am_on_home_page(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        waitToLoadElement();

    }
    @When("I Click on {string} button on cookie PopUp Window")
    public void i_click_on_button_on_cookie_pop_up_window(String string) {
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

   @When("I enter search term {string} in search text box")
    public void i_enter_search_term_in_search_text_box(String searchText) {
        homepage.searchTextBox.sendKeys(searchText);

    }

    @When("click on the search button")
    public void click_on_the_search_button() {
        homepage.clickSearchButton();
    }

    @Then("I should be redirected to the search result page with relevant result title {string}")
    public void verifyRelevantPage(String resultTitle) {
        String actualTitle = driver.findElement(By.className("search-content-header__keyword")).getText();
        Assert.assertEquals(resultTitle, actualTitle);
    }
       @And("I should see relevant products for {string}")
       public void verifyRelevantProducts(String expectedTermNameInProductName)
        {
        List<WebElement> result =  driver.findElements(By.className("co-product__anchor"));
        for (WebElement itemName : result)
        {

            Assert.assertTrue(itemName.getText().contains(expectedTermNameInProductName));
            System.out.println(itemName.getText());
        }



    }


}

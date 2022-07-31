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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.*;

public class SearchProduct extends BaseClass {


    HomePage homepage = new HomePage(driver);

    @Given(value="that i am on home page {string}")
    public void that_i_am_on_home_page(String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
        waitToLoadElement();

    }
    @When("I click on I Accept cookie button")
     public void i_click_on_button_on_cookie_pop_up_window() {
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
        WebElement pageHeader = driver.findElement(By.className("search-content-header__keyword"));
        String actualTitle = pageHeader.getText();
        Actions clickText = new Actions(driver); // Using action class - right click on Dresses page header
        clickText.moveToElement(pageHeader).perform();
        clickText.contextClick().perform();
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(pageHeader));
        Assert.assertEquals(resultTitle, actualTitle);
    }
    @And("I should see relevant products for {string}")
       public void verifyRelevantProducts(String expectedTermNameInProductName)
        {
        List<WebElement> result =  driver.findElements(By.className("co-product__anchor"));
        for (WebElement itemName : result)
        {
            System.out.println(itemName.getText());
            //Assert.assertTrue(itemName.getText().contains(expectedTermNameInProductName));

        }



    }


}

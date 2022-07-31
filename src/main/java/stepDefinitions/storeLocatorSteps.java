package stepDefinitions;

import Base.BaseClass;
import PageObjects.FindStorePage;
import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class storeLocatorSteps extends BaseClass
{
    public HomePage homePage = new HomePage(driver);
    FindStorePage findStorePage = new FindStorePage(driver);
    @When("I click on Find a Store link")
    public void clickStoreLink()
    {
        homePage.clickFindStoreLink();
    }
    @Then("I should be navigated to store locator page")
    public void verifyFindStorePage()
    {
        String expectedPageHeader = "Find a Store";
        Assert.assertEquals(expectedPageHeader,findStorePage.getPageHeader());
    }
    @When("I enter {string} as search term")
    public void enterTownName(String townName)
    {
        findStorePage.enterTownName(townName);
    }
    @Then("I should be able to see relevant list of towns in dropdown")
    public void verifyResultDropDown()
    {
        System.out.println("Dropdown Displayed : "+findStorePage.verifyDropDownIsDisplayed());
        Assert.assertTrue(findStorePage.verifyDropDownIsDisplayed());

    }

    @When("I select {string} from dropdown")
    public void selectTownFromResult(String town)
    {
        findStorePage.selectTown(town);
    }
    @Then("I should be able to see relevant list of stores for town")
    public void verifyRelevantStoreList()
    {
       Assert.assertTrue(findStorePage.verifyResultSummaryDisplayed());

    }
}


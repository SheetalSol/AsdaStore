package PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class FindStorePage {

    @FindBy(xpath = "//h1[text()='Find a Store']")
    public WebElement pageHeader;
    public FindStorePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter postcode or town/city…']")
    public WebElement searchStoreTextBox;

    @FindBy(xpath="//ul[@class='c-Autocomplete-list']")
    public WebElement resultDropDown;


    @FindBy(xpath = "//div[@class='ResultSummary']")
    public WebElement resultSummaryText;
    public String getPageHeader()
    {
        return pageHeader.getText();
    }

    public void enterTownName(String town)
    {
        searchStoreTextBox.sendKeys(town);
    }
    public boolean verifyDropDownIsDisplayed()
    {
       return  resultDropDown.isEnabled();
    }
    public void selectTown(String town)
    {

        resultDropDown.sendKeys(Keys.ARROW_DOWN);
        resultDropDown.sendKeys(Keys.ENTER);
    }
    public Boolean verifyResultSummaryDisplayed()
    {
        return resultSummaryText.isEnabled();
    }
}

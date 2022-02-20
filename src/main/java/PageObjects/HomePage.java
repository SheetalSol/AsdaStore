package PageObjects;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{


     @FindBy(xpath = "//input[@class=\'search-input\']")
    public WebElement searchTextBox;

    @FindBy(xpath ="//*[@id=\"root\"]/div/header/div/form/button/span")
    public WebElement searchButton;

    @FindBy(xpath = "//li/a[text()='Sign in']")
    public WebElement SignInButton;

    @FindBy(xpath = "//button[text()='Your Account']")
    public WebElement myAccountButton;

    @FindBy(id= "onetrust-accept-btn-handler")
    public WebElement cookieButton;

    public HomePage(WebDriver driver)
    {
       // this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAcceptCookieButton()
    {
        cookieButton.click();
    }
    public void clickSignInButton()
    {
        SignInButton.click();
    }
    public void enterSearchTerm(String searchTerm)
    {
        searchTextBox.sendKeys(searchTerm);

    }
    public void clickSearchButton()
    {
        searchButton.click();
    }

    public boolean checkMyAccountButton() {
        return myAccountButton.isDisplayed();

    }


}

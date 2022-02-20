package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[text()='Sign in ']")
    public WebElement pageHeader;

    @FindBy(xpath = "//input[@class='email-phone-input ']")
    public WebElement txtEmail;

    @FindBy(id="password")
    public WebElement txtPassword;

    @FindBy(id="remember-me")
    public WebElement chkRememberMe;

    @FindBy(id="reset-pwd")
    public WebElement btnForgotPassword;

    @FindBy(xpath = "//button[text()='Sign in']")
    public WebElement btnSignIn;

    public String getPageHeader()
    {
        return pageHeader.getText();
    }

    public void enterEmail(String email)
    {
        txtEmail.sendKeys(email);
    }
    public void enterPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickSignInButton()
    {
        btnSignIn.click();
    }

}


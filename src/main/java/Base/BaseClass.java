package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public void openBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void closeBrowser()
    {
        driver.quit();
    }
    public void waitToLoadElement()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public String getPageTitle()
    {
        return driver.getTitle();
    }
}

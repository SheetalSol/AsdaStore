import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    BaseClass baseClass = new BaseClass();

    @Before
    public void beforeEach()
    {
        baseClass.openBrowser();
    }

    @After
    public void afterEach()
    {

        baseClass.closeBrowser();
    }


}


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
//@CucumberOptions(features = ".",tags="@locator")
@CucumberOptions(features = ".",plugin = {"pretty","html:target/cucumber-report.html"},tags = "@search")
public class Run {

}

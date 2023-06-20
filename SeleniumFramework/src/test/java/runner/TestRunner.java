package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/loginDetails.feature",
        glue ={"definitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

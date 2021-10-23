package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"stepDefinations"},
        plugin = {"pretty", "json:target/Destination/cucumber.json", "html:target/Destination"},
        tags = {"@EndToEnd"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}

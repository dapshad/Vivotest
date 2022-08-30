package Cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue={"StepDefinition"},
        plugin = {"pretty","html:target/site/cucumber.html"},
        tags = "@Item"
)


public class TestRunner {
}

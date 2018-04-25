package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        features = "src/test/java/features",
        glue = "step_definitions",
        tags = {"@q"}
)
public class RunnerTest {
}

package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
					features="src/test/resources/Business_Logic",
					tags="@SmokeTest",
					glue="cucumbermap"
		)

public class SmokeTestRunner {

}

package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", /* specifies where feature files are kept */
		glue = { "steps" },
		plugin = { "pretty", "json:target/json-report/Cucumber.json" }, /* specifies how report will be generated */
		monochrome = true, /* more readable format, removes extra text from console */
		dryRun = false, /* Find out any scenarios without steps exists. When true it will skip sceanrios with step definitions*/
		strict = true /* makes mandatory to add step definitions */
)

public class TestRunner {

}

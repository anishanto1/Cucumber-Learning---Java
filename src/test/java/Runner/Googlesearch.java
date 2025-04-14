package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles",                      // Path to feature files
		glue = "Step_Definition",                       // Path to step definitions
		dryRun = true,                                  // Set to 'false' to execute tests
		monochrome = true,                              // Cleaner console output
		plugin = {"pretty", "html:target/cucumber-reports.html"},  // Generates HTML report
		tags =  " not @simplelogin"                       // Tag to filter specific tests
)
public class Googlesearch {
	// This class combines the feature file and step definitions
}
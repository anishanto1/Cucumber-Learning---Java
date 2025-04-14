package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "FeatureFiles/TaggedHook.feature",  // Path to feature file
		glue = {"Step_Definition", "hooks"},       // Corrected path to step definitions
		dryRun = false,
		monochrome = true,                               // Makes console output more readable
		plugin = {"pretty", "html:target/cucumber-reports.html"},  // Generates HTML report
		tags = "@TaggedHooks"                                  // Tag filter for running specific scenarios
		)
public class HooksRunner {
	// This class will run the feature file
}
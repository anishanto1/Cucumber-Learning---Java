package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/login.feature", glue = "Step_Definition")
public class loginRunner {

	
	//It should combine the feature file & step defination 
}

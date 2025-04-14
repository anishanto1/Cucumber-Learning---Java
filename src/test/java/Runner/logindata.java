package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/LoginDatadriven.feature", glue = "Step_Definition")
public class logindata {

	
	//It should combine the feature file & step defination 
}

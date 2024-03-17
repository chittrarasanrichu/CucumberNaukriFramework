package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"Feature"},glue = {"stepDefinition"},plugin = {"html:index.html"},dryRun = false) //Plugin is used to create report , tags is used run a specfic scenario,
		
public class RunnerClass {
	
	

}

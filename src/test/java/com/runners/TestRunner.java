package com.runners;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src/test/resources/features/", 
		glue="com/steps", 
		dryRun=false, 
		monochrome = true
		,strict=true
		,tags= "@UserStory12"
		,plugin= {
				"pretty",
				"json:target/cucumber.json",
				"html:target/cucumber-default-report",
				"rerun:target/failed.txt"
		}
		)

public class TestRunner {

	
}
package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failed.txt", 
        glue = "com/hrms/steps",
        monochrome = false, 
        plugin = { 
        		"pretty",
		        "html:target/cucumber-default-report", 
		}
		)

public class FailedRunner {

}
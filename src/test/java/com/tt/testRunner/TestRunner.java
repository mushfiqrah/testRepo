package com.tt.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	features = {"Features"},
	glue= {"com.tt.stepDef"},
	tags= {"@sampleProject"}
	)
public class TestRunner extends AbstractTestNGCucumberTests{

}

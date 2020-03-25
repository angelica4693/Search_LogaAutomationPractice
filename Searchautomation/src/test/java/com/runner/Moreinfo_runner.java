package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\Feature\\search.feature",
		tags = {"@TC_05"},
		glue = {"com.testdefinition"},
		monochrome = true
		)
public class Moreinfo_runner {

}

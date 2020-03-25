package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\resources\\feature\\search.feature",
		tags = {"@TC_02"},
		glue = {"com.testdefinition"},
		monochrome = true
		)
public class Validsearch_runner
{
}


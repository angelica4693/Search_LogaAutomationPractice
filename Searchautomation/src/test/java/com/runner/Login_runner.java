package com.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\main\\resources\\Feature\\search.feature",
		tags="@TC_01",
		glue="com.stepdefinition",
		monochrome=true
		)
public class Login_runner
{

}

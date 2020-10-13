package com.automation.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src\\test\\resources\\features", 
				glue = "com.automation.stepdef",
				monochrome = true,
				strict = true,
				tags = "@smoke",
				plugin = { "json:target/cucumber.json"}
		)

public class TestRunner {

}

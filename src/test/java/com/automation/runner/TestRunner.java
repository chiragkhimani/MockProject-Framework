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
<<<<<<< HEAD
				tags="@wip",
=======
>>>>>>> fae1e18ca313a764e8e7b9244d4ee3592f41099a
				plugin = { "json:target/cucumber.json"}
		)

public class TestRunner {

}

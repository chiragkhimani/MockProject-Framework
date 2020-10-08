package com.automation.stepdef;

import com.automation.utility.DriverUtils;
import com.automation.utility.PropertyReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUp() {
		PropertyReader.initProperties();
		DriverUtils.createDriver();
	}

	@After
	public void cleanUp() {
		DriverUtils.quitDriver();
	}

}

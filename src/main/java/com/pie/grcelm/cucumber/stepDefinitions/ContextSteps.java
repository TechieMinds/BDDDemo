package com.pie.grcelm.cucumber.stepDefinitions;

import com.pie.grcelm.cucumber.core.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class ContextSteps {

	//Hooks
	
	@Before
	public void before() {
		
	}
	
	@After
	public void after() {
		DriverFactory.getInstance().quit();
	}
}

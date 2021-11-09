package com.pie.grcelm.cucumber.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		glue = { "com.pie.grcelm.cucumber.stepDefs" }, 
		features = { "classpath:feature/herokuApp2.feature" },
//		tags = "@Data",
				plugin = {
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty"
						}

)
public class UITestRunner extends AbstractTestNGCucumberTests {

	
}


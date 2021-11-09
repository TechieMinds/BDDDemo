package com.pie.grcelm.cucumber.stepDefinitions;

import org.testng.Assert;

import com.pie.grcelm.cucumber.classesPage.DynamicLoadingHomePage;
import com.pie.grcelm.cucumber.classesPage.DynamicLoadingStartPage;
import com.pie.grcelm.cucumber.classesPage.HerokuAppHomePage;
import com.pie.grcelm.cucumber.core.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DynamicLoadingLinkStepDefs {
	
	private DriverFactory driverFactory;
	
	public DynamicLoadingLinkStepDefs() {
		driverFactory = DriverFactory.getInstance();
	}
	
	
	@Given ("^I have to navigate to \"The Internet HerokuApp\"$")
	public void navigateToTheHerokuApp() {
		driverFactory.getDriver().navigate().to("https://the-internet.herokuapp.com/");
	}
	
	@Then ("^I have to see \"Available Examples\" header on the page$")
	@Then ("^I should see the \"Welcome to the-internet\" heading on the page$")
	public void isHerokuHomePageDislayed() {
		HerokuAppHomePage hHP = new HerokuAppHomePage(driverFactory.getDriver());
		Assert.assertTrue(hHP.isHeaderDisplayed());
	} 
	
	@When ("^I click on the \"Dynamic Loading\" link$")
	public void clickOnDynamicLoadingLink() {
		HerokuAppHomePage hHP = new HerokuAppHomePage(driverFactory.getDriver());
		hHP.clickOnDynamicLoadingLink();
	}
	
	@Then ("^I have to see the \"Dynamically Loaded Page Elements\" heading on the page$")
	public void isDynamicLoadingPageDislayed() {
		DynamicLoadingHomePage dLHP = new DynamicLoadingHomePage(driverFactory.getDriver());
		Assert.assertTrue(dLHP.isHeaderDisplayed());
	} 
	
	@When ("^I click on the \"Example 1: Element on page that is hidden\" link$")
	public void clickExample1Link() {
		DynamicLoadingHomePage dLHP = new DynamicLoadingHomePage(driverFactory.getDriver());
		dLHP.clickOnExample1Link();
	}
	
	@Then ("^I have to see the \"Example 1: Element on page that is hidden\" header$")
	public void isExamplePageDislayed() {
		DynamicLoadingStartPage dLSP = new DynamicLoadingStartPage(driverFactory.getDriver());
		Assert.assertTrue(dLSP.isHeaderDisplayed());
	} 
	
	@When ("^I click on the Start button$")
	public void clickOnStartButton() {
		DynamicLoadingStartPage dLSP = new DynamicLoadingStartPage(driverFactory.getDriver());
		dLSP.clickOnStartButton();
	}
	
	@Then ("^I have to see the \"Hello World!\" text displayed.$")
	public void isHelloWorldTextDislayed() {
		DynamicLoadingStartPage dLSP = new DynamicLoadingStartPage(driverFactory.getDriver());
		Assert.assertTrue(dLSP.isHellowWorldTextDisplayed());
	}
}

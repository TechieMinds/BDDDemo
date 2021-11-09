package com.pie.grcelm.cucumber.stepDefinitions;

import org.testng.Assert;

import com.pie.grcelm.cucumber.classesPage.DisappearingElelementsAboutPage;
import com.pie.grcelm.cucumber.classesPage.DisappearingElementsHomePage;
import com.pie.grcelm.cucumber.classesPage.HerokuAppHomePage;
import com.pie.grcelm.cucumber.core.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisappearingElementsLinkStepDef {

private DriverFactory driverFactory;
	
	public DisappearingElementsLinkStepDef() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@When ("^I click on the \"Disappearing Elements\" link again$")
	@When ("^I click on the \"Disappearing Elements\" link$")
	public void clickOnDisappearingElementsLink() {
		HerokuAppHomePage hHP = new HerokuAppHomePage(driverFactory.getDriver());
		hHP.clickOnDisappearingElementsLink();
	}
	
	@Then ("^I have to see the \"Disappearing Elements\" heading on the page again$")
	@Then ("^I have to see the \"Disappearing Elements\" heading on the page$")
	public void isDisappearingElementsPageDislayed() {
		DisappearingElementsHomePage dEHP = new DisappearingElementsHomePage(driverFactory.getDriver());
		Assert.assertTrue(dEHP.isHeaderDisplayed());
	} 
	
	@When ("^I click on the \"Home\" button$")
	public void clickExample1Link() {
		DisappearingElementsHomePage dEHP = new DisappearingElementsHomePage(driverFactory.getDriver());
		dEHP.clickOnHomeButton();
	}
	
	@When ("^I click on \"About\" button$")
	public void clickOnAboutButton() {
		DisappearingElementsHomePage dESP = new DisappearingElementsHomePage(driverFactory.getDriver());
		dESP.clickOnAboutButton();
	}
	
	@Then ("^I have to see the \"Not Found\" header displayed.$")
	public void isNotFoundTextDislayed() {
		DisappearingElelementsAboutPage dEAP = new DisappearingElelementsAboutPage(driverFactory.getDriver());
		Assert.assertTrue(dEAP.isNotFoundTextvisible());
	}
	
}

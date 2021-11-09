package com.pie.grcelm.cucumber.stepDefinitions;

import org.testng.Assert;

import com.pie.grcelm.cucumber.classesPage.ForgotPasswordPage;
import com.pie.grcelm.cucumber.classesPage.ForgotPasswordRetrievePage;
import com.pie.grcelm.cucumber.classesPage.HerokuAppHomePage;
import com.pie.grcelm.cucumber.core.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPasswordStepDef {

	private DriverFactory driverFactory;

	public ForgotPasswordStepDef() {
		driverFactory = DriverFactory.getInstance();
	}

	@When("^I click on the \"Forgot Password\" link$")
	public void clickOnForgotPasswordLink() {
		HerokuAppHomePage hHP = new HerokuAppHomePage(driverFactory.getDriver());
		hHP.clickOnForgotPasswordLink();
	}

	@Then("^I have to see the \"Forgot Password\" heading on the page$")
	public void isForgotPasswordPageDislayed() {
		ForgotPasswordPage fPP = new ForgotPasswordPage(driverFactory.getDriver());
		Assert.assertTrue(fPP.isForgotPasswordHomePageDisplayed());
	}

	@When("^I enter the \"Ramanareddy3107\"email id into the E-mail text box$")
	public void enterEmail() {
		ForgotPasswordPage fPP = new ForgotPasswordPage(driverFactory.getDriver());
		fPP.emailTextBox("Ramanareddy3107@gmail.com");
	}

	@Then("^I should get the email entered in the text box to verify it whether entered correctly or not.$")
	public void getEmailEntered() {
		ForgotPasswordPage fPP = new ForgotPasswordPage(driverFactory.getDriver());
		System.out.println("The Email entered is: " +fPP.emailEntered());
	}

	@When("^I click on the \"Retrieve Password Button\" button$")
	public void clickOnRetrievePassword() {
		ForgotPasswordPage fPP = new ForgotPasswordPage(driverFactory.getDriver());
		fPP.retrievePasswordButton();
	}

	@Then("^I have to see the \"Internal Server Error\" heading on the page again$")
	public void isServerErrorDisplayed() {
		ForgotPasswordRetrievePage fPRP = new ForgotPasswordRetrievePage(driverFactory.getDriver());
		fPRP.retrievePassword();
	}
}

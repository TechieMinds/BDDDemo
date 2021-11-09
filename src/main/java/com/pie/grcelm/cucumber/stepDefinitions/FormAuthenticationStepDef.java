package com.pie.grcelm.cucumber.stepDefinitions;

import org.testng.Assert;

import com.pie.grcelm.cucumber.classesPage.FormAuthenticationHomePage;
import com.pie.grcelm.cucumber.classesPage.FormAuthenticationSecurePage;
import com.pie.grcelm.cucumber.classesPage.HerokuAppHomePage;
import com.pie.grcelm.cucumber.core.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormAuthenticationStepDef {
	
private DriverFactory driverFactory;
	
	public FormAuthenticationStepDef() {
		driverFactory = DriverFactory.getInstance();
	}
	
	@When ("^I click on the \"Form Authentication\" link$")
	public void clickOnFormAuthenticationLink() {
		HerokuAppHomePage hHP = new HerokuAppHomePage(driverFactory.getDriver());
		hHP.clickOnFormAuthenticationLink();
	}
	
	@Then ("^I have to see the \"Login Page\" heading on the page$")
	public void isFormAuthenticationPageDislayed() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		Assert.assertTrue(fAHP.isHeaderDisplayed());
	} 
	
	@When ("^I enter userName in the \"Username\" textfield$")
	public void enterUserName() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		fAHP.enterUserName("tomsmith");
	}
	
	@Then ("^I have to print the userName entered$")
	public void getUserNameEntered() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		System.out.println("The userName entered is: " + fAHP.getUserNameEntered());
	} 
	
	@When ("^I enter password in the \"Password\" text field$")
	public void enterPassword() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		fAHP.enterPassword("SuperSecretPassword!");
	}
	
	@Then ("^I have to print the password entered$")
	public void getPasswordEntered() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		System.out.println("The password submitted is: " + fAHP.getPasswordEntered());
	} 
	
	@When ("^I click on \"Login\" button$")
	public void clickLoginButton() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		fAHP.clickOnLoginButton();
	}
	
	@Then ("^I have to see the \"Secure Area\" header displayed.$")
	public void isSecureAreaTextDislayed() {
		FormAuthenticationSecurePage fASP = new FormAuthenticationSecurePage(driverFactory.getDriver());
		Assert.assertTrue(fASP.isHeaderDisplayed());
	}
	
	@When ("^I click on \"Logout\" button$")
	public void clickLogoutButton() {
		FormAuthenticationSecurePage fASP = new FormAuthenticationSecurePage(driverFactory.getDriver());
		fASP.clickOnLogoutButton();
	}
	
	@Then ("^I have to see \"You logged out of the secure area!\" message displayed$")
	public void isLoggedOutTextDislayed() {
		FormAuthenticationHomePage fAHP = new FormAuthenticationHomePage(driverFactory.getDriver());
		Assert.assertTrue(fAHP.isLogoutSuccessMessageLocatorDisplayed());
	}

}

package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.cucumber.core.BasePage;

public class HerokuAppHomePage extends BasePage{

	private By headerLocator = By.xpath("//h1[text()='Welcome to the-internet']");
	private By formAuthenticationLinkLocator = By.xpath("//a[text()='Form Authentication']");
	private By dynamicLoadingLinkLocator = By.xpath("//a[text()='Dynamic Loading']");
	private By forgotPasswordLinkLocator = By.xpath("//a[text()='Forgot Password']");
	private By disappearingElementsLinkLocator = By.xpath("//a[text()='Disappearing Elements']");
	
	public HerokuAppHomePage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void clickOnFormAuthenticationLink() {
		super.waitForVisibility(formAuthenticationLinkLocator);
		super.click(formAuthenticationLinkLocator);
	}
	
	public void clickOnDynamicLoadingLink() {
		super.waitForVisibility(dynamicLoadingLinkLocator);
		super.click(dynamicLoadingLinkLocator);
	}
	
	public void clickOnForgotPasswordLink() {
		super.waitForVisibility(forgotPasswordLinkLocator);
		super.click(forgotPasswordLinkLocator);
	}
	
	public void clickOnDisappearingElementsLink() {
		super.waitForVisibility(disappearingElementsLinkLocator);
		super.click(disappearingElementsLinkLocator);
	}
	
}

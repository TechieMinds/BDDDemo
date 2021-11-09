package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage; 

public class FormAuthenticationSecurePage extends BasePage{

	private By headerLocator = By.xpath("//h2[text()=' Secure Area']");
	private By logoutButtonLocator = By.xpath("//a[@href='/logout']");
	
	public FormAuthenticationSecurePage(WebDriver driver) {
		super(driver);
	}

	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void clickOnLogoutButton() {
		super.click(logoutButtonLocator);
	}

	
}

package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class ForgotPasswordRetrievePage extends BasePage{

	By headerLocator = By.xpath("//h1[text()='Internal Server Error']");
	
	public ForgotPasswordRetrievePage(WebDriver driver) {
		super(driver);
	}

	public Boolean retrievePassword() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}
	
}

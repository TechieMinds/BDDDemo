package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class FormAuthenticationHomePage extends BasePage{

	private By headerLocator = By.xpath("//h2[text()='Login Page']");
	private By userNameLocator = By.xpath("//input[@name='username']");
	private By passwordLocator = By.xpath("//input[@name='password']");
	private By loginButtonLocator = By.xpath("//button[@type='submit']");
	private By logoutSuccessMessageLocator = By.xpath("//div[contains(text(), 'logged out')]");
	
	public FormAuthenticationHomePage(WebDriver driver) {
		super(driver);
	}

	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void enterUserName(String text) {
		driver.findElement(userNameLocator);
		super.sendKeys(userNameLocator, text);
	}
	
	public String getUserNameEntered() {
		super.waitForVisibility(userNameLocator);
		return super.getAttribute(userNameLocator);
	}

	public void enterPassword(String text) {
		driver.findElement(passwordLocator);
		super.sendKeys(passwordLocator, text);
	}
	
	public String getPasswordEntered() {
		super.waitForVisibility(passwordLocator);
		return super.getAttribute(passwordLocator);
	}

	public void clickOnLoginButton() {
		driver.findElement(loginButtonLocator);
		super.click(loginButtonLocator);
	}
	
	public Boolean isLogoutSuccessMessageLocatorDisplayed() {
		super.waitForVisibility(logoutSuccessMessageLocator);
		return super.isDisplayed(logoutSuccessMessageLocator);
	}
	
}

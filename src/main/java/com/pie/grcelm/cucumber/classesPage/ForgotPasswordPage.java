package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class ForgotPasswordPage extends BasePage{

	By header = By.xpath("//h2[text()='Forgot Password']");
	By emailTextBoxLocator = By.xpath("//input[@id='email']");
	By retrievePasswordButton = By.xpath("//button[@type='submit']");
	
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean isForgotPasswordHomePageDisplayed() {
		super.waitForVisibility(header);
		return super.isDisplayed(header);
	}
	
	public void emailTextBox(String userName) {
		super.sendKeys(emailTextBoxLocator, userName);
	}
	
	public String emailEntered() {
		super.waitForPresence(emailTextBoxLocator);
		return super.getAttribute(emailTextBoxLocator);
	}
	
	public void retrievePasswordButton() {
		super.click(retrievePasswordButton);
	}
	
}

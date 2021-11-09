package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pie.grcelm.cucumber.core.BasePage;

public class DynamicLoadingStartPage extends BasePage{

	private By headerLocator = By.xpath("//h4[text()='Example 1: Element on page that is hidden']");
	By startButtonLocator = By.xpath("//button[text()='Start']");
	By helloWorldTextLocator = By.xpath("//h4[text()='Hello World!']");
	
	public DynamicLoadingStartPage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void clickOnStartButton() {
		super.waitForClickability(startButtonLocator);
		super.click(startButtonLocator);
	}
	
	public Boolean isHellowWorldTextDisplayed() {
		super.waitForVisibility(helloWorldTextLocator);
		return super.isDisplayed(helloWorldTextLocator);
	}
	
}

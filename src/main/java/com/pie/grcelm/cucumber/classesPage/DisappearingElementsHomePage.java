package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class DisappearingElementsHomePage extends BasePage{

	private By headerLocator  = By.xpath("//h3[text()='Disappearing Elements']");
	private By homeButtonLocator = By.xpath("//a[text()='Home']");
	private By aboutButtonLocator = By.xpath("//a[text()='About']");
	
	public DisappearingElementsHomePage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void clickOnHomeButton() {

		super.waitForVisibility(homeButtonLocator);
		super.click(homeButtonLocator);

	}

	public void clickOnAboutButton() {
		super.waitForVisibility(aboutButtonLocator);
		super.click(aboutButtonLocator);

	}

	
}

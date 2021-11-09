package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class DynamicLoadingHomePage extends BasePage {

	private By headerLocator = By.xpath("//h3[text()='Dynamically Loaded Page Elements']");
	private By exampleLink1Locator = By.xpath("//a[contains(text(), 'Example 1')]");

	public  DynamicLoadingHomePage(WebDriver driver) {
		super(driver);
	}
	
	public Boolean isHeaderDisplayed() {
		super.waitForVisibility(headerLocator);
		return super.isDisplayed(headerLocator);
	}

	public void clickOnExample1Link() {
		super.waitForVisibility(exampleLink1Locator);
		super.click(exampleLink1Locator);
	}

}

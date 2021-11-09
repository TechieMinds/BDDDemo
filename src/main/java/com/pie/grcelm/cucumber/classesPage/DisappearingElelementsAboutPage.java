package com.pie.grcelm.cucumber.classesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pie.grcelm.cucumber.core.BasePage;

public class DisappearingElelementsAboutPage extends BasePage {

	private By notFoundLocator = By.xpath("//h1[text()='Not Found']");

	public DisappearingElelementsAboutPage(WebDriver driver) {
		super(driver);
	}

	public Boolean isNotFoundTextvisible() {
		super.waitForPresence(notFoundLocator);
		return super.isDisplayed(notFoundLocator);
	}

}

package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {

	public WebDriver driver;

	public Shipping_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;

	@FindBy(xpath = "(//span)[38]")
	private WebElement ProceedToCheckOut;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}

	

}

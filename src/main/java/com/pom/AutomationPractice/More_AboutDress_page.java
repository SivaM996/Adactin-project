package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class More_AboutDress_page {

	public WebDriver driver;

	public More_AboutDress_page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//select[@name='group_1']")
	private WebElement size;
	
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement addToKart;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToKart() {
		return addToKart;
	}
	
}

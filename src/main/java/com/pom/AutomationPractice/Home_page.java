package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public WebDriver driver;

	public Home_page(WebDriver driver1) {

		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signIN ;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignIN() {
		return signIN;
	}
	

}

package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_page {

	public WebDriver driver;
	
	public Address_page(WebDriver driver2) {
	
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//textarea[@class='form-control']")
	private WebElement commentSection;
	
	@FindBy (xpath = "//span[text()='Proceed to checkout']")
	private WebElement proceedToChcekout3;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCommentSection() {
		return commentSection;
	}

	public WebElement getProceedToChcekout3() {
		return proceedToChcekout3;
	}
}

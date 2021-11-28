package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_to_Checkout_1 {
	
	public WebDriver driver;
	
	public Proceed_to_Checkout_1(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
    
		}

	@FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
	private WebElement Proceedtocheckout;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceedtocheckout() {
		return Proceedtocheckout;
	}
	

}

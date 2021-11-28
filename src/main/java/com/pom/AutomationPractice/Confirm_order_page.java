package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_order_page {

	public WebDriver driver;
	
	public Confirm_order_page(WebDriver driver2){
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement pay;
	
	@FindBy(xpath = "(//span)[36]")
	private WebElement confirmOrder;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
}

package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Itinerary {
	public WebDriver driver;

	public My_Itinerary(WebDriver driver4) {
		this.driver = driver4;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='my_itinerary']")
	WebElement myItinerary;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

}

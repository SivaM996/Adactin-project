package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_selected_page {

	public WebDriver driver;

	public Confirm_selected_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSubmit2() {
		return Submit2;
	}


	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement Submit2;

}

package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	 public WebDriver driver;
	 
	 public Login_page(WebDriver driver1) {
		 this.driver= driver1;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath = "//input[@id='email']")
	 private WebElement email;
	 
	 @FindBy(xpath = "//input[@id='passwd']")
	 private WebElement password;
	 
	 @FindBy(xpath = "//button[@id='SubmitLogin']")
	 private WebElement signInbutton;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignInbutton() {
		return signInbutton;
	}
	
}

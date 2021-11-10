package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;

	public Home_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	// WebElement username = driver.findElement(By.xpath("//input[@type='text']"));

	@FindBy(xpath = "//input[@type='text']")
	private WebElement username;

	// WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;

	// WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
	@FindBy(xpath = "//input[@type='Submit']")
	private WebElement login;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}

}

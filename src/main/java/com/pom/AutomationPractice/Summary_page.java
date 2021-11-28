package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_page {
public WebDriver driver;

public Summary_page(WebDriver driver2) {

    this.driver = driver2;
    PageFactory.initElements(driver, this);
	
}

@FindBy(xpath = "(//span)[65]")
private WebElement ProceedToCheckOut2;

public WebDriver getDriver() {
	return driver;
}

public WebElement getProceedToCheckOut2() {
	return ProceedToCheckOut2;
}


}

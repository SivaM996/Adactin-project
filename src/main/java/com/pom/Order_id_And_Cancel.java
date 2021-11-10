package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_id_And_Cancel {
	public WebDriver driver;

	@FindBy(xpath = "//input[@name='check_all']")
	WebElement orderid;

	public Order_id_And_Cancel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrderid() {
		return orderid;
	}

	@FindBy(xpath ="//input[@name='cancelall']" )
	WebElement cancel;

	public WebElement getCancel() {
		return cancel;
	}
}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {

	public WebDriver driver;

	public Payment_page(WebDriver driver3) {

		this.driver = driver3;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement Firstname;

	public WebElement getFirstname() {
		return Firstname;
	}

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(xpath = "//textarea[@name='address']")
	private WebElement Address;

	public WebElement getAddress() {
		return Address;
	}

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement card;

	public WebElement getCard() {
		return card;
	}

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement cardType;

	public WebElement getCardType() {
		return cardType;
	}

	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement ExpMonth;

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement ExpYear;

	public WebElement getExpYear() {
		return ExpYear;
	}

	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}

	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book;

	public WebElement getBook() {
		return book;
	}

}

package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel_page {
	public  WebDriver driver;
	public Search_hotel_page(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfrooms() {
		return noOfrooms;
	}

	public WebElement getCheckIn() {
		return CheckIn;
	}

	public WebElement getCheckOut() {
		return CheckOut;
	}

	public WebElement getAdult() {
		return Adult;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomType;

	@FindBy(name ="room_nos")
	private WebElement noOfrooms;

	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement CheckIn;

	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement CheckOut;

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement Adult;

	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement children;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
}

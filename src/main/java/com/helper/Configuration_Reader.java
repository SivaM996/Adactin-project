package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	// To read the data from .property file
	public static Properties p;

	public Configuration_Reader() throws Throwable {
		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\src\\main\\java\\com\\properties\\configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getURL() throws Throwable {

		String url = p.getProperty("URL");
		return url;
	}

	public String getUsername() {
		String name = p.getProperty("Username");
		return name;
	}

	public String getPass() {
		String pass = p.getProperty("pass");
		return pass;
	}

	public String getLocation() {
		String location = p.getProperty("location");
		return location;
	}

	public String getHotel() {
		String hotel = p.getProperty("hotel");
		return hotel;

	}

	public String getRoomType() {
		String roomType = p.getProperty("roomType");
		return roomType;
	}

	public String getNoOfrooms() {
		String noOfrooms = p.getProperty("noOfrooms");
		return noOfrooms;
	}

	public String getCheckIn() {
		String CheckIn = p.getProperty("CheckIn");
		return CheckIn;
	}

	public String getCheckOut() {
		String CheckOut = p.getProperty("CheckOut");
		return CheckOut;
	}

	public String getAdult() {
		String Adult = p.getProperty("Adult");
		return Adult;
	}

	public String getChildren() {
		String children = p.getProperty("children");
		return children;
	}

	public String getFirstname() {
		String Firstname = p.getProperty("Firstname");
		return Firstname;
	}

	public String getLastName() {
		String LastName = p.getProperty("LastName");
		return LastName;
	}

	public String getAddress() {
		String Address = p.getProperty("Address");
		return Address;
	}

	public String getCard() {
		String card = p.getProperty("card");
		return card;
	}

	public String getCardType() {
		String cardType = p.getProperty("cardType");
		return cardType;
	}

	public String getExpMonth() {
		String ExpMonth = p.getProperty("ExpMonth");
		return ExpMonth;
	}

	public String getExpYear() {
		String ExpYear = p.getProperty("ExpYear");
		return ExpYear;
	}

	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}

}

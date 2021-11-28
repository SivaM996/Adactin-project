package com.Mini_project_Oct_30_Maven;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_manager;

public class Adactin_practice_2 extends BaseClass {

	static Logger log = Logger.getLogger(Adactin_practice_2.class);

	public static WebDriver driver = BaseClass.getBrowser("chrome"); // null
	public static Page_Object_manager Pom = new Page_Object_manager(driver);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");

		log.info("Automation Session started");

		log.info("Initiating url");

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		implicitwait(30, TimeUnit.SECONDS);

		// String UserName =
		// File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		// inputValueElement(Pom.getInstanceHp().getUsername(), UserName);

		String UserName = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Book1.manual2.xlsx", 1, 5);
		inputValueElement(Pom.getInstanceHp().getUsername(), UserName);

//		String passwd = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPass();
//		inputValueElement(Pom.getInstanceHp().getPass(), passwd);

		String passwd = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Book1.manual2.xlsx", 2, 5);
		inputValueElement(Pom.getInstanceHp().getPass(), passwd);

		ClickOnElement(Pom.getInstanceHp().getLogin());
		log.info("Hotel booking process");

		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		Dropdown("byindex", Pom.getInstanceSH().getLocation(), location);

		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		Dropdown("byvalue", Pom.getInstanceSH().getHotel(), hotel);

		String roomType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomType();
		Dropdown("byvisibletext", Pom.getInstanceSH().getRoomType(), roomType);

		String noOfrooms = File_Reader_Manager.getInstanceFRM().getInstanceCR().getNoOfrooms();
		Dropdown("byindex", Pom.getInstanceSH().getNoOfrooms(), noOfrooms);

		clear(Pom.getInstanceSH().getCheckIn());
		String checkIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckIn();
		inputValueElement(Pom.getInstanceSH().getCheckIn(), checkIn);

		clear(Pom.getInstanceSH().getCheckOut());
		// inputValueElement(Pom.getInstanceSH().getCheckOut(), "1/1/2022");
		String checkOut = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckOut();
		inputValueElement(Pom.getInstanceSH().getCheckOut(), checkOut);

		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult();
		Dropdown("byindex", Pom.getInstanceSH().getAdult(), adult);

		Dropdown("byindex", Pom.getInstanceSH().getChildren(), "2");

		ClickOnElement(Pom.getInstanceSH().getSubmit());
		ClickOnElement(Pom.getInstanceCS().getRadioButton());
		ClickOnElement(Pom.getInstanceCS().getSubmit2());
		log.info("Personal information");

		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		inputValueElement(Pom.getInatancePP().getFirstname(), firstname);

		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		inputValueElement(Pom.getInatancePP().getLastName(), lastName);

		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		inputValueElement(Pom.getInatancePP().getAddress(), address);
		log.info("Payment Processing");

		String card = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCard();
		inputValueElement(Pom.getInatancePP().getCard(), card);

		String cardType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardType();
		Dropdown("byindex", Pom.getInatancePP().getCardType(), cardType);

		String expMonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpMonth();
		Dropdown("byindex", Pom.getInatancePP().getExpMonth(), expMonth);

		String expYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpYear();
		Dropdown("byVisibleText", Pom.getInatancePP().getExpYear(), expYear);

		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		inputValueElement(Pom.getInatancePP().getCvv(), cvv);

		ClickOnElement(Pom.getInatancePP().getBook());
		scrollUpandDown(Pom.getInatancePP().getBook());// thread();
		log.info("Booking Confirmed");

		Screenshot();
		ClickOnElement(Pom.getInstanceMI().getMyItinerary());
		ClickOnElement(Pom.getInstanceOC().getOrderid());
		ClickOnElement(Pom.getInstanceOC().getCancel());
		Acceptalert();
		ClickOnElement(Pom.getIstanceLO().getLogout());
		close();
		log.info("Booking Session Ended");

	}
}

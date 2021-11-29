package com.adactionHotelApp;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Mini_project_Oct_30_Maven.Adactin_practice_2;
import com.Mini_project_Oct_30_Maven.BaseClass;
import com.helper.File_Reader_Manager;
import com.sdp.Page_Object_manager;

public class AdactinHotelApp_Testng extends BaseClass {
	static Logger log = Logger.getLogger(Adactin_practice_2.class);

	public static WebDriver driver = BaseClass.getBrowser("chrome"); // null
	public static Page_Object_manager Pom = new Page_Object_manager(driver);

	@Test(priority = 1)
	private void url() throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		log.info("Automation Session started");

		log.info("Initiating url");

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		implicitwait(30, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	private void login() throws Throwable {
		// TODO Auto-generated method stub

		String UserName = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Book1.manual2.xlsx", 1, 5);
		inputValueElement(Pom.getInstanceHp().getUsername(), UserName);

		String passwd = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\Book1.manual2.xlsx", 2, 5);
		inputValueElement(Pom.getInstanceHp().getPass(), passwd);

		ClickOnElement(Pom.getInstanceHp().getLogin());
		log.info("Hotel booking process");
	}

	@Test(priority = 3)
	private void location() throws Throwable {
		// TODO Auto-generated method stub

		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();

		Dropdown("byindex", Pom.getInstanceSH().getLocation(), location);
	}

	@Test(priority = 4)
	private void Hotelname() throws Throwable {

		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		Dropdown("byvalue", Pom.getInstanceSH().getHotel(), hotel);
	}

	@Test(priority = 5)
	private void roomType() throws Throwable {

		String roomType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoomType();
		Dropdown("byvisibletext", Pom.getInstanceSH().getRoomType(), roomType);
	}

	@Test(priority = 6)
	private void noOfRooms() throws Throwable {

		String noOfrooms = File_Reader_Manager.getInstanceFRM().getInstanceCR().getNoOfrooms();
		Dropdown("byindex", Pom.getInstanceSH().getNoOfrooms(), noOfrooms);
	}

	@Test(priority = 7)
	private void checkIn() throws Throwable {

		clear(Pom.getInstanceSH().getCheckIn());
		String checkIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckIn();
		inputValueElement(Pom.getInstanceSH().getCheckIn(), checkIn);
	}

	@Test(priority = 8)
	private void checkOUT() throws Throwable {

		clear(Pom.getInstanceSH().getCheckOut());
		// inputValueElement(Pom.getInstanceSH().getCheckOut(), "1/1/2022");
		String checkOut = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckOut();
		inputValueElement(Pom.getInstanceSH().getCheckOut(), checkOut);
	}

	@Test(priority = 9)
	private void adult() throws Throwable {

		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult();

		Dropdown("byindex", Pom.getInstanceSH().getAdult(), adult);
	}

	@Test(priority = 10)
	private void children() {
		// TODO Auto-generated method stub

		Dropdown("byindex", Pom.getInstanceSH().getChildren(), "2");
	}

	@Test(priority = 11)
	private void submit() {
		// TODO Auto-generated method stub

		ClickOnElement(Pom.getInstanceSH().getSubmit());
		ClickOnElement(Pom.getInstanceCS().getRadioButton());
		ClickOnElement(Pom.getInstanceCS().getSubmit2());
		log.info("Personal information");
	}

	@Test(priority = 12)
	private void firstName() throws Throwable {

		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		inputValueElement(Pom.getInatancePP().getFirstname(), firstname);
	}

	@Test(priority = 13)
	private void lastName() throws Throwable {

		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		inputValueElement(Pom.getInatancePP().getLastName(), lastName);
	}

	@Test(priority = 14)
	private void address() throws Throwable {

		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();

		inputValueElement(Pom.getInatancePP().getAddress(), address);
	}

	@Test(priority = 15)
	private void card() throws Throwable {

		log.info("Payment Processing");

		String card = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCard();

		inputValueElement(Pom.getInatancePP().getCard(), card);
	}

	@Test(priority = 16)
	private void cardType() throws Throwable {
		// TODO Auto-generated method stub

		String cardType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardType();

		Dropdown("byindex", Pom.getInatancePP().getCardType(), cardType);
	}

	@Test(priority = 17)
	private void expiryMonth() throws Throwable {

		String expMonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpMonth();
		Dropdown("byindex", Pom.getInatancePP().getExpMonth(), expMonth);
	}

	@Test(priority = 18)
	private void expiryYear() throws Throwable {

		String expYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpYear();

		Dropdown("byVisibleText", Pom.getInatancePP().getExpYear(), expYear);
	}

	@Test(priority = 19)
	private void cvv() throws Throwable {

		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();

		inputValueElement(Pom.getInatancePP().getCvv(), cvv);
	}

	@Test(priority = 20)
	private void booking() {

		ClickOnElement(Pom.getInatancePP().getBook());
		scrollUpandDown(Pom.getInatancePP().getBook());// thread();
		log.info("Booking Confirmed");
	}

	@Test(priority = 21)
	private void screenShot() throws IOException {

		Screenshot();
	}

	@Test(priority = 22)
	private void Myitinerary() {

		ClickOnElement(Pom.getInstanceMI().getMyItinerary());
	}

	@Test(priority = 23)
	private void orderid() {

		ClickOnElement(Pom.getInstanceOC().getOrderid());
	}

	@Test(priority = 24)
	private void cancel() {

		ClickOnElement(Pom.getInstanceOC().getCancel());
	}

	@Test(priority = 25)
	private void alert() {

		Acceptalert();
	}

	@Test(priority = 26)
	private void logoutAndClose() {

		ClickOnElement(Pom.getIstanceLO().getLogout());
		close();
		log.info("Booking Session Ended");

	}
}

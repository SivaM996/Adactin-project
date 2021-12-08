package com.stepDefenition;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Mini_project_Oct_30_Maven.BaseClass;
import com.helper.File_Reader_Manager;
import com.runner.Test_runner;
import com.sdp.Page_Object_manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.Node.Scenario;

public class Step_defenition extends BaseClass {

	public static WebDriver driver = Test_runner.driver;

	public static Page_Object_manager Pom = new Page_Object_manager(driver);

//	@cucumber.api.java.Before
//	public void beforeHooks(Scenario e) {
//
//	   Optional<String> name = e.getName();
//
//		System.out.println("name");
//
//	}
//	@cucumber.api.java.After
//	public void afterHooks(Scenario e) throws Throwable {
//
//		if (e.isFaile) {
//
//			Screenshot();
//		}
//
//		String Status = e.getStatus();
//
//		System.out.println("Status : " + Status);
//
//	}

	@Given("^user Launching The Application$")
	public void user_Launching_The_Application() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

	}

	@When("user Entering The {string} In The UserName Field")
	public void user_entering_the_in_the_user_name_field(String username) {
		inputValueElement(Pom.getInstanceHp().getUsername(), username);

	}

	@When("user Entering The {string} In The Password Field")
	public void user_entering_the_in_the_password_field(String pass) {
		inputValueElement(Pom.getInstanceHp().getPass(), pass);
	}

	@Then("^user Click On The Login Page And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Page_And_It_Navigates_To_The_Search_Hotel() throws Throwable {
		ClickOnElement(Pom.getInstanceHp().getLogin());

	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();

		Dropdown("byindex", Pom.getInstanceSH().getLocation(), location);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		Dropdown("byvalue", Pom.getInstanceSH().getHotel(), hotel);

	}

	@When("user Select The {string} Type")
	public void user_select_the_type(String roomType) {
		Dropdown("byvisibletext", Pom.getInstanceSH().getRoomType(), roomType);

	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		String noOfrooms = File_Reader_Manager.getInstanceFRM().getInstanceCR().getNoOfrooms();
		Dropdown("byindex", Pom.getInstanceSH().getNoOfrooms(), noOfrooms);
	}

	@When("^user Clearing The Default Date And Entering The required Date In The CheckIn Field$")
	public void user_Clearing_The_Default_Date_And_Entering_The_required_Date_In_The_CheckIn_Field() throws Throwable {
		clear(Pom.getInstanceSH().getCheckIn());
		String checkIn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckIn();
		inputValueElement(Pom.getInstanceSH().getCheckIn(), checkIn);
	}

	@When("^user Clearing The Default Date And Enterinf The required Date In The CheckOut Field$")
	public void user_Clearing_The_Default_Date_And_Enterinf_The_required_Date_In_The_CheckOut_Field() throws Throwable {
		clear(Pom.getInstanceSH().getCheckOut());
		// inputValueElement(Pom.getInstanceSH().getCheckOut(), "1/1/2022");
		String checkOut = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCheckOut();
		inputValueElement(Pom.getInstanceSH().getCheckOut(), checkOut);
	}

	@When("^user Select the Adult Per Room$")
	public void user_Select_the_Adult_Per_Room() throws Throwable {

		String adult = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult();
		Dropdown("byindex", Pom.getInstanceSH().getAdult(), adult);
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		Dropdown("byindex", Pom.getInstanceSH().getChildren(), "2");

	}

	@Then("^User Click On The Search Button And It Navigates To The select Hotel$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_select_Hotel() throws Throwable {
		ClickOnElement(Pom.getInstanceSH().getSubmit());

	}

	@When("^user Click On The Select Radio Button$")
	public void user_Click_On_The_Select_Radio_Button() throws Throwable {
		ClickOnElement(Pom.getInstanceCS().getRadioButton());

	}

	@Then("^User Click On The Continue Button And It Navigates To The Book A Hotel$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel() throws Throwable {
		ClickOnElement(Pom.getInstanceCS().getSubmit2());

	}

	@When("^user Entering The First Name In The First Name Field$")
	public void user_Entering_The_First_Name_In_The_First_Name_Field() throws Throwable {
		String firstname = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstname();
		inputValueElement(Pom.getInatancePP().getFirstname(), firstname);
	}

	@When("^user Entering The Last Name In The Last Name Field$")
	public void user_Entering_The_Last_Name_In_The_Last_Name_Field() throws Throwable {

		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		inputValueElement(Pom.getInatancePP().getLastName(), lastName);
	}

	@When("^user Entering The Billing Address In The Billing Address Field$")
	public void user_Entering_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();

		inputValueElement(Pom.getInatancePP().getAddress(), address);
	}

	@When("^user Entering The Credit Card Number In The Credit Card Field$")
	public void user_Entering_The_Credit_Card_Number_In_The_Credit_Card_Field() throws Throwable {
		String card = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCard();

		inputValueElement(Pom.getInatancePP().getCard(), card);
	}

	@When("^user Selecting The Credit Card Type$")
	public void user_Selecting_The_Credit_Card_Type() throws Throwable {
		String cardType = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardType();

		Dropdown("byindex", Pom.getInatancePP().getCardType(), cardType);
	}

	@When("^user Selecting The Month In The Expiry Date Field$")
	public void user_Selecting_The_Month_In_The_Expiry_Date_Field() throws Throwable {
		String expMonth = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpMonth();
		Dropdown("byindex", Pom.getInatancePP().getExpMonth(), expMonth);
	}

	@When("^user Selecting The Year In The Expiry Year Field$")
	public void user_Selecting_The_Year_In_The_Expiry_Year_Field() throws Throwable {
		String expYear = File_Reader_Manager.getInstanceFRM().getInstanceCR().getExpYear();

		Dropdown("byVisibleText", Pom.getInatancePP().getExpYear(), expYear);
	}

	@When("^user Entering The cvv Number In The Cvv Number Field$")
	public void user_Entering_The_cvv_Number_In_The_Cvv_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();

		inputValueElement(Pom.getInatancePP().getCvv(), cvv);
	}

	@Then("^user Click On The Book Now Button And It Navigates To The Booking confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_The_Booking_confirmation_Page() throws Throwable {
		ClickOnElement(Pom.getInatancePP().getBook());

		implicitwait(30, TimeUnit.SECONDS);
	}

	@When("^user Click On The My Itienary Button$")
	public void user_Click_On_The_My_Itienary_Button() throws Throwable {
		ClickOnElement(Pom.getInstanceMI().getMyItinerary());

	}

	@Then("^and Navigated To Booked Itinerary Page$")
	public void and_Navigated_To_Booked_Itinerary_Page() throws Throwable {

	}

	@When("^user Click on Order Id$")
	public void user_Click_on_Order_Id() throws Throwable {
		ClickOnElement(Pom.getInstanceOC().getOrderid());

	}

	@When("^user Click On The Cancel Selected Button And Alert is Popped up$")
	public void user_Click_On_The_Cancel_Selected_Button_And_Alert_is_Popped_up() throws Throwable {
		ClickOnElement(Pom.getInstanceOC().getCancel());

	}

	@When("^user Click On Ok On The Alert Box And Booking Is Cancelled$")
	public void user_Click_On_Ok_On_The_Alert_Box_And_Booking_Is_Cancelled() throws Throwable {
		Acceptalert();

	}

	@Then("^user Click On The Logout Button And Successfully Logged Out$")
	public void user_Click_On_The_Logout_Button_And_Successfully_Logged_Out() throws Throwable {
		ClickOnElement(Pom.getIstanceLO().getLogout());

	}

}

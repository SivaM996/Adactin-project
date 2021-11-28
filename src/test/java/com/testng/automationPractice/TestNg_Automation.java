package com.testng.automationPractice;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Mini_project_Oct_30_Maven.BaseClass;
import com.automationPractice.helper.File_Reader_Manager_AP;
import com.sdp.automationpractice.Page_object_manager_AP;

public class TestNg_Automation extends BaseClass {
	static Logger log = Logger.getLogger(TestNg_Automation.class);

	public static WebDriver driver = BaseClass.getBrowser("chrome");
	public static Page_object_manager_AP Pom_Ap = new Page_object_manager_AP(driver);
	
	@Test(priority = 1)
	private void log4j() {
		PropertyConfigurator.configure("log4j.properties");

		log.info("Automation Session started");

		log.info("Initiating url");
	}

	
	@BeforeMethod
	private void url() throws Throwable {

		implicitwait(30, TimeUnit.SECONDS);
	
		String url = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		ClickOnElement(Pom_Ap.getInstanceHp().getSignIN());
	}
	@Test(priority = 2)
	private void login_page() throws Throwable {

		String particular_Data_From_Excel = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\Manual_Automation_Practice.xlsx", 2, 5);
		inputValueElement(Pom_Ap.getInstancelp().getEmail(), particular_Data_From_Excel);

		String particular_Data_From_Excel2 = Particular_Data_From_Excel(
				"C:\\Users\\91733\\Desktop\\Manual_Automation_Practice.xlsx", 3, 5);
		inputValueElement(Pom_Ap.getInstancelp().getPassword(), particular_Data_From_Excel2);

		ClickOnElement(Pom_Ap.getInstancelp().getSignInbutton());
	}
	@Test(priority = 3,timeOut = 25000)
	private void tshirtPage() throws Throwable {
		// TODO Auto-generated method stub

		String searchDress = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getSearchDress();
		inputValueElement(Pom_Ap.getInstancestp().getTshirt(), searchDress);

		ClickOnElement(Pom_Ap.getInstancestp().getSearch());

		sleep(3000);

		ActionClass("clickandhold", Pom_Ap.getInstancestp().getClickandHoldPic());

		ClickOnElement(Pom_Ap.getInstancestp().getMore());
	}
	@Test(priority = 4)
	private void moreAboutDressPage() throws Throwable {

		String shirtSize = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getShirtSize();
		Dropdown("byindex", Pom_Ap.getInstanceMop().getSize(), shirtSize);

		ClickOnElement(Pom_Ap.getInstanceMop().getAddToKart());
	}
	@Test(priority = 5)
	private void proceedToCheckOut1() {

		ClickOnElement(Pom_Ap.getInstancePoc().getProceedtocheckout());
	}
	@Test(priority = 6)
	private void summary_page() {
		ClickOnElement(Pom_Ap.getInstanceSm().getProceedToCheckOut2());
	}
	@Test(priority = 7)
	private void addressPage() throws Throwable {

		String commentSection = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getCommentSection();
		inputValueElement(Pom_Ap.getInstanceAp().getCommentSection(), commentSection);

		ClickOnElement(Pom_Ap.getInstanceAp().getProceedToChcekout3());
	}
	@Test(priority = 8)
	private void shipping_page() {

		ClickOnElement(Pom_Ap.getInstanceSp().getCheckBox());

		ClickOnElement(Pom_Ap.getInstanceSp().getProceedToCheckOut());
	}
	@Test(priority = 9)
	private void confirm_order_page() {

		ClickOnElement(Pom_Ap.getInstanceCop().getPay());

		ClickOnElement(Pom_Ap.getInstanceCop().getConfirmOrder());

	}

}

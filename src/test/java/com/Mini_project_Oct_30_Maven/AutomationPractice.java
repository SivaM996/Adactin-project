package com.Mini_project_Oct_30_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.automationPractice.helper.File_Reader_Manager_AP;
import com.sdp.automationpractice.Page_object_manager_AP;

public class AutomationPractice extends BaseClass {
	public static WebDriver driver = BaseClass.getBrowser("chrome");
	public static Page_object_manager_AP Pom_Ap = new Page_object_manager_AP(driver);

	public static void main(String[] args) throws Throwable {

		implicitwait(30, TimeUnit.SECONDS);

		String url = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);

		ClickOnElement(Pom_Ap.getInstanceHp().getSignIN());

//		String email = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getEmail();
//		inputValueElement(Pom_Ap.getInstancelp().getEmail(), email);
		
		String particular_Data_From_Excel = Particular_Data_From_Excel("C:\\Users\\91733\\Desktop\\Manual_Automation_Practice.xlsx", 2, 5);
		inputValueElement(Pom_Ap.getInstancelp().getEmail(), particular_Data_From_Excel);
		
		
//		String passwd = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getPasswd();
//		inputValueElement(Pom_Ap.getInstancelp().getPassword(), passwd);

		String particular_Data_From_Excel2 = Particular_Data_From_Excel("C:\\Users\\91733\\Desktop\\Manual_Automation_Practice.xlsx", 3, 5);
		inputValueElement(Pom_Ap.getInstancelp().getPassword(), particular_Data_From_Excel2);
		
		
		ClickOnElement(Pom_Ap.getInstancelp().getSignInbutton());

		String searchDress = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getSearchDress();
		inputValueElement(Pom_Ap.getInstancestp().getTshirt(), searchDress);

		ClickOnElement(Pom_Ap.getInstancestp().getSearch());

		sleep(3000);

		ActionClass("clickandhold", Pom_Ap.getInstancestp().getClickandHoldPic());

		ClickOnElement(Pom_Ap.getInstancestp().getMore());

		String shirtSize = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getShirtSize();
		Dropdown("byindex", Pom_Ap.getInstanceMop().getSize(), shirtSize);

		ClickOnElement(Pom_Ap.getInstanceMop().getAddToKart());

		ClickOnElement(Pom_Ap.getInstancePoc().getProceedtocheckout());

		ClickOnElement(Pom_Ap.getInstanceSm().getProceedToCheckOut2());

		String commentSection = File_Reader_Manager_AP.getInstanceFRM().getInstanceCR().getCommentSection();
		inputValueElement(Pom_Ap.getInstanceAp().getCommentSection(), commentSection);

		ClickOnElement(Pom_Ap.getInstanceAp().getProceedToChcekout3());

		ClickOnElement(Pom_Ap.getInstanceSp().getCheckBox());

		ClickOnElement(Pom_Ap.getInstanceSp().getProceedToCheckOut());

		ClickOnElement(Pom_Ap.getInstanceCop().getPay());

		ClickOnElement(Pom_Ap.getInstanceCop().getConfirmOrder());
	}

}

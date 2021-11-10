package com.Mini_project_Oct_30_Maven;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.pom.Confirm_selected_page;
import com.pom.Home_page;
import com.pom.Logout;
import com.pom.My_Itinerary;
import com.pom.Order_id_And_Cancel;
import com.pom.Payment_page;
import com.pom.Search_hotel_page;
public class Adactin_practice_2 extends BaseClass {
	public static WebDriver driver = BaseClass.getBrowser("chrome"); // null
	public static Home_page Hp = new Home_page(driver);
	public static Search_hotel_page SH = new Search_hotel_page(driver);
	public static Confirm_selected_page CS = new Confirm_selected_page(driver);
	public static Payment_page PP = new Payment_page(driver);
	public static My_Itinerary MI = new My_Itinerary(driver);
	public static Order_id_And_Cancel OC = new Order_id_And_Cancel(driver);
	public static Logout LO =new Logout(driver);

	public static void main(String[] args) throws InterruptedException, IOException {
		getURL("https://adactinhotelapp.com/index.php");
		implicitwait();
		inputValueElement(Hp.getUsername(), "SivaM996");
		inputValueElement(Hp.getPass(), "shivashiva12345");
		ClickOnElement(Hp.getLogin());
		Dropdown("byindex", SH.getLocation(), "2");
		Dropdown("byvalue", SH.getHotel(), "Hotel Cornice");
		Dropdown("byvisibletext", SH.getRoomType(), "Super Deluxe"); // thread();
		Dropdown("byindex", SH.getNoOfrooms(), "2");
		clear(SH.getCheckIn());
		inputValueElement(SH.getCheckIn(), "30/12/2021");
		clear(SH.getCheckOut());
		inputValueElement(SH.getCheckOut(), "1/1/2022");
		Dropdown("byindex", SH.getAdult(), "2");
		Dropdown("byindex", SH.getChildren(), "2");
		ClickOnElement(SH.getSubmit());
		ClickOnElement(CS.getRadioButton());
		ClickOnElement(CS.getSubmit2());
		inputValueElement(PP.getFirstname(), "siva");
		inputValueElement(PP.getLastName(), "M");
		inputValueElement(PP.getAddress(), "66A,iyappan nagar,velacherry,chennai");
		inputValueElement(PP.getCard(), "3565688823456789");
		SelectByindex(PP.getCardType(), 3);
		SelectByindex(PP.getExpMonth(), 12);
		SelectByVisibletext(PP.getExpYear(), "2022");
		inputValueElement(PP.getCvv(), "364");
		ClickOnElement(PP.getBook());
		scrollUpandDown(PP.getBook()); // thread(); 
		Screenshot();
		ClickOnElement(MI.getMyItinerary());
		ClickOnElement(OC.getOrderid());
		ClickOnElement(OC.getCancel());     
		alert();
		ClickOnElement(LO.getLogout());  	
		close();
	}
}

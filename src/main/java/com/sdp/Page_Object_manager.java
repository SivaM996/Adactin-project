package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Confirm_selected_page;
import com.pom.Home_page;
import com.pom.Logout;
import com.pom.My_Itinerary;
import com.pom.Order_id_And_Cancel;
import com.pom.Payment_page;
import com.pom.Search_hotel_page;

public class Page_Object_manager {

	public WebDriver driver; // --->null

	private Home_page Hp;
	private Search_hotel_page SH;
	private Confirm_selected_page CS;
	private Payment_page PP;
	private My_Itinerary MI;
	private Order_id_And_Cancel OC;
	private Logout LO;

	public Page_Object_manager(WebDriver driver2) {
		this.driver = driver2;

	}

	public Home_page getInstanceHp() {
		if (Hp == null) {
			Hp = new Home_page(driver);
		}
		return Hp;
	}

	public Search_hotel_page getInstanceSH() {
		if (SH == null) {
			SH = new Search_hotel_page(driver);
		}
		return SH;
	}

	public Confirm_selected_page getInstanceCS() {
		if (CS == null) {
			CS = new Confirm_selected_page(driver);
		}
		return CS;
	}

	public Payment_page getInatancePP() {
		if (PP == null) {
			PP = new Payment_page(driver);
		}
		return PP;
	}

	public My_Itinerary getInstanceMI() {
		if (MI == null) {
			MI = new My_Itinerary(driver);

		}
		return MI;
	}

	public Order_id_And_Cancel getInstanceOC() {
		if (OC == null) {
			OC = new Order_id_And_Cancel(driver);

		}
		return OC;

	}

	public Logout getIstanceLO() {
		if (LO == null) {
			LO = new Logout(driver);
		}
		return LO;
	}

}

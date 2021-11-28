package com.sdp.automationpractice;

import org.openqa.selenium.WebDriver;

import com.Mini_project_Oct_30_Maven.BaseClass;
import com.pom.AutomationPractice.Address_page;
import com.pom.AutomationPractice.Confirm_order_page;
import com.pom.AutomationPractice.Home_page;
import com.pom.AutomationPractice.Login_page;
import com.pom.AutomationPractice.More_AboutDress_page;
import com.pom.AutomationPractice.Proceed_to_Checkout_1;
import com.pom.AutomationPractice.Search_Tshirt_page;
import com.pom.AutomationPractice.Shipping_page;
import com.pom.AutomationPractice.Summary_page;

public class Page_object_manager_AP {

	public WebDriver driver;

	private Home_page hp;
	private Login_page lp;
	private Search_Tshirt_page stp;
	private More_AboutDress_page Mop;
	private Proceed_to_Checkout_1 Pot1;
	private Summary_page Sm;
	private Address_page Ap;
	private Shipping_page Sp;
	private Confirm_order_page Cop;

	public Page_object_manager_AP(WebDriver driver2) {
		this.driver = driver2;
	}

	public Home_page getInstanceHp() {
		if (hp == null) {
			hp = new Home_page(driver);
		}
		return hp;
	}

	public Login_page getInstancelp() {
		if (lp == null) {
			lp = new Login_page(driver);
		}
		return lp;
	}

	public Search_Tshirt_page getInstancestp() {

		if (stp == null) {
			stp = new Search_Tshirt_page(driver);
		}
		return stp;
	}

	public More_AboutDress_page getInstanceMop() {
		if (Mop == null) {
			Mop = new More_AboutDress_page(driver);
		}
		return Mop;
	}

	public Proceed_to_Checkout_1 getInstancePoc() {
		if (Pot1 == null) {
			Pot1 = new Proceed_to_Checkout_1(driver);
		}
		return Pot1;

	}

	public Summary_page getInstanceSm() {
		if (Sm == null) {
			Sm = new Summary_page(driver);
		}
		return Sm;

	}

	public Address_page getInstanceAp() {
		if (Ap == null) {
			Ap = new Address_page(driver);
		}
		return Ap;

	}

	public Shipping_page getInstanceSp() {
		if (Sp == null) {
			Sp = new Shipping_page(driver);
		}
		return Sp;
	}

	public Confirm_order_page getInstanceCop() {
		if (Cop == null) {
			Cop = new Confirm_order_page(driver);
		}
		return Cop;
	}

}

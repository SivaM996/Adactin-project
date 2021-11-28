package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	@BeforeSuite
	private void setProperty() {
		System.out.println("set property");
	}

	@BeforeTest
	private void browserLaunch() {
		System.out.println("launching the browser");
	}

	@BeforeClass
	private void url() {
		System.out.println("Launching the url");
	}

	@Test
	private void women() {
		System.out.println("Women");

	}

	@Test
	private void dress() {
		System.out.println("Dress");

	}

	@Test
	private void tshirt() {

		System.out.println("Tshirt");
	}

	@BeforeMethod
	private void signin() {
		System.out.println("signin");
	}

	@AfterMethod
	private void signOut() {
		System.out.println("sign out");
	}

	@AfterClass
	private void homepage() {
		System.out.println("Home page");
	}

	@AfterTest
	private void close() {
		System.out.println("close");
	}

	@AfterSuite
	private void cookies() {
		System.out.println("Delete cookies");
	}

}

package com.testng.features;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Parameterized_test {
	@BeforeTest
	@Parameters({"Username"})
	private void credentials(@Optional("smith")String username) {
		System.out.println("User name is "+ username);
	//	System.out.println("Password is "+ password);
	}

	
	@AfterTest
	@Parameters({"gmail","password1"})
	private void details(@Optional("psyko")String username,String password) {
		System.out.println("User name is "+ username);
		System.out.println("Password is "+ password);
	}

}

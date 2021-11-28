package com.testng.features;

import org.testng.annotations.Test;

public class Timeout_features {

	
	@Test(timeOut = 8000)
	private void login() throws Throwable {

		
		System.out.println("browser launch");
		System.out.println("user enters the credentials");
		Thread.sleep(3000);
		System.out.println("click on login button");
		Thread.sleep(3000);
		System.out.println("navigates to home page");
		Thread.sleep(1000);
		System.out.println("click on some operations");
	}
}

package com.testng.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider {

	@Test(dataProvider = "data")
	private void credentials(String name, int password) {
		System.out.println("Username :" +name);
		System.out.println("password  :" +password);

	}

	@DataProvider
	private Object[][] data() {
return new Object[][] {
	

	{"starc", 1234},
	{"smith", 4321},
	{"vinay",38359},
	{"vinoth",46556}
	

    };
    }
	}


	

package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Expected_Exeption {

	@Test
	private void Demo() {

	String a= "starc";
	String b= "star";
	Assert.assertNotEquals(a, a);
	System.out.println("validation");

	}

}

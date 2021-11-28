package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_test_demo {
	@Test(retryAnalyzer = Retry.class )
	private void username() {
		String Expected_username = "Starc";
		String Actual_username = "Starc";

		Assert.assertEquals(Expected_username, Actual_username);

	}

	@Test(retryAnalyzer = Retry.class )
	private void password() {
		String Expected_password = "starc@123";
		String Actual_pasword = "star";

		Assert.assertEquals(Expected_password, Actual_pasword);
	}

}

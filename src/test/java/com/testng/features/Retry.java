package com.testng.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	int start = 1;
	int end = 5;
	
	public boolean retry(ITestResult result) {
		if(start<=end) {
			start++;
			return true;  // ---> invoke the failed method
		}
			
		return false;
	}

}

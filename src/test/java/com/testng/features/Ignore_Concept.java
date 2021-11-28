package com.testng.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
  
	@Ignore
	@Test
	private void dress() {
		System.out.println("dress");
	}

	@Test
	private void tshirts() {
		System.out.println("T shirts");
	}

	@Test
	private void books() {
		System.out.println("books");
	}

	@Test(enabled = false)
	private void children() {
		System.out.println("children");
	}
}



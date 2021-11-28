package com.testng.features;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups = "music")
	private void wynk() {
		System.out.println("wynk music app");
	}
	@Test(groups = "music")
	private void spotify() {
		System.out.println("music app");
	}
	@Test(groups = "social media")
	private void facebook() {
		System.out.println("social media app");
	}
	@Test(groups = "social media")
	private void instagram() {
		System.out.println("instagram");
	}
	@Test(groups = "book")
	private void books() {
		System.out.println("books");
	}
	@Test(groups = "book")
	private void notes() {
		System.out.println("notes");
	}

}

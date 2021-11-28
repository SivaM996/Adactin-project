package com.automationPractice.helper;

public class File_Reader_Manager_AP {

	
	private File_Reader_Manager_AP() {
		
	}
	
	public static File_Reader_Manager_AP getInstanceFRM() {
		File_Reader_Manager_AP reader = new File_Reader_Manager_AP();
		return reader;
	   
	}
	
	
	public Configuration_Reader_AP getInstanceCR() throws Throwable {
		Configuration_Reader_AP reader = new Configuration_Reader_AP();
		return reader;
	}
	
	
}


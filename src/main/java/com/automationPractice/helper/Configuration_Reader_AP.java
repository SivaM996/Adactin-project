package com.automationPractice.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader_AP {

	public static Properties p;

	public Configuration_Reader_AP() throws Throwable {
		File f = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\src\\main\\java\\com\\properties\\Automation.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getURL() throws Throwable {

		String url = p.getProperty("URL");
		return url;
	}

	public String getEmail() throws Throwable {

		String email = p.getProperty("Email");
		return email;
	}

	public String getPasswd() {

		String passwd = p.getProperty("password");
		return passwd;
	}

	public String getSearchDress() {

		String Searchdress = p.getProperty("SearchDress");
		return Searchdress;
	}

	public String getShirtSize() {

		String shirtSize = p.getProperty("ShirtSize");
		return shirtSize;

	}

	public String getCommentSection() {

		String comment = p.getProperty("CommentSection");
		return comment;
		
	}
}

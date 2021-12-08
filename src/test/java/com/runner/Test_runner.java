package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Mini_project_Oct_30_Maven.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature",

		glue = "com.stepDefenition", 
		monochrome = true, 
		strict = true,
		dryRun = false,
		plugin = {

				"html:Report/HtmlReport.html", "json:JsonReport/Report.json", "pretty",
				//"com.Cucumber.listener.ExtentCucumberFormatter:Reports/File.html"

		}

)

public class Test_runner {
	public static WebDriver driver; // ---->null driver

	@BeforeClass
	public static void Set_Up() {

		driver = BaseClass.getBrowser("chrome");
	}

	@AfterClass
	public static void Tear_down() {

		driver.close();

	}

}

package com.Mini_project_Oct_30_Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RunnerClass extends BaseClass {
	public static WebDriver driver;// null

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getBrowser("chrome");

		getURL("https://adactinhotelapp.com/index.php");
		//implicitwait();
		maximise();
		

		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		inputValueElement(username, "SivaM996");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		inputValueElement(pass, "shivashiva12345");

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		ClickOnElement(login);

		WebElement location = driver.findElement(By.id("location"));
		Dropdown("byindex", location, "2");
		
		
		WebElement hotel = driver.findElement(By.name("hotels"));
	    Dropdown("byvalue", hotel, "Hotel Cornice");
		// Select h = new Select(hotel);
//		h.selectByValue("Hotel Cornice");

		WebElement roomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Dropdown("byvisibletext", roomType, "Super Deluxe")	;	thread();
//		Select R = new Select(roomType);
//		R.selectByVisibleText("Super Deluxe");

		WebElement noOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
        Dropdown("byindex", noOfRooms, "2");
// Select NR = new Select(noOfRooms);
		// NR.selectByIndex(2);

		WebElement CheckIn = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		clear(CheckIn);
		inputValueElement(CheckIn, "30/12/2021");

		WebElement Checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		clear(Checkout);
		inputValueElement(Checkout, "1/1/2022");

		WebElement Adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Dropdown("byindex", Adult, "2");

		WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
		Dropdown("byindex", children, "2");	
		
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		ClickOnElement(submit);

		WebElement radioButton = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		ClickOnElement(radioButton);

		WebElement Submit2 = driver.findElement(By.xpath("//input[@name='continue']"));
		ClickOnElement(Submit2);

		WebElement Firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		inputValueElement(Firstname, "siva");

		WebElement LastName = driver.findElement(By.xpath("//input[@name='last_name']"));
		inputValueElement(LastName, "M");

		WebElement Address = driver.findElement(By.xpath("//textarea[@name='address']"));
		inputValueElement(Address, "66A,iyappan nagar,velacherry,chennai");

		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		inputValueElement(card, "3565688823456789");

		WebElement cardType = driver.findElement(By.xpath("//select[@name='cc_type']"));
		SelectByindex(cardType, 3);

		WebElement ExpMonth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		SelectByindex(ExpMonth, 12);

		WebElement ExpYear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		SelectByVisibletext(ExpYear, "2022");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		inputValueElement(cvv, "364");

		WebElement book = driver.findElement(By.xpath("//input[@name='book_now']"));
		ClickOnElement(book);
		scrollUpandDown(book);

		thread(3000);

		Screenshot();

		WebElement myItinerary = driver.findElement(By.xpath("//input[@name='my_itinerary']"));
		ClickOnElement(myItinerary);

		WebElement orderid = driver.findElement(By.xpath("(//input[@name='check_all'])"));
		ClickOnElement(orderid);

		WebElement cancel = driver.findElement(By.xpath("//input[@name='cancelall']"));
		ClickOnElement(cancel);

		// driver.switchTo().alert().accept();
		alert();

		WebElement logout = driver.findElement(By.xpath("//input[@id='logout']"));
		ClickOnElement(logout);

		close();

	}

}

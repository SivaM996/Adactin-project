package com.Mini_project_Oct_30_Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		try {
			if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");

				driver = new ChromeDriver();

			} else if (type.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//geckodriver.exe");

				driver = new FirefoxDriver();

			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}

	public static void ClickOnElement(WebElement element) {
		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getURL(String url) {
		driver.get(url);
	}

	public static void maximise() {
		driver.manage().window().maximize();

	}

	public static void quit() {
		driver.quit();
	}

	public static void close() {
		driver.close();
	}

	public static void Screenshot() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Mini_project_Oct_30_Maven\\ScreenShot\\adactin1.png");
		FileUtils.copyFile(source, destination);

	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void selectByValue(WebElement location, String NewYork) {
		Select loc = new Select(location);
		loc.selectByValue(NewYork);
	}

	public static void SelectByindex(WebElement location, int NewYork) {
		Select loc = new Select(location);
		loc.selectByIndex(NewYork);
	}

	public static void SelectByVisibletext(WebElement location, String NewYork) {
		Select loc = new Select(location);
		loc.selectByVisibleText(NewYork);
	}

	public static void Dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}
	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void alert() {
		driver.switchTo().alert().accept();

	}

	public static void thread() throws InterruptedException {
		Thread.sleep(8000);
	}

	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

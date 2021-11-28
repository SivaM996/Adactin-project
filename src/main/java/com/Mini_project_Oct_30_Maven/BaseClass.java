package com.Mini_project_Oct_30_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;
	
	public static String value;

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

	public static void implicitwait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static void ExplicitWait(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void Fluent_Wait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
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

	public static void minimizwWiindow() {
		Dimension d = new Dimension(500, 500);
		driver.manage().window().setSize(d);

	}

	public static void ActionClass(String act, WebElement element) {
		try {
			Actions a = new Actions(driver);
			if (act.equalsIgnoreCase("movetoelement")) {
				a.moveToElement(element).build().perform();
			} else if (act.equalsIgnoreCase("clickOn")) {
				a.click(element).build().perform();
			} else if (act.equalsIgnoreCase("doubleclick")) {
				a.contextClick(element).build().perform();
			} else if (act.equalsIgnoreCase("click")) {
				a.click().build().perform();
			}else if (act.equalsIgnoreCase("clickandhold")) {
				a.clickAndHold(element).build().perform();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		element.clear();

	}

	public static void Acceptalert() {
		driver.switchTo().alert().accept();

	}

	public static void RejectAlert() {
		driver.switchTo().alert().dismiss();
	}

	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void scrollUpandDown(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frame(String frame) {
		try {
			if (frame.equalsIgnoreCase("frame1")) {
				driver.switchTo().frame(0);
			} else if (frame.equalsIgnoreCase("frame2")) {
			} else {
				driver.switchTo().defaultContent();
			}
		} catch (Exception e) {
       e.printStackTrace();
		}
	}

	public static String Particular_Data_From_Excel(String path, int row_index, int cell_index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
		    value = cell.getStringCellValue();
			
		}else if(cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int val = (int) numericCellValue;
		    value = String.valueOf(val);
			
			
		}
		
		return value;

		
	}
}

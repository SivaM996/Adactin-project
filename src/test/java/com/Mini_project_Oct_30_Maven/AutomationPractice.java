package com.Mini_project_Oct_30_Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutomationPractice extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91733\\Desktop\\eclipse-workspace\\Selenium_classes\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		implicitwait();
		driver.get("http://automationpractice.com/index.php");
		maximise();

		WebElement signIN = driver.findElement(By.xpath("//a[@class='login']"));
		ClickOnElement(signIN);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		inputValueElement(email, "abdf54387cd@gmail.com");

		WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputValueElement(passwrd, "djnsng");

		WebElement signInbutton = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		ClickOnElement(signInbutton);

		WebElement SearchBox = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		inputValueElement(SearchBox, "T shirt");

		WebElement Button = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		ClickOnElement(Button);

		Thread.sleep(3000);
		WebElement pic = driver.findElement(By.xpath("//img[@width='250']"));

		WebElement more = driver.findElement(By.xpath("//span[contains(text(),'More')]"));

		Actions action = new Actions(driver);
		action.clickAndHold(pic).build().perform();
		more.click();

		WebElement select = driver.findElement(By.xpath("//select[@name='group_1']"));
		Dropdown("byindex", select, "1");

		WebElement Addtokart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		ClickOnElement(Addtokart);

		WebElement Proceedtocheckout = driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"));
		ClickOnElement(Proceedtocheckout);

		WebElement ProceedToCheckout2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		ClickOnElement(ProceedToCheckout2);

		WebElement addComment = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		inputValueElement(addComment, "this is selenium project");

		WebElement ProceedToCheckout3 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ClickOnElement(ProceedToCheckout3);

		WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox']"));
		ClickOnElement(checkbox1);

		WebElement ProceedToCheckout4 = driver.findElement(By.xpath("//*[@id=\'form\']/p/button/span"));
		ClickOnElement(ProceedToCheckout4);

		WebElement pay = driver.findElement(By.xpath("//a[@class='bankwire']"));
		ClickOnElement(pay);

		WebElement confirmOrder = driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button/span"));
		ClickOnElement(confirmOrder);
	}

}

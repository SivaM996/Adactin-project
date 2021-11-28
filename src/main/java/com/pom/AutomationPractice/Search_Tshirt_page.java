package com.pom.AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Tshirt_page {
	
	public WebDriver driver;
	
	public Search_Tshirt_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement Tshirt;
	 
	@FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement Search;
	
	@FindBy(xpath = "//img[@width='250']")
	private WebElement clickandHoldPic;
	
	@FindBy(xpath = "//span[contains(text(),'More')]")
	private WebElement more;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getClickandHoldPic() {
		return clickandHoldPic;
	}

	public WebElement getMore() {
		return more;
	}
	
}

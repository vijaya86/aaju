package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	@FindBy(linkText = "//*[text()='Sign In']")
	public static WebElement loginlnk;

	@FindBy(className = "//input[text()='Login']")
	public static WebElement userNameTxt;
	
	@FindBy(xpath="//*[text()='Login']")
	public static WebElement passwordTxt;
	
	@FindBy(xpath="//*[text()='Login']")
	public static WebElement LoginButton;
	
	
public void test(int rowNum) {
	driver.findElement(By.xpath("//*[@class='User Grid']//tr["+rowNum+"]")).click();
}
	public static void login(String username,String pwd) {
		loginlnk.click();
		userNameTxt.sendKeys(username);
		passwordTxt.sendKeys(pwd);
		LoginButton.click();
		
	}
}

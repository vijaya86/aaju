package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegestrationPage {
	WebDriver driver;
	HomePage homepage = HomePage(driver);
public  RegestrationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
private HomePage HomePage(WebDriver driver2) {
	// TODO Auto-generated method stub
	return null;
}
@FindBy(xpath="//*[text()='Login']")
public WebElement loginlnk;



}

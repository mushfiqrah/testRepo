package com.tt.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "username")
	WebElement username;
	
	public WebElement username() {
		return username;
	}
	
	@FindBy(name = "password")
	WebElement password;
	
	public WebElement password() {
		return password;
	}
	
}

package com.tt.common;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBase {
	 WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.driver.chromedriver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.yahoo.com/");
		}
	
	public void closeBrowser() {
		driver.close();
	}
}

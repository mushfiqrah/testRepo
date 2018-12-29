package com.tt.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Given("^I am navigate to Yahoo home page$")
	public void i_am_navigate_to_Yahoo_home_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	driver= new ChromeDriver();
	driver.get("https://www.yahoo.com/");
	driver.findElement(By.id("uh-signin")).click();
	}

	@When("^I put my email ID, password, select sign in, choose Inbox$")
	public void i_put_my_email_ID_password_select_sign_in_choose_Inbox() throws Throwable {
	 driver.findElement(By.name("username")).sendKeys("mushfiqrahman11@yahoo.com");
	driver.findElement(By.name("signin")).click();
	//driver.findElement(By.name("password")).sendKeys("numanmd11");
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

	@Then("^I can see my new and undeleted emails$")
	public void i_can_see_my_new_and_undeleted_emails() throws Throwable {
	    
	}
}

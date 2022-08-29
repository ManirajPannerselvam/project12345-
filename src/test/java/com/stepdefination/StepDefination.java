package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	WebDriver driver;

	@Given("user launch facebook url")
	public void user_launch_facebook_url() {
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@When("user enter valid username{string}and valid password{string}")
	public void user_enter_valid_username_and_valid_password(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		System.out.println(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		System.out.println(password);

	}

	@And("user enter login button")
	public void user_enter_login_button() {
		driver.findElement(By.name("login")).click();

	}

	@Then("user validate home page")
	public void user_validate_home_page() {
		driver.close();
		driver.quit();
	}

}

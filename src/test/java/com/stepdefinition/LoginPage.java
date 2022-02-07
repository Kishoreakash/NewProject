package com.stepdefinition;
	import org.junit.Assert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	


import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	 WebDriver driver;	
		
		@Given("user is in the login page")
		public void user_is_in_the_login_page() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
		}

		@When("user should enter username and password")
		public void user_should_enter_username_and_password() {
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys("kishoreakash");
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("QZA335");
		}

		@When("user should enter login button")
		public void user_should_enter_login_button() {
			WebElement btnLogin = driver.findElement(By.id("login"));
			btnLogin.click();
		}
	
		@Then("user should verify success message")
		public void user_should_verify_success_message() {
			String title = driver.getTitle();
			boolean b = title.contains("Adactin");
			Assert.assertTrue("verify title",b);
			driver.quit();
		}
}


		
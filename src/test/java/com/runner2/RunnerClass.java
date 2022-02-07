package com.runner2;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"},glue= {"com.stepdefinition"})

public class RunnerClass {
	 WebDriver driver;	
		
		@Given("user is in the login page")
		public void user_is_in_the_login_page() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
		
	}

	@When("user should enter the {string} and {string}")
	public void user_should_enter_the_and(String username, String password) {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("username");
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.sendKeys("password");
	}

	@When("user should enter the  search page details of {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the_search_page_details_of(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
		WebElement dDnLo = driver.findElement(By.id("location"));	
		dDnLo.sendKeys(location);
		WebElement dDnHo = driver.findElement(By.id("hotels"));	
		dDnHo.sendKeys(hotels);
		WebElement dDnRt = driver.findElement(By.id("room_type"));	
		dDnRt.sendKeys(roomType);
		WebElement dDnNo = driver.findElement(By.id(" no_of_rooms"));	
		dDnNo.sendKeys(noOfRooms);
		WebElement dDnDate = driver.findElement(By.id("datepick_in"));	
		dDnDate.sendKeys(checkInDate);
		WebElement dDnDatePout = driver.findElement(By.id("datepick_out"));	
		dDnDatePout.sendKeys(checkOutDate);
		WebElement dDnAdult = driver.findElement(By.id("adult_room"));	
		dDnAdult.sendKeys(adultsPerRoom);
		WebElement dDnChild = driver.findElement(By.id("child_room"));	
		dDnChild.sendKeys(childrenPerRoom);
		}

	@When("user should click the search button")
	public void user_should_click_the_search_button() {
		WebElement BtnSearch = driver.findElement(By.id("Submit"));	
		BtnSearch.click();
		
	}

	@When("user should click the preferred hotel")
	public void user_should_click_the_preferred_hotel() {
		WebElement raBtn = driver.findElement(By.id("radiobutton_0"));
		raBtn.click();
	}

	@When("user should click continue")
	public void user_should_click_continue() {
		WebElement con = driver.findElement(By.id("continue"));
		con.click();
		
	}

	@When("user should enter the select page details of {string},{string},{string},{string}{string}credit card type{string}<expiry date month>{string}expiry date year>{string}{int}\"")
	public void user_should_enter_the_select_page_details_of_credit_card_type_expiry_date_month_expiry_date_year(String firstname, String lastname, String billingaddress, String creditcardno, String creditcardtype, String expirymonth, String expiryyear, String cvvno) {
		WebElement dDnLo = driver.findElement(By.id("first_name"));	
		dDnLo.sendKeys(firstname);
		WebElement dDnHo = driver.findElement(By.id("last_name"));	
		dDnHo.sendKeys(lastname);
		WebElement dDnRt = driver.findElement(By.id("address"));	
		dDnRt.sendKeys(billingaddress);
		WebElement dDnNo = driver.findElement(By.id(" cc_num"));	
		dDnNo.sendKeys(creditcardno);
		WebElement dDnDate = driver.findElement(By.id("cc_type"));	
		dDnDate.sendKeys(creditcardtype);
		WebElement dDnMon = driver.findElement(By.id("cc_exp_month"));	
		dDnMon.sendKeys(expirymonth);
		WebElement dDnYear = driver.findElement(By.id("cc_exp_year"));	
		dDnYear.sendKeys(expiryyear);
		WebElement dDnCvv = driver.findElement(By.id("cc_cvv"));	
		dDnCvv.sendKeys(cvvno);
	}

	@Then("user should click booknow")
	public void user_should_click_booknow() {
		WebElement bookNow = driver.findElement(By.id("book_now"));	
		bookNow.click();
		
	}

	@Then("print the order ID")
	public void print_the_order_ID() {
		WebElement order = driver.findElement(By.id("order_no"));
		String orderId = order.getAttribute("value");
		System.out.println(orderId);
	}




	
}

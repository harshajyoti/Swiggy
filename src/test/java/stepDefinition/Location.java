package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Location {
	
	WebDriver driver = new EdgeDriver();
	HomePage hp = new HomePage();
	
	@Given("I am on the home page of Swiggy application")
	public void i_am_on_the_home_page_of_swiggy_application() {

		hp.home(driver);
	
	}
	@When("I enter the location of the desired place")
	public void i_enter_the_location_of_the_desired_place() {
		
		hp.home(driver);
		hp.location(driver);
		
	}
	@When("I click on the location Button")
	public void i_click_on_the_location_button() {

		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		
	}

//////////////////////////// Tag 2 //// for Updating Location//////////////////////////////	
	
	@When("I click on the Other option in the left-upper side")
	public void i_click_on_the_other_option_in_the_left_upper_side() {

		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		hp.UpdateLocation(driver);
	
	}
	@When("I send location in string format")
	public void i_send_location_in_string_format() {
		
		System.out.println("i_send_location_in_string_format");
		
	}
	@When("I will select the exact location Button")
	public void i_will_select_the_exact_location_button() {

		System.out.println("i_will_select_the_exact_location_button");
	}
	
}

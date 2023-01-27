package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import homePage.HomePage;
import io.cucumber.java.en.When;

public class Dish {
	
	WebDriver driver = new EdgeDriver();
	HomePage hp = new HomePage();

	@When("I click on the search Button")
	public void i_click_on_the_search_button() {
	
		System.out.println("i_click_on_the_search_button");
	
	}
	@When("I will get the food items name")
	public void I_will_get_the_food_items_name() {

		System.out.println("I_will_get_the_food_items_name");
		
		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		hp.searchbtn(driver);
		hp.searchItem(driver);
		hp.ItemName(driver);
		
	}
	@When("I will get the food items price")
	public void I_will_get_the_food_items_price() {

		System.out.println("price");
		try
		{
			hp.home(driver);
			hp.location(driver);
			hp.locationBtn(driver);
			hp.searchbtn(driver);
			hp.searchItem(driver);
			hp.ItemPrice(driver);
		}
		catch (Exception e) {
			System.out.println("I_will_get_the_food_items_price");
		}
	}
	
/////////////////////// scene 2 //////////////// add to cart ////////////////	
	
	@When("I click on the ADD Button")
	public void i_click_on_the_add_button() {
		
		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		hp.searchbtn(driver);
		hp.searchItem(driver);
		hp.AddToCart(driver);
	
	}

}

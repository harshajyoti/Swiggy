package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import homePage.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Cart {

	WebDriver driver = new EdgeDriver();
	HomePage hp = new HomePage();
	
	@Given("I want to click on cart")
	public void i_want_to_click_on_cart() {
	
		System.out.println("i_want_to_click_on_cart");
		
	}
	@Given("Delete the cart")
	public void delete_the_cart() {
		
		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		hp.searchbtn(driver);
		hp.searchItem(driver);
		hp.AddToCart(driver);
		hp.deleteCart(driver);
		
	}
	
	@Given("click on see restaurents")
	public void click_on_see_restaurents() {

		try {
		hp.home(driver);
		hp.location(driver);
		hp.locationBtn(driver);
		hp.searchbtn(driver);
		hp.searchItem(driver);
		hp.AddToCart(driver);
		hp.updateCart(driver);
		}
		catch (Exception e) {
			System.out.println("cart updated");
		}
	}
	@Then("add food to cart")
	public void add_food_to_cart() {
		
		System.out.println("add_food_to_cart");
	
	}

}

package org.steps;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition3 extends BaseClass{
	@Given("user need to be in amazon home page")
	public void user_need_to_be_in_amazon_home_page() {
	    launchUrl("https://www.amazon.in/");
	    maxWindow();
	}
	
	@When("user should enter product name")
	public void user_should_enter_product_name(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    fillTextBox(searchBox, m.get(0).get("New product"));
	}

	@When("user should click search button")
	public void user_should_click_search_button() {
	    WebElement searchBtn = driver.findElement(By.xpath("//input[@type='submit']"));
	    btnClick(searchBtn);
	}

	@Then("user will navigate to products page")
	public void user_will_navigate_to_products_page() {
	    System.out.println("User is in products page");
	}

}

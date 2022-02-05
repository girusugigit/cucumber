package org.steps;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass{
	@Given("user need to be in login page")
	public void user_need_to_be_in_login_page() {
		launchUrl("https://en-gb.facebook.com/");
		maxWindow();
	}

	@When("user should enter invalid {string} and invalid {string}")
	public void user_should_enter_invalid_and_invalid(String user, String pass) {
		WebElement username = driver.findElement(By.id("email"));
		fillTextBox(username, user);
		WebElement password = driver.findElement(By.id("pass"));
		fillTextBox(password, pass);
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		WebElement loginBtn = driver.findElement(By.name("login"));
		btnClick(loginBtn);
	}

	@Then("user will redirect to invalid credential page")
	public void user_will_redirect_to_invalid_credential_page() {
		System.out.println("User is in invalid credential page");
	}

}

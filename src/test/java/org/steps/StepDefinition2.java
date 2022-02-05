package org.steps;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass{

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement loginBtn = driver.findElement(By.name("login"));
	    btnClick(loginBtn);
	}

	@Then("user will navigate to invalid credential page")
	public void user_will_navigate_to_invalid_credential_page() {
		System.out.println("User is in invalid credential page");
		Assert.assertTrue(false);
	}

}

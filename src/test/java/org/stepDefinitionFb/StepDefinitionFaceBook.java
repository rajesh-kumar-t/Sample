package org.stepDefinitionFb;

import org.base.FbHelperClass;
import org.fbPojo.FbPojoClass;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionFaceBook extends FbHelperClass {

	
	@Given("User is in Facebook login page")
	public void user_is_in_Facebook_login_page() {

		
	}

	@When("User enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {

		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "rajesh@gmail.com");
		fillTextBox(F.getPasswd(), "Rajesh-123");

	}

	@When("User clicks on login buttion")
	public void user_clicks_on_login_buttion() {

		FbPojoClass F = new FbPojoClass();
		btnClick(F.getLgnbtn());
	}

	@Then("User should be in invalid login page")
	public void user_should_be_in_invalid_login_page() {

		String C = driver.getCurrentUrl();

		if (C.contains("privacy_mutation_token")) {

			System.out.println("User is in invali credentials page");

		}

		else {
			System.out.println("User is not in invalid credentials page");
		}
	}

	@When("User have to enter valid email and invalid password")
	public void user_have_to_enter_valid_email_and_invalid_password() {

		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "rajesh@gmail.com");
		fillTextBox(F.getPasswd(), "Rajesh-123");

	}

	@When("User have to click login buttion")
	public void user_have_to_click_login_buttion() {

		FbPojoClass F = new FbPojoClass();
		btnClick(F.getLgnbtn());

	}

	@Then("User have to reach invalid credentials page")
	public void user_have_to_reach_invalid_credentials_page() {

		String C = driver.getCurrentUrl();

		if (C.contains("privacy_mutation_token")) {

			System.out.println("User is in invalid credentials page");

		}

		else {
			System.out.println("User is not in invalid credentials page");
		}

	}

	@When("User have to enter invalid email and invalid password")
	public void user_have_to_enter_invalid_email_and_invalid_password() {

		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "rajesh@gmail.com");
		fillTextBox(F.getPasswd(), "Rajesh-123");

	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {

		FbPojoClass F = new FbPojoClass();
		btnClick(F.getLgnbtn());
		Thread.sleep(3000);

	}

	@When("User enters invalid email and valid password")
	public void user_enters_invalid_email_and_valid_password() {
		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "rajesh@gmail.com");
		fillTextBox(F.getPasswd(), "Rajesh@123");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
		FbPojoClass F = new FbPojoClass();
		btnClick(F.getLgnbtn());
		Thread.sleep(3000);

	}

	@Then("User should be landed in invalid login page")
	public void user_should_be_landed_in_invalid_login_page() {

		String C = driver.getCurrentUrl();

		if (C.contains("privacy_mutation_token")) {

			System.out.println("User is in invalid credentials page");

		}

		else {
			System.out.println("User is not in invalid credentials page");
		}

	}

	@When("User enters valid email and invalid password")
	public void user_enters_valid_email_and_invalid_password() {

		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "Kumar@gmail.com");
		fillTextBox(F.getPasswd(), "kumar@123");
	}

	@When("User enters invalid email and invalid password")
	public void user_enters_invalid_email_and_invalid_password() {

		FbPojoClass F = new FbPojoClass();
		fillTextBox(F.getEmailid(), "Rajeshkumar@gmail.com");
		fillTextBox(F.getPasswd(), "RajeshKumar@123");

	}

	@Given("User is currently in facebook login page")
	public void user_is_currently_in_facebook_login_page() {


	}

}

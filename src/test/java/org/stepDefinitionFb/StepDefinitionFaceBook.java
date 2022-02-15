package org.stepDefinitionFb;

import org.base.FbHelperClass;
import org.fbPojo.FbPojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionFaceBook extends FbHelperClass{

	@Given("User is in Facebook login page")
	public void user_is_in_Facebook_login_page() {
		
		lauchBrowser();
		loadUrl("https://www.facebook.com");
		maxBrowser();
	   
	}

	@When("User enter invalid username and valid password")
	public void user_enter_invalid_username_and_valid_password() {
	   
		FbPojoClass F=new FbPojoClass();
		fillTextBox(F.getEmailid(), "rajesh@gmail.com");
		fillTextBox(F.getPasswd(), "Rajesh-123");
		
	}

	@When("User clicks on login buttion")
	public void user_clicks_on_login_buttion() {
	   
		FbPojoClass F=new FbPojoClass();
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

	
}

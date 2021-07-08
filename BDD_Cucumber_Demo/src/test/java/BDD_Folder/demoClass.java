package BDD_Folder;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoClass {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside Given statement");
	}

	@When("user enters username and passwd")
	public void user_enters_username_and_passwd() {
	    System.out.println("Inside when statement");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    System.out.println("Inside And statement");
	}
	
	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("Inside Then statement");
	}

	/*
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and passwd")
	public void user_enters_username_and_passwd() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	*/
}

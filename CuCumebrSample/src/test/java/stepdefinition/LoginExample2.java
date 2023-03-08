package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginExample2 {
	@Given("^User navigates to mycontactform$")
	public void given() throws Throwable {
		System.out.println("Page Loaded");
	}
	@And("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void and(String username, String password)throws Throwable{
		System.out.println("Username : " + username);
		System.out.println("Password : " + password);
	}
	
	@Then("^login must be successful$")
	public void then() throws Throwable {

		System.out.println("Driver Closed");
	}
}

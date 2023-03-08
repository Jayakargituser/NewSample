package stepdefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleRecords {
	
	
  @Before
  public void before()
  {
	  System.out.println("Before");
  }
  @Given("^User navigates to home page$")
  public void given() throws Throwable {
	  
	  System.out.println("Driver Loaded");
  }

  @When("^The \"([^\"]*)\" and \"([^\"]*)\" is entered$")
  public void when(String username, String password) throws Throwable {
	  System.out.println("Username : " + username);
	  System.out.println("Password : " + password);
  }

  @Then("^Login Successful$")
  public void then() throws Throwable {
	  
	  System.out.println("Driver Closed");
  }
  
  @After
  public void after()
  {
	  System.out.println("After");
  }

}

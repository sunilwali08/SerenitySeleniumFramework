package cucumbersteps;

import java.util.List;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCarSteps {
	
	
	
	@Given("^user navigate to the website$")
	public void user_navigate_to_the_website() {
		
		
		System.out.println("@Given -- user navigate to the website");
	    
	}


	@When("^user choose menu as new cars$")
	public void user_choose_menu_as_new_cars() {
		
		
		System.out.println("@When -- user choose menu as new cars");
	    
	    
	}

	@Then("^user clicks on find new cars$")
	public void user_clicks_on_find_new_cars() {
		
		
		
		System.out.println("@Then -- user clicks on find new cars with price : ");
	 
	   
	}

	@And("^user search for (.*) car$")
	public void user_search_for_car(String brandName) {
	    

		System.out.println("@And -- user search for car: "+brandName);
	 
		
	}
	



}

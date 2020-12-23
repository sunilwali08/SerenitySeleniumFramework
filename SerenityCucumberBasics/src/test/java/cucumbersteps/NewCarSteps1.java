package cucumbersteps;

import java.util.List;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Steps;
import pages.HomePage;

public class NewCarSteps1 {

	@Steps
	HomePage homePage;

	@Given("^user navigate to Website$")
	public void user_navigate_to_Website() {
		homePage.openApplication();

	}

	@When("^user User navigates to new car menu$")
	public void user_choose_new_menu_as_a_new_car() {
		homePage.moveMouseToTarget();

	}

	@And("^user click on Find New Car$")
	public void user_click_on_new_car() {
		homePage.user_click_on_new_car();
	}

	

	
	@And("^User select the (.*) car$")
	public void user_select_the_car(String brandName) {
		homePage.selectCarBrand(brandName);
	}


	@And("^user validate the car title$")
	public void user_validate_the_car_title() {

	}
	
	
}

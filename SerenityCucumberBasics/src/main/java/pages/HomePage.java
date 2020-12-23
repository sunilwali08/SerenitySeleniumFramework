package pages;

import base.BasePage;
import cucumber.api.java.en.Then;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.thucydides.core.annotations.Step;
import pages.implementation.HomePageImp;




public class HomePage {

	HomePageImp homePageImp;
	
	@Step("Open Application")
	public void openApplication() {
		
		homePageImp.open();
	}
	

	@Step("Move Mouse to Target")
	public void moveMouseToTarget() {
		homePageImp.navigateToNewCar();
		
	}

	@Step("^user click on Find new car$")
	public void user_click_on_new_car() {
		homePageImp.clickOnFindNewCar();
	}

	@Step("^User search for(.*) car$")
	public void user_search_for_car(String brandName) {
		System.out.println("@Then\"^User search for car:" + brandName);
	}

	@Step("^User search for(.*) car$")
	public void selectCarBrand(String brandName) {
		
		homePageImp.selecTheCar(brandName);
	}


	public void verifybrandName(String brandName) {
		// TODO Auto-generated method stub
		
	}
	

}

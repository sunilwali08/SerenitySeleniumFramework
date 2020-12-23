package pages.implementation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.MoveMouseAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.thucydides.core.annotations.Step;

public class HomePageImp extends PageObject{
	@FindBy(xpath="//div[contains(text(),'NEW CARS')]")
	WebElementFacade newCarMenu;
		
	@FindBy(xpath="//*[@id=\"root\"]/div[1]/header/div/nav/ul/li[1]/div[2]/div/ul/a[1]/div/div")
	WebElementFacade findNewCar;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[3]/section[1]/div/div/div[1]/div/ul")
	WebElementFacade allBrands;
	
	

	public void navigateToNewCar() {
		
		
		withAction().moveToElement(newCarMenu).click().build().perform();
		

	}



	public void clickOnFindNewCar() {
		findNewCar.click();
	}



	public void selecTheCar(String brandName) {
		
		List<WebElementFacade> allBrandList = allBrands.thenFindAll("Li");
		for(WebElementFacade webElement:allBrandList ) {
			
			System.out.println(webElement.getText());
		}
		
	}




	

}

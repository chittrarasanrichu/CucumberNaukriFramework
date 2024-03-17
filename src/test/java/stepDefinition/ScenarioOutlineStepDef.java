package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ScenarioOutlineStepDef {
	@Given("launch the browser {string}")
	public void launch_the_browser(String string) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get(string);
	    
	}

	@When("Enter the location\"chennai\"")
	public void enter_the_location_chennai(String string) {
	    
	}

	@When("click on search button")
	public void click_on_search_button() {
		
	}

	@Then("verify the result")
	public void verify_the_result() {
	    
	}

}

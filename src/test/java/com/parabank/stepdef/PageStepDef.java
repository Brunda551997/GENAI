package com.parabank.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.parabank.pagefactory.ParabankPage;

public class PageStepDef {
    static WebDriver driver;
    ParabankPage parabankPage;
    
//    public PageStepDef() {
//		// TODO Auto-generated constructor stub
//	}
//   
//    
//    public PageStepDef(WebDriver driver) {
//    	this.driver = driver;	
//    }

    @Given("User is on the homepage of the Parabank application")
    public void user_is_on_the_homepage_of_the_parabank_application() {
    	driver = new ChromeDriver();
    	parabankPage = PageFactory.initElements(driver, ParabankPage.class);
        parabankPage.visitPage();
    }

    @When("User clicks on the Register option")
    public void user_clicks_on_the_register_option() {
        parabankPage.clickRegisterLink();
    }

    @SuppressWarnings("unchecked")
	@When("User fills in the required fields from fixture {string}")
    public void user_fills_in_the_required_fields_from_fixture(String fixtureName) {
    	ObjectMapper objectMapper = new ObjectMapper();
        Map<String, String> userData;
		try {
			userData = objectMapper.readValue(new File("C:\\Users\\BRUNMC\\Downloads\\GenAI_Hackathon_PB 1\\parabank_automation\\config\\registerpage.json"), Map.class);
			parabankPage.fillRegistrationForm(
	        		userData.get("firstName"),
	                userData.get("lastName"),
	                userData.get("address"),
	                userData.get("city"),
	                userData.get("state"),
	                userData.get("zipCode"),
	                userData.get("phoneNumber"),
	                userData.get("ssn"),
	                userData.get("username"),
	                userData.get("password"),
	        		userData.get("password"));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		parabankPage.submitRegistration();
    }

    @Then("User should be able to register successfully")
    public void user_should_be_able_to_register_successfully() {
    	parabankPage.regSuccess();
    }
}
   

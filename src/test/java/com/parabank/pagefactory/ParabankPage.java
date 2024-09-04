package com.parabank.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;


public class ParabankPage {
	
    WebDriver driver;
    WebDriverWait wait;
    

    @FindBy(xpath = "//a[text()='Register']" )
    WebElement registerLink;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    WebElement lastName;

    @FindBy(xpath="//input[@id='customer.address.street']")
    WebElement addressStreet;

    @FindBy(xpath="//input[@id='customer.address.city']")
    WebElement addressCity;

    @FindBy(xpath="//input[@id='customer.address.state']")
    WebElement addressState;

    @FindBy(xpath="//input[@id='customer.address.zipCode']")
    WebElement addressZipCode;

    @FindBy(xpath="//input[@id='customer.phoneNumber']")
    WebElement phoneNumber;

    @FindBy(xpath="//input[@id='customer.ssn']")
    WebElement ssn;

    @FindBy(xpath="//input[@id='customer.username']")
    WebElement username;

    @FindBy(xpath="//input[@id='customer.password']")
    WebElement password;

    @FindBy(xpath="//input[@id='repeatedPassword']")
    WebElement confirm;

    @FindBy(xpath="//input[@value='Register']")
    WebElement registerButton;

    @FindBy(xpath="//a[normalize-space()='Log Out']")
    WebElement logoutButton;

    @FindBy(xpath="//p[text()='Your account was created successfully. You are now logged in.']")
    		WebElement successReg;
    
    
    public ParabankPage(WebDriver driver) {
        this.driver = driver;
//        		new ChromeDriver();
    }

    public void visitPage() {
//    	driver = new ChromeDriver();
        driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
//        driver.manage().window().maximize();
    }

    public void clickRegisterLink() {
        registerLink.click();
    }

    public void fillRegistrationForm(String fName, String lName, String address,
    		String City, String State, String ZipCode, 
    		String phoneNum, String customerssn, String uname, String pass, String decision) {
    	
    	firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        addressStreet.sendKeys(address);
        addressCity.sendKeys(City);
        addressState.sendKeys(State);
        addressZipCode.sendKeys(ZipCode);
        phoneNumber.sendKeys(phoneNum);
        ssn.sendKeys(customerssn);
        username.sendKeys(uname);
        password.sendKeys(pass);
        confirm.sendKeys(decision);
    }
    


    public void submitRegistration() {
        registerButton.click();
    }

    public void logout() {
        // Implement logout method

        this.logoutButton.click();
    }

    public void regSuccess(){
            
            // assertion using if loop or assert

            boolean success= successReg.isDisplayed();
              if(success){
                   System.out.println("Registration successful");
         }
         else{
             System.out.println("Registration failed");
         }
    }
}

	



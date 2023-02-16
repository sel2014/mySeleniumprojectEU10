package com.cydeo.myPracticePages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUserPage {

    public RegisterUserPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(tagName = "h1")
    public WebElement pageTitle;

    @FindBy(xpath = "//a[@href='/login'] ")
    public WebElement SignupLoginButton;

    @FindBy(xpath = "//*[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameBox;

    @FindBy(xpath = "(//input[@placeholder='Email Address'])[2]")
    public WebElement emailBox;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "(//*[.='Enter Account Information'])[2]")
    public WebElement enterAccountInformation;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement titleMr;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='newsletter']")
    public WebElement newsLetterBox;

    @FindBy(xpath = "//*[@id='optin']")
    public WebElement specialOffersBox;

    //12. Fill details: First name, Last name, Company, Address,
    // Address2, Country, State, City, Zipcode, Mobile Number

    @FindBy(xpath = "//input[@id='first_name']")
    public WebElement firstNameBox;

    @FindBy(xpath = "//input[@id='last_name']")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@id='company']")
    public WebElement companyBox;

    @FindBy(xpath = "//input[@id='address1']")
    public WebElement address1Box;

    @FindBy(xpath = "//input[@id='address2']")
    public WebElement address2Box;


    @FindBy(xpath = "//input[@id='state']")
    public WebElement stateBox;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityBox;

    @FindBy(xpath = "//input[@id='zipcode']")
    public WebElement zipCodeBox;

    @FindBy(xpath = "//input[@id='mobile_number']")
    public WebElement mobileNumberBox;

    @FindBy(xpath = "//*[.='Create Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement accountCreatedMessage;

    @FindBy(xpath = "(//a[@href='/'])[3]")
    public WebElement continueButton;











}

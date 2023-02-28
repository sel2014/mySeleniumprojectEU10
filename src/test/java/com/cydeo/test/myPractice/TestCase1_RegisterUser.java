package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.AutomationPracticePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1_RegisterUser {

    AutomationPracticePage automationPracticePage;


    @BeforeMethod
    public void setupMethod() {

        Driver.getDriver().get("https://www.automationexercise.com/");
        automationPracticePage = new AutomationPracticePage();
    }


    @Test
    public void register_user() {

        Faker faker = new Faker();

        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationPracticePage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button
        automationPracticePage.signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(automationPracticePage.newUserSignup.isDisplayed());
        //System.out.println(registerUserPage.NewUserSignup.getText());

        //6. Enter name and email address
        automationPracticePage.nameBox.sendKeys(faker.name().fullName());
        BrowserUtils.sleep(1);

        automationPracticePage.newUserEmailBox.sendKeys("my11@email.com");
        BrowserUtils.sleep(1);

        //7. Click 'Signup' button
        automationPracticePage.signupButton.click();
        BrowserUtils.sleep(1);

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(automationPracticePage.enterAccountInformation.isDisplayed());
        //System.out.println(registerUserPage.enterAccountInformation.getText());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        automationPracticePage.titleMr.click();

        automationPracticePage.password.sendKeys("password");

        Select day = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='days']")));
        day.selectByIndex(4);


        Select month = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='months']")));
        month.selectByVisibleText("February");

        Select year = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='years']")));

        year.selectByVisibleText("2000");

        //10. Select checkbox 'Sign up for our newsletter!
        automationPracticePage.newsLetterBox.click();

        //11. Select checkbox 'Receive special offers from our partners!
        automationPracticePage.specialOffersBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2,
        // Country, State, City, Zipcode, Mobile Number

        automationPracticePage.firstNameBox.sendKeys(faker.name().firstName());

        automationPracticePage.lastNameBox.sendKeys(faker.name().lastName());

        automationPracticePage.companyBox.sendKeys("Company");

        automationPracticePage.address1Box.sendKeys("address1");

        automationPracticePage.address2Box.sendKeys("address2");

        Select country = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='country']")));

        country.selectByVisibleText("Canada");

        automationPracticePage.stateBox.sendKeys("State");

        automationPracticePage.cityBox.sendKeys("City");
        automationPracticePage.zipCodeBox.sendKeys("Zipcode");
        automationPracticePage.mobileNumberBox.sendKeys("01223456456");

        //13. Click 'Create Account button
        automationPracticePage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible

        System.out.println(automationPracticePage.accountCreatedMessage.getText());
        Assert.assertTrue(automationPracticePage.accountCreatedMessage.isDisplayed());
        BrowserUtils.sleep(2);

        //15. Click 'Continue' button
        automationPracticePage.continueButton.click();


        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick().perform();
        actions.doubleClick().perform();
        // actions.click().perform();


        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationPracticePage.loggedInAsUserNameText.isDisplayed());

//        17. Click 'Delete Account' button
//
//        registerUserPage.deleteAccountButton.click();

//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
//        Assert.assertTrue(registerUserPage.accountDeletedMessage.isDisplayed());
//        registerUserPage.continueButton.click();


    }
}





















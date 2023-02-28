package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.AutomationPracticePage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3_LoginUser {

    AutomationPracticePage automationPracticePage = new AutomationPracticePage();

    @Test
    public void login_with_incorrect_credentials(){

        Faker faker = new Faker();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Assert.assertTrue(automationPracticePage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button
        automationPracticePage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());

        //6. Enter incorrect email address and password

        automationPracticePage.loginEmailBox.sendKeys(faker.internet().emailAddress());
        automationPracticePage.loginPassword.sendKeys(faker.internet().password());

        //7. Click 'login' button

        automationPracticePage.loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible

        Assert.assertTrue(automationPracticePage.yourEmailOrPasswordIsIncorrectMessage.isDisplayed());
    }


}

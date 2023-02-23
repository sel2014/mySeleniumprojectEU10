package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.RegisterUserPage;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3_LoginUser {

    RegisterUserPage registerUserPage = new RegisterUserPage();

    @Test
    public void login_with_incorrect_credentials(){

        Faker faker = new Faker();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully
        Assert.assertTrue(registerUserPage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button
        registerUserPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(registerUserPage.loginToYourAccountText.isDisplayed());

        //6. Enter incorrect email address and password

        registerUserPage.loginEmailBox.sendKeys(faker.internet().emailAddress());
        registerUserPage.loginPassword.sendKeys(faker.internet().password());

        //7. Click 'login' button

        registerUserPage.loginButton.click();

        //8. Verify error 'Your email or password is incorrect!' is visible

        Assert.assertTrue(registerUserPage.yourEmailOrPasswordIsIncorrectMessage.isDisplayed());
    }


}

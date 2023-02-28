package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.AutomationPracticePage;
import com.cydeo.myPracticePages.AutomationPracticePage2;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase4_LogoutUser {


    @Test
    public void logout() {

        AutomationPracticePage automationPracticePage = new AutomationPracticePage();
        AutomationPracticePage2 automationPracticePage2 = new AutomationPracticePage2();


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get("http://automationexercise.com");
        //3. Verify that home page is visible successfully

        Assert.assertTrue(automationPracticePage.pageTitle.isDisplayed());
        //4. Click on 'Signup / Login' button

        automationPracticePage.signupLoginButton.click();
        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(automationPracticePage.loginToYourAccountText.isDisplayed());
        //6. Enter correct email address and password
        automationPracticePage.loginEmailBox.sendKeys("my11@email.com");
        automationPracticePage.loginPassword.sendKeys("password");

        //7. Click 'login' button
        automationPracticePage.loginButton.click();

        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(automationPracticePage.loggedInAsUserNameText.isDisplayed());

        //9. Click 'Logout' button
        automationPracticePage2.logoutButton.click();

        //10. Verify that user is navigated to login page

        Assert.assertTrue(automationPracticePage.loginPageTitle.isDisplayed());
    }
}
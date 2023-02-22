package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.RegisterUserPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_LoginUser  {

    RegisterUserPage registerUserPage = new RegisterUserPage();

    @Test
    public void login_with_correct_email() {


        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

        //3. Verify that home page is visible successfully

        Assert.assertTrue(registerUserPage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button

        registerUserPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(registerUserPage.loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
        registerUserPage.loginEmailBox.sendKeys("my7@email.com");

        registerUserPage.loginPassword.sendKeys("password");
        //7. Click 'login' button

        registerUserPage.loginButton.click();
        //8. Verify that 'Logged in as username' is visible
        Assert.assertTrue(registerUserPage.loggedInAsUserNameText.isDisplayed());

        //9. Click 'Delete Account' button
        registerUserPage.deleteAccountButton.click();

        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick().perform();
        actions.doubleClick().perform();
        actions.click();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertTrue(registerUserPage.accountDeletedMessage.isDisplayed());










    }

}

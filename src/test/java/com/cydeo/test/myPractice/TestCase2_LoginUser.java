package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.RegisterUserPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2_LoginUser {


    @Test
    public void login_with_correct_email() {

        RegisterUserPage registerUserPage = new RegisterUserPage();

        // 2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("https://www.automationexercise.com/");

        //3. Verify that home page is visible successfully
        // Assert.assertTrue(registerUserPage.pageLogo.isDisplayed()); if page logo is visible, home page
        // is also visible

        String homePageTitle = Driver.getDriver().getTitle();
        System.out.println(homePageTitle);
        Assert.assertTrue(homePageTitle.equals("Automation Exercise"));

        //4. Click on 'Signup / Login' button
        registerUserPage.signupLoginButton.click();

        //5. Verify 'Login to your account' is visible
        Assert.assertTrue(registerUserPage.loginToYourAccountText.isDisplayed());

        //6. Enter correct email address and password
        registerUserPage.loginEmailBox.sendKeys("new80@email.com");
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
        actions.click().perform();

        //10. Verify that 'ACCOUNT DELETED!' is visible
        Assert.assertTrue(registerUserPage.accountDeletedMessage.isDisplayed());

    }

}

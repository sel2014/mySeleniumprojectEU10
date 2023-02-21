package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.RegisterUserPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUser {

    RegisterUserPage registerUserPage;


    @BeforeMethod
    public void setupMethod() {

        Driver.getDriver().get("https://www.automationexercise.com/");
        registerUserPage = new RegisterUserPage();
    }

    @Test
    public void register_user() {

        //3. Verify that home page is visible successfully
        Assert.assertTrue(registerUserPage.pageTitle.isDisplayed());

        //4. Click on 'Signup / Login' button
        registerUserPage.signupLoginButton.click();

        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(registerUserPage.newUserSignup.isDisplayed());
        //System.out.println(registerUserPage.NewUserSignup.getText());

        //6. Enter name and email address
        registerUserPage.nameBox.sendKeys("Name Surname");
        BrowserUtils.sleep(1);
        registerUserPage.newUserEmailBox.sendKeys("new109@email.com");
        BrowserUtils.sleep(1);


        //7. Click 'Signup' button
        registerUserPage.signupButton.click();
        BrowserUtils.sleep(1);

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        Assert.assertTrue(registerUserPage.enterAccountInformation.isDisplayed());
        //System.out.println(registerUserPage.enterAccountInformation.getText());

        //9. Fill details: Title, Name, Email, Password, Date of birth
        registerUserPage.titleMr.click();

        registerUserPage.password.sendKeys("password");


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
        registerUserPage.newsLetterBox.click();

        //11. Select checkbox 'Receive special offers from our partners!
        registerUserPage.specialOffersBox.click();

        //12. Fill details: First name, Last name, Company, Address, Address2,
        // Country, State, City, Zipcode, Mobile Number
        registerUserPage.firstNameBox.sendKeys("Name");
        registerUserPage.lastNameBox.sendKeys("Surname");
        registerUserPage.companyBox.sendKeys("Company");
        registerUserPage.address1Box.sendKeys("address1");
        registerUserPage.address2Box.sendKeys("address2");

        Select country = new Select(Driver.getDriver().findElement
                (By.xpath("//select[@id='country']")));

        country.selectByVisibleText("Canada");

        registerUserPage.stateBox.sendKeys("State");

        registerUserPage.cityBox.sendKeys("City");
        registerUserPage.zipCodeBox.sendKeys("Zipcode");
        registerUserPage.mobileNumberBox.sendKeys("01223456456");

        //13. Click 'Create Account button
        registerUserPage.createAccountButton.click();

        //14. Verify that 'ACCOUNT CREATED!' is visible

        System.out.println(registerUserPage.accountCreatedMessage.getText());
        Assert.assertTrue(registerUserPage.accountCreatedMessage.isDisplayed());

        //15. Click 'Continue' button
        registerUserPage.continueButton.click();



       // WebElement iframe = Driver.getDriver().findElement(By.tagName(ad_iframe));
        // Driver.getDriver().switchTo().frame("ad_iframe");
        // registerUserPage.dismissButton.click();



        Actions actions = new Actions(Driver.getDriver());

        actions.doubleClick().perform();
        actions.doubleClick().perform();
        actions.click().perform();





        //16. Verify that 'Logged in as username' is visible
        Assert.assertTrue(registerUserPage.loggedInAsUserNameText.isDisplayed());

        //17. Click 'Delete Account' button

        registerUserPage.deleteAccountButton.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Assert.assertTrue(registerUserPage.accountDeletedMessage.isDisplayed());
        registerUserPage.continueButton.click();



















    }
}





















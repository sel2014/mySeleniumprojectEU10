package com.cydeo.test.day13_review_and_practices;

import com.cydeo.pages.DynamicControlPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    DynamicControlPage dynamicControlPage;  //wil  be using in other tests

    @BeforeMethod

    public void setupMethod(){

        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls ");

        dynamicControlPage = new DynamicControlPage();
    }

    @Test
    public void remove_button_test(){


        //3- Click to “Remove” button

        dynamicControlPage.removeButton.click();

        //4- Wait until “loading bar disappears”

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.invisibilityOf(dynamicControlPage.loadingBar));
        //5- Verify:
        //a. Checkbox is not displayed

        try {

            Assert.assertFalse(dynamicControlPage.checkBox.isDisplayed());

        }catch (NoSuchElementException n){

            Assert.assertTrue(true);
        }




        //b. “It’s gone!” message is displayed.

        Assert.assertTrue(dynamicControlPage.itIsGoneMessage.isDisplayed());

        Assert.assertTrue(dynamicControlPage.itIsGoneMessage.getText().equals("It's gone!"));

    }
}

package com.cydeo.test.myPractice;

import com.cydeo.myPracticePages.Day4_Task3Page;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_Task3_Practice_POM {

    @Test
    public void verify_displayed_text(){

        Day4_Task3Page practiceCydeoPage = new Day4_Task3Page();

        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");

        practiceCydeoPage.buttonOne.click();

        Assert.assertTrue(practiceCydeoPage.clickedOnButtonOneMessage.isDisplayed());








    }
}

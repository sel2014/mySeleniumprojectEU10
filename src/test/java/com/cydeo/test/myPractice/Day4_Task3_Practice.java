package com.cydeo.test.myPractice;

import com.cydeo.myPages.Day4_Task3;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4_Task3_Practice {

    @Test
    public void verify_displayed_text(){

        Day4_Task3 practiceCydeoPage = new Day4_Task3();

        Driver.getDriver().get("http://practice.cydeo.com/multiple_buttons");

        practiceCydeoPage.buttonOne.click();

        Assert.assertTrue(practiceCydeoPage.clickedOnButtonOneMessage.isDisplayed());




    }
}

package com.cydeo.test.day5_tastNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) {


        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/add_remove_elements/

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3. Click to “Add Element” button
        //4. Verify “Delete” button is displayed after clicking.
        //5. Click to “Delete” button.
        //6. Verify “Delete” button is NOT displayed after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

    }

}

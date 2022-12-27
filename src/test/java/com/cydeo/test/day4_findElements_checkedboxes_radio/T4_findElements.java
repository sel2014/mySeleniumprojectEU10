package com.cydeo.test.day4_findElements_checkedboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {


        //TC #4: FindElements Task
        //1- Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //providing extra wait for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest

        driver.get("https://practice.cydeo.com/abtest ");

        //3- Locate all the links in the page.


        //4- Print out the number of the links on the page.
        //5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links


    }
}

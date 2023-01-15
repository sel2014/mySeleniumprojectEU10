package com.cydeo.test.myPractice;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LinkCount {


    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        String browserType = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void LinkCount(){

        driver.get("https://www.openxcell.com");

        List<WebElement>links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

        Assert.assertEquals(links.size(), 355);

        System.out.println("-----------------------------------------------------------");

        int noTextLink = 0;

        for (WebElement eachLink : links) {

           // System.out.println(eachLink.getText());


            if (!(eachLink.getText().isEmpty())){

                noTextLink++;
            }

        }
        System.out.println(noTextLink);

        int expectedNoTextLink = 97;

        Assert.assertEquals(noTextLink, expectedNoTextLink);



    }


}

/*
TC #1: Checking the number of links on the page
1. Open Chrome browser
2. Go to https://www.openxcell.com
3. Count the number of the links on the page and verify
Expected: 332
 */

/*
TC #2: Printing out the texts of the links on the page
1. Open Chrome browser
2. Go to https://www.openxcell.com
3. Print out all of the texts of the links on the page
 */

/*
TC #3: Counting the number of links that does not have text
1. Open Chrome browser
2. Go to https://www.openxcell.com
3. Count the number of links that does not have text and verify
Expected: 109
 */

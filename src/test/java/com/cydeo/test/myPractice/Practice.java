package com.cydeo.test.myPractice;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

   /* @AfterMethod
    public void tearDown(){
    }
    */

    @Test
    public void multipleSelect(){

        driver.get("https://practice.cydeo.com/dropdown");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));



        List<WebElement>allOptions = select.getOptions();
        for (WebElement eachOption : allOptions) {

            System.out.println(eachOption.getText());

        }


    }


}

/*
TC #8: Selecting value from multiple select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Select all the options from multiple select dropdown.
4. Print out all selected values.
5. Deselect all values.
 */

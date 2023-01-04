package com.cydeo.test.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T8_multipleSelectDropdown {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Open Chrome browser

    }

    @Test
    public void multipleSelect(){
        //TC #8: Selecting value from multiple select dropdown

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");


        //3. Select all the options from multiple select dropdown.
        //4. Print out all selected values.
        //5. Deselect all values.

        Select simpleDropdown = new Select(driver.findElement(By.xpath("" +
                "//select[@id='dropdown']")));

       // System.out.println("simpleDropdown.getFirstSelectedOption() = " +
               // simpleDropdown.getFirstSelectedOption().getText());


         List<WebElement> allOptions = simpleDropdown.getOptions();
        for (WebElement eachOption : allOptions) {

            System.out.println(eachOption.getText());

        }

       // System.out.println(allOptions);


    }









}

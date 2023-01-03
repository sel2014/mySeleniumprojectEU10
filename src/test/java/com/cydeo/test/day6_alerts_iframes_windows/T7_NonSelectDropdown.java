package com.cydeo.test.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_NonSelectDropdown {

     WebDriver driver;
    @BeforeMethod
    public void setupMethod(){

        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        // 2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown ");
    }

    @Test

    public void nonSelectDropdown(){
        // 3. Click to non-select dropdown

        WebElement nonSelectDropDown = driver.findElement(By.xpath("//a[@class =" +
                " 'btn btn-secondary dropdown-toggle']"));

        nonSelectDropDown.click();


        //4. Select Facebook from dropdown
        WebElement facebookButton = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookButton.click();

        WebElement cookiesButton = driver.findElement(By.xpath("//button[@title='Allow " +
                "essential and optional cookies']"));
        cookiesButton.click();



        //5. Verify title is “Facebook - log in or Sign Up”

        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }





}

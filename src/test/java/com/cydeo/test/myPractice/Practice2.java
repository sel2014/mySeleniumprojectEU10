package com.cydeo.test.myPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Practice2 {
    WebDriver driver;

   @BeforeMethod
    public void setupMethod(){

       driver = WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }



    @Test
    public void testTitle() {

       driver.get("https://practice.cydeo.com/windows");

       String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

       Assert.assertEquals(driver.getTitle(), "Windows");

       WebElement clickHereButton = driver.findElement(By.xpath("" +
               "//*[@id='content']/div/a"));
       clickHereButton.click();

        Set<String>allWindowHandles = driver.getWindowHandles();

        for (String eachHandle : allWindowHandles) {

            driver.switchTo().window(eachHandle);


        }
        String expectedTitle = "New Window";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        System.out.println(driver.getWindowHandle());

        driver.switchTo().window(mainHandle);
        System.out.println(mainHandle);



   }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}



/*
TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”
 */

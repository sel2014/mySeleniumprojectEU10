package com.cydeo.test.myPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice1 {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @Test(priority = 2)
    public void iframe_test(){

        driver.get("https://practice.cydeo.com/iframe");

        //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        driver.switchTo().frame(0);
        WebElement yourContentGoesHereElement = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereElement.isDisplayed());
        Assert.assertEquals(yourContentGoesHereElement.getText(), "Your content goes here.");


        driver.switchTo().parentFrame();

       // WebElement newMessageElement = driver.findElement(By.xpath("An iFrame containing the " +
              //  "TinyMCE WYSIWYG Editor"));
    }

    @Test(priority = 1)
    public void displayMessage(){

        driver.get("https://practice.cydeo.com/iframe");

        WebElement headerTextElement = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerTextElement.isDisplayed());

        Assert.assertEquals("An iFrame containing the TinyMCE WYSIWYG Editor",
                headerTextElement.getText());

    }
   @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

/*
TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
 */

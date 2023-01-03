package com.cydeo.test.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: http://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");

    }
   // @Ignore  TEST DOES NOT RUN
    @Test
    public void iframe_test(){

        //we need to switch driver's focus to iframe
        //option 1 - switching iframe using id attribute value
       // driver.switchTo().frame("mce_0_ifr");

        //OPTION 2 PASSING INDEX NUMBER OF iframe
       // driver.switchTo().frame(0);  //iframe to search how many iframes we have in html, type //iframe in search box

        //3. Go to: https://practice.cydeo.com/iframe
        //4. Assert: “Your content goes here.” Text is displayed.
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”

        //last option
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));



        //locate the p element
        WebElement yourContentGoesHereElement = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereElement.isDisplayed());

        // Verify "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        // we must switch back to main html from iframe

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        Assert.assertTrue(headerText.isDisplayed());

    }



}

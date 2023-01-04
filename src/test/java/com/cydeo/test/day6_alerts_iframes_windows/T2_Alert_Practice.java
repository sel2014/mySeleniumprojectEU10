package com.cydeo.test.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T2_Alert_Practice {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){

         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void alert_T2() throws InterruptedException {
        //TC #2: Confirmation alert practice
        //1. Open browser
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Confirm” button
        WebElement clickForJSConfirmButton = driver.findElement(By.xpath("//button[.='Click for " +
                "JS Confirm']"));
        Thread.sleep(2000);
        clickForJSConfirmButton.click();
        Thread.sleep(2000);

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();


        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultMessage = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedMessage = "You clicked: Ok";
        String actualMessage = resultMessage.getText();

        Assert.assertEquals(actualMessage,expectedMessage);


    }












}

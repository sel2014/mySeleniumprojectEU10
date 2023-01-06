package com.cydeo.test.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_Alert_Practice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //1. Open browser
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void alert_T3() throws InterruptedException {

        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");

        //3. Click to “Click for JS Prompt” button
        WebElement clickForJSPromptButton = driver.findElement(By.xpath("//button" +
                "[.='Click for JS Prompt']"));
        clickForJSPromptButton.click();

        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        Thread.sleep(2000);
        alert.accept();

        //6. Verify “You entered:  hello” text is displayed.

        WebElement resultMessage = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedMessage = "You entered: hello";
        String  actualMessage = resultMessage.getText();

        System.out.println("expectedMessage = " + expectedMessage);
        System.out.println("actualMessage = " + actualMessage);

        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @AfterMethod
    public void afterMethod(){

        driver.close();
    }



}

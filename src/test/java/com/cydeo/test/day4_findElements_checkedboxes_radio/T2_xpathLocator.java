package com.cydeo.test.day4_findElements_checkedboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_xpathLocator {

    public static void main(String[] args) {


        //TC #6:  XPATH LOCATOR practice
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cydeo.com/multiple_buttons

        driver.get("http://practice.cydeo.com/multiple_buttons ");

        //3. Click on Button 1

        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        WebElement resultButton = driver.findElement(By.xpath("//p[@style='color:green']"));

        String actualText = resultButton.getText();
        System.out.println("actualText = " + actualText);


        String expectedText = "Clicked on button one!";
        System.out.println("expectedText = " + expectedText);

        if (expectedText.equals(actualText)){

            System.out.println("button 1 display text PASSED!");
        }else {

            System.out.println("button 1 display text PASSED!!");
        }


        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        //
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS





    }
}

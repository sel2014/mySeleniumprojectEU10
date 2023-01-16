package com.cydeo.test.myPractice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SmartBearUtility {

    public  static  void loginToSmartBear(String driver, String username, String password){

        WebElement usernameButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_username']"));
        usernameButton.sendKeys(username);

        WebElement passwordButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_password']"));
        passwordButton.sendKeys(password);

        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_login_button']"));


        loginButton.click();

    }








}



/*
Mini-Task: CREATE A CLASS à SmartBearUtils
• Create a method called loginToSmartBear
• This method simply logs in to SmartBear when you call it.
• Accepts WebDriver type as parameter
 */

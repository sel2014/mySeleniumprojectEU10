package com.cydeo.test.day2_locators_getText_getAttributes.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

    public static void main(String[] args) {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com ");

        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/" +
                "div/div/div[3]/button[2]")).click();
        //3. Enter incorrect username
        WebElement usernameBox = driver.findElement(By.id("email"));
        usernameBox.sendKeys("ssskk@hmail.com");
        //4. Enter incorrect password
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("invalidpassword");

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/" +
                "div[1]/div/div/div/div[2]/div/" +
                "div[1]/form/div[2]/button"));
        loginButton.click();
        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle = "Facebook – log in or sign up";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedTitle = " + expectedTitle);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!");
        }



    }
}

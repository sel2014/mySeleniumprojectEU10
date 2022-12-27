package com.cydeo.test.day2_locators_getText_getAttributes.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_03_BackAndForth {


    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://google.com");

        driver.findElement(By.id("L2AGLb")).click(); // pop up
        //3- Click to Gmail from top right.

     WebElement headerTitle =  driver.findElement(By.className("gb_j"));
     headerTitle.click();

     //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }


        //5- Go back to Google by using the .back();

        driver.navigate().back();
        //6- Verify title equals:

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equals(expectedTitle2)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }



        //  Expected: Google




    }
}

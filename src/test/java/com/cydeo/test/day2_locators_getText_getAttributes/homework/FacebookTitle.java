package com.cydeo.test.day2_locators_getText_getAttributes.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTitle {

    public static void main(String[] args) {



        //TC #1: Facebook title verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com ");
        //3. Verify title:
        WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        cookiesButton.click();


        //Expected: “Facebook - log in or sign Up”

        String expectedTitle  = "Facebook – log in or sign up";

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASS!");
        }else {
            System.out.println("Title verification FAILED!");
        }




    }
}

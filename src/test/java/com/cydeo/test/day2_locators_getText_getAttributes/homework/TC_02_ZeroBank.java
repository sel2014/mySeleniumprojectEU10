package com.cydeo.test.day2_locators_getText_getAttributes.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02_ZeroBank {
    public static void main(String[] args) {


        //TC #2: Zero Bank header verification
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html ");


        //3. Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        System.out.println("expectedHeaderText = " + expectedHeaderText);
        System.out.println("actualHeaderText = " + actualHeaderText);

        //Expected: “Log in to ZeroBank”

        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.out.println("Title verification FAILED!!!");
        }





    }
}

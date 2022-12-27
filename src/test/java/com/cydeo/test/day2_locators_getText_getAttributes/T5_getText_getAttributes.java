package com.cydeo.test.day2_locators_getText_getAttributes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttributes {

    public static void main(String[] args) {

        //TC #5: getText() and getAttribute() method practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form ");

        //3- Verify header text is as expected:
        WebElement headerText = driver.findElement(By.tagName("h2"));  //this is a web element
        //  Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText(); // WILL RETURN "Registration form"

        if (actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header test verification PASSED!");
        }else {

            System.out.println("Header test verification FAILED!!");
        }


        //4- Locate “First name” input box
        //we are locating web element using 'name' locator
        // name attribute has "first name" value
        WebElement firstNameInput = driver.findElement(By.name("firstname")); // web element


        //5- Verify placeholder attribute’s value is as expected;
        // Expected: first name
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if (actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification PASSED!");
        }else {
            System.out.println("Placeholder text verification FAILED!!");
        }

        driver.close();


    }
}

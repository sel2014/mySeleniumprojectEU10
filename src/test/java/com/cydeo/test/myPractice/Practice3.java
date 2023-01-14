package com.cydeo.test.myPractice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice3 {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void locateElement() {

        driver.get("https://www.flipkart.com/");

        WebElement logInXButton = driver.findElement(By.xpath("//button[@class=" +
                "'_2KpZ6l _2doB4z']"));

        logInXButton.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

        searchBox.click();

        WebElement tshirtOption = driver.findElement(By.xpath("(//li[@class='Y5N33s'])[4]"));

        tshirtOption.click();

    }

}

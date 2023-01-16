package com.cydeo.test.myPractice;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SmartBearPractice {

    WebDriver driver;

    @BeforeMethod

    public void setupMethod() {

        String browserType = ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void linkVerification(){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        WebElement usernameButton = driver.findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_username']"));
        WebElement passwordButton = driver.findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id=" +
                "'ctl00_MainContent_login_button']"));

        usernameButton.sendKeys("Tester");
        passwordButton.sendKeys("test");

        loginButton.click();

        List<WebElement>links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

        System.out.println("-----------------------------------------------");

        for (WebElement eachLink : links) {

            System.out.println("eachLink.getText() = " + eachLink.getText());

        }

    }


}




/*
TC #1: Smartbear software link verification
1. Open browser
2. Go to website:
http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page
 */
